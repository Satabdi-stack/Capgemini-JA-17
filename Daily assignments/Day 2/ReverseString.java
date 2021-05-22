package stringproblems;

import java.util.Scanner;

public class ReverseString{

		public static String getReverse(String s) {
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
				rev+=s.charAt(i);
			
			return rev;
		}

		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter the String : ");
			String input = sc.nextLine(); 
			System.out.println("Reverse String : "+getReverse(input));
			
			sc.close();
		}

}