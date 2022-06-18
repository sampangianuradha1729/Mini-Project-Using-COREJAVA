package corejava;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//factorial number by using for loop
//		 int i,fact=1;  
//		  int number=5;   
//		  for(i=1;i<=number;i++){    
//		      fact=fact*i;    
//		  }    
//		  System.out.println("Factorial of "+number+" is: "+fact); 
		
		
		// while loop factorial 
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int i=1;
//        int fact =1;
//        int num = sc.nextInt();
//        while( i <= num ){  
//            fact = fact * i;   
//            i++;    
//        }     
//   
//        System.out.println("Factorial of " + num + " is: " + fact); 	
//		
		// fibonacci series
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;
		
	}
  }
}

   