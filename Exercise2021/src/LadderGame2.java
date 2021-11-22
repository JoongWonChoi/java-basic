import java.util.*;
public class LadderGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String array[][] = new String[15][9];
		//배열 선언
	
		for(int i=0;i<7;i+=2) {//i=가로선 놓는 열
			if(i==0) {//i=0이면 좌측에 비교할 세로선이 없으므로 그냥 4개 바로 생성
				int count=0;
				while(count<4) {//알맞은 경우에만 count +1씩 증가
					int y=rd.nextInt(15);
					if(array[y][i+1]!=null) {continue;}//y가 생성된 자리에 이미 가로선 있으면 다시 반복문 진행
					else{array[y][i+1]="-";count++;}//그렇지 않으면 가로선 생성 후 count+1
				}
			}
				else {//i>0이면(두번째 세로열부터) 좌측에 맞닿는 선이 없어야하므로 i-1과 비교
					int count=0;
					while(count<4) {
						int y=rd.nextInt(15);
						if(array[y][i-1]=="-") {continue;}//자신의 좌측 가로선이 있으면 다시 반복문 진행
						else if(array[y][i+1]!=null) {continue;}//y가 생성된 자리에 이미 가로선 있으면 다시 반복문 진행 
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
		//랜덤 생성된 가로선 + 사다리 모양 구축
		int user=1; //사용자 번호(1~5)를 위해 설정
		for(int k=0;k<9;k+=2) {
			int temp = k; //k가 x좌표, temp를 통해 k값 저장 후 k값은 건들지 않기. 반복문을 위해
			int m=0;//y좌표
			
			while(m<15) {
					if(temp==0) {//x좌표가  0일 떄(맨 왼쪽 줄)
						if(array[m][temp+1]=="-") {m+=1;temp+=2;}
						else {m+=1;}}
					else if(temp==8) {//x좌표가 8일 때(맨 오른쪽 줄)
						if(array[m][temp-1]=="-") {m+=1;temp-=2;}
						else {m+=1;}}
					else {// x좌표가 사이 값들일 때
						if(array[m][temp+1]=="-") {m+=1;temp+=2;}
						else if(array[m][temp-1]=="-") {m+=1;temp-=2;}
						else {m+=1;}}
					
			}
			if(temp==0) {System.out.println(user+"번 사용자 A 당첨!!");}
			else if(temp==2) {System.out.println(user+"번 사용자 B 당첨!!");}
			else if(temp==4) {System.out.println(user+"번 사용자 C 당첨!!");}
			else if(temp==6) {System.out.println(user+"번 사용자 D 당첨!!");}
			else if(temp==8) {System.out.println(user+"번 사용자 E 당첨!!");}
			user+=1;//반복문 돌 때마다 user값 증가시켜서 1~5번 사용자 결과값 표시.
			}
			
		
		
			
	}

	}


