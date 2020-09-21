package logicalOperator092020;

import java.util.Scanner;

public class Switchclass {

	public static void main(String[] args) {
	int day1 = 1;
		
		Scanner d = new Scanner(System.in);
		day1 = d.nextInt();
				
		
		switch(day1) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("print Tuesday");
			break;
		case 3:
			System.out.println("print Wednesday");
			break;
		case 4:
			System.out.println("print Thursday");
			break;
		case 5:
			System.out.println("print Friday");
			break;
		case 6:
			System.out.println("print Saturday");
			break;
		case 7:
			System.out.println("print Sunday");
			break;
			default :
				System.out.println("invalid day");
		}
	}

}
