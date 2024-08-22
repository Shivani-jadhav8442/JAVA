
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
    
        
    

    

