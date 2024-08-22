import java.util.Scanner;
public class Amstrong {
    
    
    public static void main(String[] args) {
        int n , arm=0,r,c;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
    {
   r=n%10;
    arm=(r*r*r)+arm;
    n=n/10;
   }  

 if(c==arm)
  {
    System.out.println("Amstrong number");
  }
 else 
     {
    System.out.println("Not Amstrong number");
    }
}
}