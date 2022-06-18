package corejava;
import java.util.Arrays;
public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] array = new int [] {20, 5,1,8,10,12 };  
//		//invoking sort() method of the Arrays class  
//		Arrays.sort(array);   
//		System.out.println("Elements of array sorted in ascending order: ");  
//		//prints array using the for loop  
//		for (int i = 0; i < array.length; i++)   
//		{       
//		System.out.println(array[i]);   
//		}   
//		}  
//}
		// to print matrix 
//		int a[][]={{1,3,},{2,4,}};    
//		int b[][]={{1,3,},{2,4,}};    
//		      
//		int c[][]=new int[2][2];    
//		    
//		    
//		for(int i=0;i<2;i++)
//		{    
//		for(int j=0;j<2;j++)
//		{    
//		c[i][j]=a[i][j]+b[i][j];      
//		System.out.print(c[i][j]+" ");    
//		}    
//		System.out.println();    
//		}    
//		}
//	}  

    // print multiplication of matrix
int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
int c[][]=new int[3][3]; 
        
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
} 
System.out.print(c[i] [j]+" ");    
}
System.out.println();   
}    
}
	}  
