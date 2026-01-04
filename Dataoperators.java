public class Dataoperators{
public static void main(String[] args){

int a = 10;
int b = 3;

System.out.println("ARITHMETIC OPERATORS");
System.out.println("Addition : " + (a + b));
System.out.println("Subtraction : " + (a - b));
System.out.println("Multiplication : " + (a * b));
System.out.println("Division : " + (a / b));
System.out.println("Modulus : " + (a % b));

System.out.println("\nUNARY OPERATORS");
int x = 5;
System.out.println("Initial value of x : " + x);
x++;
System.out.println("After Increment : " + x);
x--;
System.out.println("After Decrement : " + x);

System.out.println("\nRELATIONAL OPERATORS");
System.out.println("a < b : " + (a < b));
System.out.println("a <= b : " + (a <= b));
System.out.println("a > b : " + (a > b));
System.out.println("a >= b : " + (a >= b));
System.out.println("a == b : " + (a == b));
System.out.println("a != b : " + (a != b));

System.out.println("\nLOGICAL OPERATORS");
boolean p = true;
boolean q = false;
System.out.println("p && q : " + (p && q));
System.out.println("p || q : " + (p || q));
System.out.println("!p : " + (!p));

}
}
