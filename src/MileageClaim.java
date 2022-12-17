import java.util.*;

public class MileageClaim {
    public static void main(String[] args) {
    	System.out.println("<----------WELCOME TO MILEAGE CLAIM!---------->" + "\n");
        Scanner sc = new Scanner(System.in);
        String name;
         double unit1, unit2, mileage1, mileage2, total_week, sum = 0, average = 0;
        for(int i=1;i<=4;i++){
        System.out.print("Please enter your name: ");
        name = sc.next();
        System.out.print("Enter mileage for Klang Valley: ");
        unit1 = sc.nextDouble();
        mileage1 = unit1*0.60;
        System.out.println("Total mileage for Klang Valley is RM "+mileage1);
        System.out.print("Enter mileage for Outstation: ");
        unit2 = sc.nextDouble();
        mileage2 = unit2*1.60;
        System.out.println("Total mileage for Outstation is RM "+mileage2);
        total_week = mileage1 + mileage2;
        System.out.println("Total Weekly is RM "+total_week);
         sum = sum + total_week;
        average = sum / 4;
        
        System.out.println("\n");
        }
        System.out.println("Total Monthly Claim is RM "+sum);
        System.out.println("Total Average Claim is RM "+average);
        System.out.println("Enter 1 to continue , 0 to exit to main" + "\n");
		int cont = sc.nextInt();
		if (cont ==  1) {
			MileageClaim prog1 = new MileageClaim();
			prog1.main(args);
		}else {
			MainClass theFront = new MainClass();
			theFront.main(args);
		}
    }    
}  
