public class Array {
 public static void main(String[] args) {
    int [] arr = new int[5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
System.out.println( arr[2]);
 }
}
   // heap object are not continuous
   //array object internally not a continuous because its depend on jvm
   //array stored same data type elements
   //dynamic memmory allocation  
   //new keyword is used to create object
   //Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find "length" using "sizeof".
   //Java array can also be used as a static field, a local variable, or a method parameter.