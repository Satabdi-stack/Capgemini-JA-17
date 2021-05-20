package lab1;

import java.util.Scanner;

public class CalculateDiff {
  int calculatediff(int n)
  {
	  int i,sum=0,sum1=0,sum2=0;
	  for(i=1;i<=n;i++)
	  {
		  sum1=sum1+(i*i);
		  sum2=sum2+i;
		  sum=(sum2*sum2)-sum1;
	  }
	  return sum;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want difference");
		int n=sc.nextInt();
		CalculateDiff num=new CalculateDiff();
		System.out.println("The difference is"+num.calculatediff(n));
	}

	

}

