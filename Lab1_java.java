import java.util.Scanner;
class quadratic{
public static void main(String args[]){
double a,b,c;
double root1,root2,root,i,d;
Scanner sc=new Scanner(System.in);
System.out.println("\nenter the coefficients a,b,c");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=(b*b)-(4*a*c);

if(a==0)
{System.out.println("it's not a quadratic equation. Enter valid inputs");
}

else if(d>0)
{root1=(-b+Math.sqrt(d)/(2*a));
root2=(-b-Math.sqrt(d)/(2*a));
System.out.println("the roots are real and distinct:root1 "+root1+ "root2 "+root2);
}

else if(d<0)
{
 root=-b/(2*a);
 
 i=Math.sqrt(-d)/(2*a) ;
 System.out.println("the roots are distinct and imaginary");
 System.out.println("root1 "+root+ "+" + "i"+ i);
 System.out.println("root2 "+root+ "-" +"i" + i);

}

else if(d==0)
{
root1=root2=-b/(2*a);
System.out.println("the roots are real and equal roots="+root1+ " " +root2);}

else
{System.out.println("roots are invalid");}
}
}
