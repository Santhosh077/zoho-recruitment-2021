import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Input :");
			int val = scan.nextInt();
			for(int i=val;i>0;i--) {
				for(int j=val;j>1;j--) {
					if(j<i)
						System.out.print(i+" ");
					else 
						System.out.print(j+" ");
				}
				System.out.println(i);
			}
	}
}
