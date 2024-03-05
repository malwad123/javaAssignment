


/* Java Program to Find LCM */

import java.util.Scanner;
class LCM
{
 public static void main(String [] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter two number:");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int g=0;
 for(int i=1;i<=a;i++)
 {
 if(a%i==0&&b%i==0)
 g=i;
 }
 //System.out.println("GCD="+g);
 
 int lcm=a*b/g;
 System.out.println(lcm);
 
 }
 }
 

