import java.util.*;
 class staff
 {
	 String staffid,name,phone, salary;
	 void read()
	 {
		 Scanner ip=new Scanner(System.in);
		 System.out.println("enter staffid");
		 staffid=ip.nextLine();
		 System.out.println("enter name");
		 name=ip.nextLine();
		 System.out.println("enter phone");
		 phone=ip.nextLine();
		 System.out.println("enter salary");
		 salary=ip.nextLine();
	 }
	 void display()
	 {
		 System.out.printf("\n%-15s","staffid:");
		 System.out.printf("%-15s",staffid);
		 System.out.printf("\n%-15s","name:");
		 System.out.printf("%-15s",name);
		 System.out.printf("\n%-15s","phone:");
		 System.out.printf("%-15s",phone);
		 System.out.printf("\n%-15s","salary");
		 System.out.printf("%-15s",salary);
	 }
 }
 class teaching extends staff
 {
	 String domain,publications;
	 void read_teaching()
	 {
		 super.read();
		 Scanner ip=new Scanner(System.in);
		 System.out.printf("enter domain");
		 domain=ip.nextLine();
		 System.out.println("enter publications");
		 publications=ip.nextLine();
	 }
	 void diplay_objects()
	 {
		 super.display();
		 System.out.printf("\n%-15s","domain");
		 System.out.printf("%-15s",domain);
		 System.out.printf("\n%-15s","\npublication");
		 System.out.printf("%-15s",publications);
	 }
	 
 }
class contract extends staff
{
	 String period;
	 void read_contract()
	 {
		 super.read();
		 Scanner ip=new Scanner(System.in);
		 System.out.printf("enter period");
		 period=ip.nextLine();
	 }
	 void diplay_objects()
	 {
		 super.display();
		 System.out.printf("%-15s","\nperiod");
		 System.out.printf("%-15s",period);
		
	 }
}
class  technical extends staff
{
	 String skills;
	 void read_technical()
	 {
		 super.read();
		 Scanner ip=new Scanner(System.in);
		 System.out.printf("enter skill");
		 skills=ip.nextLine();
	 }
	 void diplay_objects()
	 {
		 super.display();
		 System.out.printf("%-15s","\nskills");
		 System.out.printf("%-15s",skills);
	 }
}
public class staffdetails {

	public static void main(String[] args) {
		 Scanner ip=new Scanner(System.in);
		 System.out.printf("enter number of staffdetails to be entered");
		 int n=ip.nextInt();
		 teaching []steach=new teaching[n];
		 technical stech[]=new technical[n];
		 contract scon[]=new contract[n];
		 System.out.println("------------------\nenter the details\n-------------");

		 for(int i=0;i<n;i++)
			{
			 System.out.println("enter the teaching details ");
				steach[i]=new teaching();
				steach[i].read_teaching();
			}
		for(int i=0;i<n;i++)
		{
			 System.out.println("enter the technical details ");
			stech[i]=new technical();
			stech[i].read_technical();
		}
		 for(int i=0;i<n;i++)
			{
			 System.out.println("enter the contract details ");

				scon[i]=new contract();
				scon[i].read_contract();
			}
		 //displaying
		 System.out.println("\n------------------ the details-------------\n");

		 System.out.println("\n------------------ the teaching details-------------\n");

		 
		 for(int i=0;i<n;i++)
			{
				steach[i].diplay_objects();
			}
		 System.out.println();

		 System.out.println("\n------------------the technical details-------------\n");

		 for(int i=0;i<n;i++)
			{
				stech[i].diplay_objects();
			}
		 System.out.println();

		 
		 System.out.println("\n------------------the contract details-------------\n");

		 for(int i=0;i<n;i++)
			{
				scon[i].diplay_objects();
			}
		 System.out.println();


	}

}
