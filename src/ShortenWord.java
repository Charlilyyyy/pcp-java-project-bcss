import java.util.*;

public class ShortenWord {
    public static void main(String[] args) {
    	System.out.println("<----------WELCOME TO SHORT YOUR WORD!---------->" + "\n");
        Scanner sc = new Scanner(System.in);
        String words;  
        System.out.print("Please enter the word: ");
            words = sc.nextLine();
            if(words.length() > 10){
            	System.out.print("Shorten word is: ");
                System.out.print(words.charAt(0));
                System.out.print(words.length());
                System.out.print( words.charAt(words.length()-1));
            }else {
            	System.out.print("Shorten word is: ");
            	System.out.print(words);
            }
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("Enter 1 to continue , 0 to exit to main" + "\n");
    		int cont = sc.nextInt();
    		System.out.print("\n");
    		if (cont ==  1) {
    			ShortenWord prog4 = new ShortenWord();
    	    	prog4.main(args);
    		}else {
    			MainClass theFront = new MainClass();
    			theFront.main(args);
    		}      
    }
}