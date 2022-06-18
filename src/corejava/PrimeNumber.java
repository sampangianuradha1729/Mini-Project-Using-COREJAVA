package corejava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter number to check");
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=2;i<=n;i++);
//		{
//			int count=0;
//            for(int j=1;j<=1;j++)
//			{
//		       
//		       {
//		    	   count++;
//		       }
//			}
//            if(count==2)
//		{
//		
//		}
//}		
//	}
//}

		int i,m=0,flag=0;      
		  int n=3; 
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  } 
	}
}

		    


