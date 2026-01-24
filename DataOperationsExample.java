public class DataOperationsExample{
public static void main(String[] args){
int a = 19;
int b = 89;

//Arithematic Operators
System.out.println("Addition:" +(a+b));
System.out.println("Substraction:" +(a-b));
System.out.println("Multiplication:" +(a*b));
System.out.println("Division:" +(a/b));
System.out.println("Modulus:" +(a%b));

//Unary Operators
System.out.println("Increment a:" +(++a));
System.out.println("Decrement b:" +(--b));

//Relational Operators
System.out.println("a<b:" +(a<b));
System.out.println("a<=b:" +(a<=b));
System.out.println("a>b:" +(a>b));
System.out.println("a>=b:" +(a>=b));
System.out.println("a==b:" +(a==b));
System.out.println("a!=b:" +(a!=b));
 
//Logical Operators
boolean x = true;
boolean y = false;

System.out.println("x && y : " +(x && y));
System.out.println("x || y : " +(x || y));
System.out.println("!x :" +(!x));
}
}
