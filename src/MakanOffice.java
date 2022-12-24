import java.util.*;

public class MakanOffice {
    public static void main(String[] args) {
    	System.out.println("<----------WELCOME TO MAKAN OFFICE!---------->" + "\n");
        Scanner sc = new Scanner(System.in);
        double unit1,unit2, donation1, donation2, total_month, infaq1, infaq2, balance1, balance2;
        System.out.print("Enter number person: ");
        unit1 = sc.nextDouble();
        donation1 = unit1*10;
        System.out.println("Total Donation per week is RM "+donation1);
        System.out.print("Enter number person: ");
        unit2 = sc.nextDouble();
        donation2 = unit2*15;
        System.out.println("Total Donation per week is RM "+donation2);
        total_month = (donation1+donation2)*4;
        System.out.println("Total Monthly is RM "+total_month);
        
        if (total_month>800){
            infaq1 = 0.2*total_month;
            System.out.println("Sedekah Jumaat is RM "+infaq1);
            balance1 = total_month-infaq1;
            System.out.println("Balance for makan-makan is RM "+balance1);
        }else if (total_month>500){
            infaq2 = 0.1*total_month;
            System.out.println("Sedekah Jumaat is RM "+infaq2);
            balance2 = total_month-infaq2;
            System.out.println("Balance for makan-makan is RM "+balance2);
        }else{
        System.out.println("We can go makan-makan!!!!" + total_month); 
        }  
        System.out.println("Enter 1 to continue , 0 to exit to main" + "\n");
		int cont = sc.nextInt();
		if (cont ==  1) {
			MakanOffice prog2 = new MakanOffice();
			prog2.main(args);
		}else {
			MainClass theFront = new MainClass();
			theFront.main(args);
		}
    }
}