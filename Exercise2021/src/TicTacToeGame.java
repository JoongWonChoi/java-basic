import java.util.*;
public class TicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); //pc�� ����
		Scanner sc = new Scanner(System.in); 
		String array [][] = new String[3][3]; //�迭 ����
		for(int z=0;z<array.length;z++) {
			for(int w=0;w<array.length;w++) {
				array[z][w]="_";}}//���� �� ����!
		System.out.println("______����� : �� ______ pc : �� ______");//������ ���� �� �غ� �Ϸ�
		
		Loop1:
		while (true) {
			for(int m=0;m<array.length;m++) {
				for(int n=0;n<array.length;n++) {
					System.out.print(array[m][n]+",");
				}System.out.print("\n");}
			for(int x=0;x<array.length;x++) {
				if((array[x][0]=="��" && array[x][1]=="��" && array[x][2]=="��")||(array[0][x]=="��" && array[1][x]=="��" && array[2][x]=="��")||(array[0][0]=="��" && array[1][1]=="��" && array[2][2]=="��")||
						(array[0][2]=="��" && array[1][1]=="��" && array[2][0]=="��")) 
				{System.out.println("user win!!");break Loop1;}
				else if((array[x][0]=="��" && array[x][1]=="��" && array[x][2]=="��")||(array[0][x]=="��" && array[1][x]=="��" && array[2][x]=="��")||(array[0][0]=="��" && array[1][1]=="��" && array[2][2]=="��")
						||(array[0][2]=="��" && array[1][1]=="��" && array[2][0]=="��"))
				{System.out.println("pc win!!");break Loop1;}}
			System.out.println("��� ��ġ�� �ѱ?");
			String user_input = sc.nextLine();
			if(user_input.equals("exit")) {
				System.out.println("exit"); break Loop1;}
			
			String user[] = user_input.split(" ");
			int user_x = Integer.parseInt(user[0]);
			int user_y = Integer.parseInt(user[1]);
			array[user_x][user_y] = "��";
			System.out.println(user_x+","+user_y); //user�� ��ǥ �Է¿Ϸ�
			while(true) {
				int pc_x = rd.nextInt(3);
				int pc_y = rd.nextInt(3);
				if( array[pc_x][pc_y] == "_") {
					System.out.println("��ǻ�ʹ�"+pc_x+","+pc_y+"�� ���ҽ��ϴ�.");
					array[pc_x][pc_y] = "��";break;}} //pc�� ��ǥ ����
			
			
			
			
		}
		
		

	}

	}

