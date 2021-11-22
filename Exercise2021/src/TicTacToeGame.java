import java.util.*;
public class TicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); //pc용 랜덤
		Scanner sc = new Scanner(System.in); 
		String array [][] = new String[3][3]; //배열 생성
		for(int z=0;z<array.length;z++) {
			for(int w=0;w<array.length;w++) {
				array[z][w]="_";}}//오목 판 생성!
		System.out.println("______사용자 : ● ______ pc : ○ ______");//오목판 생성 및 준비 완료
		
		Loop1:
		while (true) {
			for(int m=0;m<array.length;m++) {
				for(int n=0;n<array.length;n++) {
					System.out.print(array[m][n]+",");
				}System.out.print("\n");}
			for(int x=0;x<array.length;x++) {
				if((array[x][0]=="●" && array[x][1]=="●" && array[x][2]=="●")||(array[0][x]=="●" && array[1][x]=="●" && array[2][x]=="●")||(array[0][0]=="●" && array[1][1]=="●" && array[2][2]=="●")||
						(array[0][2]=="●" && array[1][1]=="●" && array[2][0]=="●")) 
				{System.out.println("user win!!");break Loop1;}
				else if((array[x][0]=="○" && array[x][1]=="○" && array[x][2]=="○")||(array[0][x]=="○" && array[1][x]=="○" && array[2][x]=="○")||(array[0][0]=="○" && array[1][1]=="○" && array[2][2]=="○")
						||(array[0][2]=="○" && array[1][1]=="○" && array[2][0]=="○"))
				{System.out.println("pc win!!");break Loop1;}}
			System.out.println("어느 위치에 둘까여?");
			String user_input = sc.nextLine();
			if(user_input.equals("exit")) {
				System.out.println("exit"); break Loop1;}
			
			String user[] = user_input.split(" ");
			int user_x = Integer.parseInt(user[0]);
			int user_y = Integer.parseInt(user[1]);
			array[user_x][user_y] = "●";
			System.out.println(user_x+","+user_y); //user의 좌표 입력완료
			while(true) {
				int pc_x = rd.nextInt(3);
				int pc_y = rd.nextInt(3);
				if( array[pc_x][pc_y] == "_") {
					System.out.println("컴퓨터는"+pc_x+","+pc_y+"에 놓았습니다.");
					array[pc_x][pc_y] = "○";break;}} //pc의 좌표 설정
			
			
			
			
		}
		
		

	}

	}

