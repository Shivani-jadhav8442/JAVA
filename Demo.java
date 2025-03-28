interface A{
 
    void show();
    void veiw();
 }
 class B implements A{
 public void show()
 {
 System.out.println("in show method");
 }
 public void veiw()
 {
 System.out.println("in view method");
 }


}
    
 public class Demo{
    public static void main(String[] args) {
        A obj =new B();
        obj.show();
        obj.veiw();
    }
 }
