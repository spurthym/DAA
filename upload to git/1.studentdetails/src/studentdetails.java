import java.util.Scanner;
class student{
	String usn,name,branch,phno;
	void read() {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the usn");
	    usn=ip.nextLine();
	    System.out.println("enter the name");
	    name=ip.nextLine();
	    System.out.println("enter the branch");
	    branch=ip.nextLine();
	    System.out.println("enter the phno");
	    phno=ip.nextLine();
	}
	void display() {
		System.out.printf("%-20s%-20s%-20s%-20s",usn,name,branch,phno);
	}
}
public class studentdetails 
{
	public static void main(String[]args) 
	{
	    Scanner ip=new Scanner(System.in);
	    System.out.println("enter the number of student");
	    int number=ip.nextInt();
	    student s[]=new student[number];
	    for(int i=0;i<number;i++)
	    {
		  s[i]=new student();
		  s[i].read();	
	    }
	    System.out.printf("%-20s%-20s%-20s%-20s","usn","name","branch","phno");
	    System.out.println();
	    for(int i=0;i<number;i++) {
		s[i].display();
		System.out.println();
	    }

	}
}
