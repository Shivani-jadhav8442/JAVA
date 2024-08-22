/*public class search {// Java program to implement linear
    // search in unsorted arrays
    
    
    
         // Function to implement
        // search operation
        static int findElement(int arr[], int n, int key)
        {
            for (int i = 0; i < n; i++)
                if (arr[i] == key)
                    return i;
    
            // If the key is not found
            return -1;
        }
    
        // Driver's Code
        public static void main(String args[])
        {
            int arr[] = { 12, 34, 10, 6, 40 };
            int n = arr.length;
    
            // Using a last element as search element
            int key = 40;
        
            // Function call
            int position = findElement(arr, n, key);
    
            if (position == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element Found at Position: "
                                + (position + 1));
        }
    }
    */
    import java .util.Scanner;
    public class Search{

        public static void main(String[] args) {
            int n;
            int arr[]=new int[5];
            Scanner sc=new Scanner(System.in);
            for(int i =0;i<arr.length;i++)
           // System.out.println("enter the array element");
            {
            arr[i]=sc.nextInt();
            }
           System.out.println(" the array element is :");
            for(int i =0;i<arr.length;i++)
            {
            System.out.println(arr[i]);
            }
        
        System.out.println(" enter  array element which you want to search  :");
        n=sc.nextInt();
        for(int i =0;i<arr.length;i++)
         {
         if(arr[i] == n)
             {
             System.out.println("array element found at : " + i);
           // break;
             

            }
        
        }
          
              System.out.println("array element not  found ");
        
       
            
        }
    }  
    
        
    

    

