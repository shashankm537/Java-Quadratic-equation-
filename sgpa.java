import java.util.Scanner;
class sgpa{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
int i,n=4;
double m1,m2,m3,m4,m5,sgpa,avg;
String name;
String usn;
for(i=0;i<2;i++){
System.out.println("Enter your name");
name = s.next();
System.out.println("Enter your usn");
usn = s.next();
System.out.println("Enter Physics marks");
m1 = s.nextDouble();
System.out.println("Enter Electrical marks");
m2 = s.nextDouble();
System.out.println("Enter Civil marks");
m3 = s.nextDouble();
System.out.println("Enter EVI marks");
m4 = s.nextDouble();
System.out.println("Enter Maths marks");
m5 = s.nextDouble();
avg = (m1+m2+m3+m4+m5)/5;
sgpa = avg/10;
System.out.println("Name of student ");
System.out.println("USN of student ");
System.out.println("Marks1 : " + " " + m1);
System.out.println("Marks2 : " + " " + m2);
System.out.println("Marks3 : " + " " + m3);
System.out.println("Marks4: " + " " + m4);
System.out.println("Marks5 : " + " " + m5);
System.out.println("the cgpa is"+sgpa);

}
}
}
