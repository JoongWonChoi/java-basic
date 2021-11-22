import java.util.*;
public class LadderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String array[][] = new String[5][15];
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[0].length;j++) {
				array[i][j]=" ";}
			}
		for(int i=0;i<16;i++) {
			int x = rd.nextInt(4);
			int y = rd.nextInt(15);
			array[x][y] = "-";
		}
		System.out.println("1 2 3 4 5");
		for(int k=0;k<array[0].length;k++) {
			for(int l=0;l<array.length;l++) {
				System.out.print("|"+array[l][k]);
				}
			System.out.println();
			}
		System.out.println("A B C D E");
		
	  }
}
 