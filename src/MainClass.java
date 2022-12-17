import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<----------WELCOME TO TAUFIK AND SARAH SYSTEM!---------->" + "\n");
		System.out.println("Enter 1 , 2 , 3 or 4 to go to the program" + "\n");
		System.out.print("1 - MileageClaim" + "\n");
		System.out.print("2 - MakanOffice" + "\n");
		System.out.print("3 - DominoPiling" + "\n");
		System.out.print("4 - ShortenWord" + "\n");
	    int x = sc.nextInt();  
	    if(x==1) {
	    	MileageClaim prog1 = new MileageClaim();
			prog1.main(args);
	    } else if(x==2) {
	    	MakanOffice prog2 = new MakanOffice();
			prog2.main(args);
	    }else if(x==3) {
	    	DominoPiling prog3 = new DominoPiling();
	    	prog3.main(args);
	    }else if(x==4) {
	    	ShortenWord prog4 = new ShortenWord();
	    	prog4.main(args);
	    }else {
	    	System.out.print("Please select according to the menu" + "\n" +"\n");
	    	MainClass theFront = new MainClass();
			theFront.main(args);
	    }
		
		
		
		
	}
}
