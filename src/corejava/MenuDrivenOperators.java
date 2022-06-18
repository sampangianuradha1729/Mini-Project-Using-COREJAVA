package corejava;
import java.util.Scanner;
public class MenuDrivenOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 int a,b,c;
	    int choice;
	    while(true){
	        
	        System.out.print("1 for Addition ");
	        System.out.print("2  for Subtraction ");
	        System.out.print("3 for multiplication ");
	        System.out.print("4 for Division");
	        System.out.print("5 to Quit\n \n");
	        
            System.out.println("Enter your choise :");
            choice = sc.nextInt();
            

	    switch(choice){

	    case 1:
	        System.out.print("Enter two integer values ");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = a + b;
	        System.out.print("Sum = " + c +"\n");
	        break;

	    case 2: 
	        System.out.println(" Enter two integer values  ");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = a - b;
	        System.out.println("Sub = " + c +"\n");
	        break;
	    
	    case 3: 
	        System.out.println(" Enter two integer values  ");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = a * b;
	        System.out.println("Mul = " + c +"\n");
	        break;
	       
	    case 4: 
	    	System.out.println(" Enter two integer values ");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        if ((a==0||b==0))
	        {
	        	System.out.println("Zero is not applicable please enter another number");
	        }
	        else {
	        	a = sc.nextInt();
	        	b = sc.nextInt();
	        	c = a / b;
	        System.out.println("Div = " + c +"\n");
	        }
	        break;
	     
	    case 5:
	    	System.exit(0);
	    	
	    default:
	    	System.out.println("Out of loop. ");
	    	
	    }


	    }




	    }

	   
	   }



