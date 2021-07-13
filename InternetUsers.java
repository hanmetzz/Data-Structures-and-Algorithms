/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Hannah
 */
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class InternetUsers {
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner stdln = new Scanner(new File("C:/CountrySortedAlpha.txt"));
        PrintWriter out = new PrintWriter("C:/CountryUnsortedAlpha.txt");
        Scanner kb = new Scanner(System.in);
        
        String[] impLine = new String[201];
        String[]line = new String[201];
        String[] popArray = new String[201];
        int[] popNum = new int[201];
        int[] asciiArr = new int[250];
        String country = " ";
        int i = 0;
        
        while(stdln.hasNextLine()){
            impLine[i] = stdln.nextLine();
         
            popArray[i] = impLine[i].substring(impLine[i].length() - 2, impLine[i].length());
            line[i] = impLine[i].substring(0, impLine[i].length() - 3);
            
            popNum[i] = Integer.parseInt(popArray[i].trim());
            
            System.out.print(line[i]);
            System.out.println(popArray[i]);
            
            i++;
        }
        
        for(int k = 0; k < 201; k++) {
            int where = (int)(Math.random() * 201 + 0);
            
            out.print(impLine[where]);
        }
        
        int m;
        for(int gap = popNum.length / 5; gap > 0; gap /= 5){
                for (int t = gap; t < popNum.length; t++){
                    int tmp = popNum[t];
                    String tmpStr = line[t];
                    for(m = t; m >= gap && (tmp < (popNum[m - gap])); m -= gap){
                            popNum[m] = popNum[m - gap];
                            line[m] = line[m-gap];
                        }
                        popNum[m] = tmp;
                        line[m] = tmpStr;       
                }
        }
    
        for(int q = popNum.length - 1; q > 0; q--){
            System.out.println(popNum[q] + " " + line[q]);
        }
        
        int s;
        int ascii = 0;
        
        String[][] hashTbl = new String[250][2];
        
        for(int v = 0; v < 250; v++){
            for(int w = 0; w < 2; w++)
                hashTbl[v][w] = "0";
        }
        for(int t = 0; t < 201; t++){
            
            for(s = 0; s < line[t].length(); s++){
                char a = line[t].charAt(s);
                ascii += (int)a;    
            }
                ascii = ascii % 250;
                if(hashTbl[ascii][0].equals(0)) {
                    do {
                    ascii ++;
                    if(ascii == 251)
                        ascii = 0;
                    }while(!hashTbl[ascii][0].equals(0));
                }
                hashTbl[ascii][0] = Integer.toString(ascii);
                hashTbl[ascii][1] = line[t];
                asciiArr[t] = ascii;
                System.out.println(line[t] + popNum[t] + " hash to: "+ ascii);      
        } 
        for(int v = 0; v < 201; v++){
            line[v] = line[v].trim();
        } 
        while(!country.equals("-1")){
            System.out.print("Enter a country [type -1 if done]: ");
            country = kb.nextLine();
            
            int a = 0;
            while(a < 201){
                if(line[a].equals(country)){
                    System.out.println(asciiArr[a] + ": " + country);
                    break;
                }
                else
                    a++;
            }
        }
    } //end MAIN
}
