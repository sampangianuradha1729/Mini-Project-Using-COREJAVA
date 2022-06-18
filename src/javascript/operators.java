package javascript;
 
import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
	 Scanner in = new Scanner (System.in);
	 System.out.println("Enter number");
	 int number = in.nextInt();
	 int result = (number>>1);
	 System.out.println(result);

	}

}