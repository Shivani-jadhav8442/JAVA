import java.util.Scanner;
public class Palindrom{
    
public static void main(String[] args) {
   int n,c,s=0,r;
    //palindrom number is the number that is same as its reversed order
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    c=n;//here we stored the n value in the third var
    while(n>0)
    {
    r=n%10;
    s=(s*10)+r;
    n=n/10;
   }  

    if(c==s)
      { System.out.println("palindrom number");
           }
      else
            { System.out.println(" not palindrom number"); 
                }     
             
}
}