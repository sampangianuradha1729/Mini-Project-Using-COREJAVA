package corejava;
import java.util.*;
public class MatrixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Addition of 2*2 matrix
//		int a[][]={{1,4},{2,4}};    
//		int b[][]={{1,3},{2,3}};    
//		      
//		int c[][]=new int[2][2];    
//		      
//		for(int i=0;i<2;i++){    
//		for(int j=0;j<2;j++){    
//		c[i][j]=a[i][j]+b[i][j];      
//		System.out.print(c[i][j]+" ");    
//		}    
//		System.out.println();   
//		}    
//		}
//			}

      // Addition of 3*3 matrix
//int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
//int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
//      
//int c[][]=new int[3][3];    
//      
//for(int i=0;i<3;i++){    
//for(int j=0;j<3;j++){    
//c[i][j]=a[i][j]+b[i][j];      
//System.out.print(c[i][j]+" ");    
//}    
//System.out.println();   
//}    
//}
//	} 
		
		//multiplication of matrix
//		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
//		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
//		  
//		int c[][]=new int[3][3];   
//		    
//	    
//		for(int i=0;i<3;i++){    
//		for(int j=0;j<3;j++){    
//		c[i][j]=0;      
//		for(int k=0;k<3;k++)      
//		{      
//		c[i][j]+=a[i][k]*b[k][j];      
//		}  
//		System.out.print(c[i][j]+" ");   
//		}  
//		System.out.println();   
//		}    
//	}
//}  
		int m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns");
		m=sc.nextInt();
		n=sc.nextInt();
	
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int sum[][]=new int[m][n]; 
		
		System.out.println("Enter matrix 1");
		for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
		a[i][j]=sc.nextInt();
		}
		}
		System.out.println("Enter matrix 2");
		for(int i=0;i<m;i++)  {  
		for(int j=0;j<n;j++) { 
		b[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<m;i++) { 
		for(int j=0;j<n;j++) {
	    sum[i][j] = a[i][j] + b[i][j];  
		}
		}
	    System.out.println("matrices sum :");
	    for (int i=0;i<m;i++)
	    {
	        for (int j=0;j<n;j++)
	        	System.out.print(sum[i][j]+" ");
	        System.out.println();
	      } 
	    
		

	}

}