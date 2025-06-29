import java.util.Scanner;

public class WeatherSeason {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose current weather season");
		System.out.println("1: Summer, 2: Winter, 3: Rainy");
		int choice=sc.nextInt();
		
		switch(choice) {

		case 1:
			System.out.println("Stay Hydrated");
			break;
			
		case 2:
			System.out.println("Wear Warm Clothes");
			break;
			
		case 3:
			System.out.println("Carry an Umbrella");
			break;
			
		default:
			System.out.println("wrong choice");


		}
	}

}
