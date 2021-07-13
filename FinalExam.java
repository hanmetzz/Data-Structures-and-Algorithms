public class FinalExam {

/* Three-way heap and heapsort
 * Date supplied in array declaration
 * Children of parent i are 3i-1, 3i, and 3i+1
 * Parent of child j is (j+1)/3
*/
  
  private int size;
  private int [] data;
  
  public FinalExam() //constructor
  {
      data = new int[14];
      size = 0;
  }

  public boolean isEmpty()
  { 
  
  }
 
  //display method for FinalExam object to use
  public void display()
  {

  }  
   
  public boolean add(int elt)
  {

  }
 
  private int percolateUp(int hole, int elt)
  {

  }
 
  public int remove()
  {
 
  }
 
  private int percolateDown(int hole, int elt)
  {
      
  }
    
}// FinalExam class

class Container //for other display and main methods
{ 
    //display method for arrays (notFinalExam object)
    public static void display(int [] array)
    {
       
    }
    

    public static void main(String[] args) throws Exception {
        int []A ={14,34,12,28,100,23,46,16,22,11,89,78,26};
        System.out.println("Array:");  display(A);

        FinalExam H = new FinalExam();
                
        System.out.println("===================================="); 
        System.out.println("Add to Heap:");
        // create the heap
        // FILL IN CODE HERE!
         
        System.out.println("====================================");
        System.out.println("Remove from Heap:");
        // remove one-by-one, putting back into array
        //FILL IN CODE HERE!
        
        System.out.println("Array:"); display(A);
    }//main
}//container
