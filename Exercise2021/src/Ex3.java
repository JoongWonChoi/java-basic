import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			 for(int j=0;j<i*2+1;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		}
		

	}

}
