import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-geneated meSthod stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int horse=0;
		int jjaks=0;
		
		for(int i=1;i<=input;i+=2) {
			horse+=i;
		}
		for(int i=0;i<=input;i+=2) {
			jjaks+=i;
		}
		System.out.println("È¦¼ö : "+horse);
		System.out.println("Â¦¼ö : "+jjaks);
	}

}
