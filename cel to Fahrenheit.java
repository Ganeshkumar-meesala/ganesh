import java.util.*;

 //Compiler version JDK 11.0.2

 class A
 {
 	public static void main(String args[])
 	{ 
		System.out.println("enter temp in Celsius");
 	Scanner sc=new Scanner (System.in);
 	float Celsius=sc.nextFloat();
 	double Fahrenheit=(9.0/5.0)*Celsius+32;
 	System.out.println(Fahrenheit);
 }
 }