import java .util.Scanner;
public class Mularray{

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row ");
        int rows=sc.nextInt();
        System.out.println("enter the column ");
        int columns=sc.nextInt();
        int[][]mulD=new int[rows][columns];
        for(int i=0;i<rows;i++)
          {
           for(int j=0;j<columns;j++)
           {
            mulD[i][j]=(i+1)*(j+1);
           }

          }
         
          for(int i=0;i<rows;i++)
          {
          for(int j=0;j<columns;j++)
           {
            System.out.print (mulD[i][j]+"  ");
           }

          
         System.out.println();
          }

    }
}
