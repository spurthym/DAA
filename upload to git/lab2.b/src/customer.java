import java.util.Scanner;
import java.util.StringTokenizer;
public class customer {
	public static void main(String []args)
	{
String name;

Scanner ip=new Scanner(System.in);
System.out.println("enter name and dob in format<name,dd/mm/yyyy>");
name=ip.nextLine();
StringTokenizer st=new StringTokenizer(name,",/");
int count=st.countTokens();
for(int i=1;i<=count &&st.hasMoreTokens();i++)
{
	System.out.print(st.nextToken());
	if(i<count)
		System.out.print(",");


}


	}
}
