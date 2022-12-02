import java.util.Scanner;
class Book{
String name;
String author;
int price;
int pages;
Book(String n,String a,int pr,int p)
{
 name=n;
 author=a;
 price=pr;
 pages=p;
}
void get()
{
System.out.println("book details are\n name: "+name+"\n author: "+author+"\n price:"+price+"\n number of pages: "+pages+"\n");
}
public String toString(){
return ("book details are\n name: "+name+"\n author: "+author+"\n price:"+price+"\n number of pages: "+pages+"\n");
}
}
class Week4{
public static void main(String args[])
{
 int z,pr,p;
 String n,a; 
System.out.println("\nenter the number of books\n");
 Scanner sc=new Scanner(System.in);
 z=sc.nextInt();
 int i;
Book b[]=new Book[z]; 
 for(i=0;i<z;i++)
{
System.out.println("enter the name ,author ,price and pages of the book"+(i+1)+" respectively\n");

n=sc.next();
a=sc.next();
pr=sc.nextInt();
p=sc.nextInt();
b[i]=new Book(n,a,pr,p);
}
  for(i=0;i<z;i++)
{
System.out.println(b[i]);
}
}
}
