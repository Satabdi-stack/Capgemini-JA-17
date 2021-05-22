package stringproblems;

import java.util.*;

public class WordDelete {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.nextLine();
		System.out.print("Enter the word to be deleted : ");
		String delWrd=sc.next();
		if(string.contains(delWrd))
		{
			string=string.replace(delWrd, "");
		}
		System.out.printf("After deleting the word %s new String = %s",delWrd,string);
	}

}
