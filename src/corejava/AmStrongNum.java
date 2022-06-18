package corejava;
import java.util.Scanner;

public class AmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter number to check Amstrong");
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int num=n;
int r,sum=0;
while(n!=0)
{
	r=n%10;
	System.out.println("r >"+r);
	sum=sum+r*r*r;
	//System.out.println("sum is >"+sum);	
	n=n/10;
	System.out.println("n >"+n);
}
if(num==sum)
{
	System.out.println("given number is amstrong");
}
else
{
	System.out.println("given number is not amstrong");
}
	}

}
