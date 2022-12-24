import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
    	System.out.println("<----------WELCOME TO DOMINO PILING!---------->" + "\n");
    	//one domino block is 2*2
        Scanner sc = new Scanner(System.in);
        int block_size_x,block_size_y,sumblock,total_domino;
        System.out.print("Please enter the block width:");
        block_size_x = sc.nextInt();
        System.out.print("Please enter the block height:");
        block_size_y = sc.nextInt();
        System.out.print("\n");
        if (block_size_x>=1 && block_size_x<=16 && block_size_y>=1 && block_size_y<=16){
            sumblock = block_size_x*block_size_y;
            if(sumblock%2==0){
                total_domino = sumblock/2;
                System.out.print("Total domino block needed is :");
                System.out.print(total_domino);
                System.out.print("\n");
                System.out.print("\n");
            }
            else{
                total_domino = (sumblock-1)/2;
                System.out.print("Total domino block needed is :");
                System.out.print(total_domino);
                System.out.print("\n");
                System.out.print("\n");
            }
        }
        else{
            System.out.print("Block size is too big");
            System.out.print("\n");
        }
        System.out.println("Enter 1 to continue , 0 to exit to main" + "\n");
		int cont = sc.nextInt();
		if (cont ==  1) {
			DominoPiling prog3 = new DominoPiling();
	    	prog3.main(args);
		}else {
			MainClass theFront = new MainClass();
			theFront.main(args);
		}
        
    }
}