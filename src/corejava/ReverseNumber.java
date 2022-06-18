package corejava;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int number = 234 , reverse = 0;   
		for(  ; number != 0; number=number/10)    
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder; 
		
		}  
		System.out.println("The reversed number is: " + reverse); 
		
		
		
		}  
	}  
		
		
		
		
		
		
		
		
		
		
		
		
		  



