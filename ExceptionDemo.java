import java.util.*;
class ExceptionDemo
{
public static void main(String args[])
{
	int a=42;
try{
	int l=args.length;
	int b=42/l;
try{
	int d=40/l-1;
	int c[]={1};
	c[90]=6;
   }catch(ArrayIndexOutOfBoundException e)
   {
	System.out.println("Array Index out of Bound");
   }
   }
catch(ArithmeticException e)
{
	System.out.println("Division by zero")
}
}   