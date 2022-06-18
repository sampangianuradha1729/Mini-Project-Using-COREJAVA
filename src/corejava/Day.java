 	package corejava;
import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in);		
		System.out.println("Enter Week:");
		
int Week = sc.nextInt();
String day;
switch(Week) {
case 1:
System.out.println("Sunday");
	break;
case 2:
	day = "Monday";
	break;
case 3:
	day = "Tuesday";
	break;
case 4:
	day = "Wednesday";
	break;
case 5:
	day = "Thursday";
	break;
case 6:
	day = "Friday";
	break;
case 7:
	day = "Saturday";
	break;
default:
	day = "Invalid day";
	

}
	}

 }
