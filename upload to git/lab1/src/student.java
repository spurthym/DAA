import java.util.*;
class studentdetails
{
	String name,usn,phno,branch;
	void read()
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter student usn");
		usn=ip.nextLine();
		System.out.println("enter name");
		name=ip.nextLine();
		System.out.println("branch");
		branch=ip.nextLine();
		System.out.println("phno");
        phno=ip.nextLine();

	}
	void display()
	{
		System.out.printf("%-20s%-20s%-20s%-20s",name,usn,branch,phno);
		System.out.println();

	}
	
}
public class student {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number of students");
		int n=ip.nextInt();
		studentdetails [] stu=new studentdetails[n];
		System.out.println("enter student details");
		for(int i=0;i<n;i++)
		{
			stu[i]=new studentdetails();
			stu[i].read();
		}
		System.out.println("the student details are:");
		System.out.printf("%-20s%-20s%-20s%-20s","name","usn","branch","phno");
		for(int i=0;i<n;i++)
		{
			stu[i].display();
			System.out.println();

		}
	}

}
