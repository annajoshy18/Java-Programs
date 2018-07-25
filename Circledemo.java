import java.util.*;
class Circle
{
 int radius;
 void accept()
{
 Scanner c=new Scanner(System.in);
 System.out.println("enter the radius");
 radius=c.nextInt();
}
 void area()
 {
  double res;
  res=3.14*radius*radius;
  System.out.println("Area is:"+res);
 }
 void circum()
 {
  double res;
  res=2*3.14*radius;
  System.out.println("Area is:"+res);
}
}
public class Circledemo 
{
 public static void main(String args[])
 {
  Circle obj=new Circle();
  obj.accept();
  obj.area();  
  obj.circum();
 }
}