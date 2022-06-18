package corejava;
import java.util.*;
class Student
{
	String name;
	int roll_no;
	
	void display(String name, int roll_no)
	{
		System.out.println("Name : "+name+" \n"+"Roll_no :"+roll_no);
	}
}


public class Oops_Concept {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name= sc.nextLine();
		System.out.println("Enter the Roll_no :");
		int roll_no=sc.nextInt();
		Student s=new Student();
		s.display(name , roll_no);

	    
	}

}
