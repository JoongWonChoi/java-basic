import java.util.*;
public class LadderGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String array[][] = new String[15][9];
		//�迭 ����
	
		for(int i=0;i<7;i+=2) {//i=���μ� ���� ��
			if(i==0) {//i=0�̸� ������ ���� ���μ��� �����Ƿ� �׳� 4�� �ٷ� ����
				int count=0;
				while(count<4) {//�˸��� ��쿡�� count +1�� ����
					int y=rd.nextInt(15);
					if(array[y][i+1]!=null) {continue;}//y�� ������ �ڸ��� �̹� ���μ� ������ �ٽ� �ݺ��� ����
					else{array[y][i+1]="-";count++;}//�׷��� ������ ���μ� ���� �� count+1
				}
			}
				else {//i>0�̸�(�ι�° ���ο�����) ������ �´�� ���� ������ϹǷ� i-1�� ��
					int count=0;
					while(count<4) {
						int y=rd.nextInt(15);
						if(array[y][i-1]=="-") {continue;}//�ڽ��� ���� ���μ��� ������ �ٽ� �ݺ��� ����
						else if(array[y][i+1]!=null) {continue;}//y�� ������ �ڸ��� �̹� ���μ� ������ �ٽ� �ݺ��� ���� 
						else{array[y][i+1]="-";count++;}
				}
			}
		}
		System.out.println("1 2 3 4 5");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++){
				if(j%2==0) {array[i][j]="|";}
				if(array[i][j]==null) {array[i][j]=" ";}
				System.out.print(array[i][j]);	
			}System.out.println();}
		System.out.println("A B C D E");
		//���� ������ ���μ� + ��ٸ� ��� ����
		int user=1; //����� ��ȣ(1~5)�� ���� ����
		for(int k=0;k<9;k+=2) {
			int temp = k; //k�� x��ǥ, temp�� ���� k�� ���� �� k���� �ǵ��� �ʱ�. �ݺ����� ����
			int m=0;//y��ǥ
			
			while(m<15) {
					if(temp==0) {//x��ǥ��  0�� ��(�� ���� ��)
						if(array[m][temp+1]=="-") {m+=1;temp+=2;}
						else {m+=1;}}
					else if(temp==8) {//x��ǥ�� 8�� ��(�� ������ ��)
						if(array[m][temp-1]=="-") {m+=1;temp-=2;}
						else {m+=1;}}
					else {// x��ǥ�� ���� ������ ��
						if(array[m][temp+1]=="-") {m+=1;temp+=2;}
						else if(array[m][temp-1]=="-") {m+=1;temp-=2;}
						else {m+=1;}}
					
			}
			if(temp==0) {System.out.println(user+"�� ����� A ��÷!!");}
			else if(temp==2) {System.out.println(user+"�� ����� B ��÷!!");}
			else if(temp==4) {System.out.println(user+"�� ����� C ��÷!!");}
			else if(temp==6) {System.out.println(user+"�� ����� D ��÷!!");}
			else if(temp==8) {System.out.println(user+"�� ����� E ��÷!!");}
			user+=1;//�ݺ��� �� ������ user�� �������Ѽ� 1~5�� ����� ����� ǥ��.
			}
			
		
		
			
	}

	}


