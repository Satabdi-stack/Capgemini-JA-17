package lab1;

import java.util.Scanner;
public class CalculateSum {
    int calculateSum(int n)
    {
    	int i,sum=0;
    	for(i=1;i<=n;i++)
    	{
    		if(i%3==0 || i%5==0)
    		{
    			sum=sum+i;
    		}
    	}
    	return sum;
    }



public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number upto which you want sum");
	int n=sc.nextInt();
	CalculateSum num1=new CalculateSum();
	System.out.println("The sum is"+num1.calculateSum(n));
}
}