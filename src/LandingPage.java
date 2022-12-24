import java.util.*;

public class LandingPage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int click;
		System.out.print("Hi! Welcome to Taufik and Sarah Program!");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Enter 1 to go to Main Menu");
		System.out.print("\n");
		click = sc.nextInt();
		if (click==1) {
			MainClass theFront = new MainClass();
			theFront.main(args);
		}else {
			System.out.print("Please enter 1 to continue :)");
			LandingPage landingPage = new LandingPage();
			landingPage.main(args);;
		}
	}
}
