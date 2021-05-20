package lab1;

import java.util.Scanner;

public class TrafficLights {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String color;
		System.out.println("Enter the color");
		color=sc.next();
		switch(color)
		{
			case "red":
				System.out.println("STOP");
				break;
			case "yellow":
				System.out.println("READY");
				break;
			case "green":
				
				System.out.println("GO");
				break;
		}
		

	}

}
