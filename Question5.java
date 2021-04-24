import java.util.Scanner;



public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.println("Enter Integer:");

    int enter =  in.nextInt();
    
    	int [] a=new int[enter];
	    int [] b=new int[enter];
      int maxValue = 0;
      int maxCount = 0;
      for (int i=0;i<enter;i++ ){


       System.out.println("Enter Number:");

       System.out.println("");

       a[i] = in.nextInt();

     
     






    }
    
     for(int j = 0; j < enter; j++) {
         
           int count  = 0;

           for(int k = 0; k < enter; k++) {
              
              if (a[k] == a[j]){

               count++;

              }
             
             if(count>maxCount){


               maxValue = a[j];
               maxCount = count;
             }
               

           }
          
           
            
          
            

     }
    

     System.out.println(maxValue);
  }
}
