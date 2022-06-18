package corejava;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Double n1 = -1.0,n2 = 4.5, n3 = 5.3,largestNumbers;
if (n1 >=n2) {
	if (n1 >=n3) {
	  largestNumbers = n1;	
	}else {
		largestNumbers = n3;
	}

}else {
	if(n2>=n3) {
		largestNumbers = n2;
	}else {
		largestNumbers= n3;
		}
}
System.out.println("Largest number is "+ largestNumbers);

	}

}
