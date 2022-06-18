package corejava;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string2:");
		String str2 = sc.nextLine();
		String str3 =str1 = str2;
		String str4= "hello";	
		System.out.println("Resultant of string:"+str3);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println("Concataion:"+str1.concat(str2));
		System.out.println("double equal:"+ (str1==str2));
		System.out.println(str4.indexOf('l'));
		System.out.println(str4.replace("an","Anu"));
		System.out.println(str4.contains("Radha"));
		
		
		
	}

	
}
