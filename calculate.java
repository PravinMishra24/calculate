import java.util.Scanner;
public class calculate 
{
   int a,b,c=0;
   int i;
   Scanner sc = new Scanner(System.in);
  public void sum()
   {
      System.out.println("sum of two number ");
       System.out.println("enter the value of a =>");
       a=sc.nextInt();
       System.out.println(" enter the value of b =>");
       b=sc.nextInt();
       c=a+b;
       System.out.println("sum of two number  is " + c);
      
       System.out.println();
   }
   void mul()
   {
       System.out.println(" multiplication of two number :"); 
       System.out.println("enter the value of a =>");
       a=sc.nextInt();
       System.out.println("enter the value of b =>");
       b=sc.nextInt();
       c=a*b;
       System.out.println("multiplication of two number a and b is => " + c);
       System.out.println();

   }
   void div()
   {
    System.out.println(" division of two number : ");
    System.out.println("enter the value of a =>");
    a=sc.nextInt();
    System.out.println("enter the value of b =>");
    b=sc.nextInt(); 
    c=a/b;
    System.out.println("division of two number is =>" + c);
    System.out.println();

   }
   void sub()
   {
    System.out.println("subtraction of two number : ");
    System.out.println("enter the value of a =>");
    a=sc.nextInt();
    System.out.println("enter the value of b =>");
    b=sc.nextInt();
    c=a-b;
    System.out.println("subtraction of " + a +"into" + b +" is " +c);
    System.out.println();
    
   }
   public static void main(String[] args)
   {
       calculate C=new calculate();
       C.sum();
       C.mul();
       C.div();
       C.sub();

   }

}
