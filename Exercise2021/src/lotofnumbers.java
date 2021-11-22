import java.util.Scanner;




public class lotofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("40자리수 이하 X 입력 => ");
		String x = sc.nextLine();
		System.out.print("40자리수 이하 Y 입력 => ");
		String y = sc.nextLine();
		

		int intarray[] = new int[40];
		int intarray2[] = new int[40];
		int countarray[] = new int[41];//올림
		int temp[] = new int[41];//자리마다 결과값 저장
		int result[] = new int[41];
		
		String str1[] = x.split("");
		String str2[] = y.split("");
		
		for(int i=0;i<str1.length;i++) {
			intarray[intarray.length-1-i]=Integer.parseInt(str1[str1.length-1-i]);//str1의 마지막 index->intarray의 마지막 index
			}
		for(int i=0;i<str2.length;i++) {
			intarray2[intarray2.length-1-i]=Integer.parseInt(str2[str2.length-1-i]);//str1의 마지막 index->intarray의 마지막 index	
		}
		//길이40 배열에 우측정렬로 숫자들 저장
		for(int j=0;j<intarray.length;j++) {
			int eachSum = intarray[intarray.length-1-j]+intarray2[intarray2.length-1-j];
			if(eachSum>9) {
				result[result.length-1-j-1]+=1;
				result[result.length-1-j]+=eachSum%10;
			}
			else {result[result.length-1-j]+=eachSum;}
		}
		System.out.println();
		
		int larger_arr;
		if(str1.length>str2.length) {larger_arr = str1.length;}
		else {larger_arr = str2.length;}
		System.out.print("40자리수 이하 X와 Y의 합 : ");
		for(int m=result.length-larger_arr-1;m<result.length;m++) {System.out.print(result[m]);}
		System.out.println();
		//덧셈
		
		
		int multemp[] = new int[81];//곱셈 시 마지막 덧셈 줄의 길이는 최대 2n이다(80)

		for(int i=0;i<intarray2.length;i++) { //두번째 줄에 올 수들만큼 반복
			int mularray[] = new int[81];//반복 할 때마다 mularray 배열 초기화
			
			for(int j=0;j<intarray.length;j++) {//첫번째 즐에 올 수만큼 반복
				int mul_eachSum = intarray2[intarray2.length-1-i]*intarray[intarray.length-1-j];
				if (mul_eachSum>9) {//올림처리
					mularray[mularray.length-1-j-i-1]+=mul_eachSum/10;//십의자리 수는 이전 인덱스로 올림처리
					mularray[mularray.length-1-j-i]+=mul_eachSum%10; // 일의자리 수 저장
					if(mularray[mularray.length-1-j-i]>9) {
						mularray[mularray.length-1-j-i-1]+=mularray[mularray.length-1-j-i]/10;
						mularray[mularray.length-1-j-i]=mularray[mularray.length-1-j-i]%10;}
					}
				else {mularray[mularray.length-1-j-i]+=mul_eachSum%10;}
			}//1회 반복 완료, mularray에 등록.
				
			
			//temp+=mularray 과정을 거치며 두번째 줄 요소 수만큼 덧셈 반복.
			//처음 temp는 비어있기 때문에 덧셈 해도 상관 없음
			for(int k=0;k<mularray.length;k++) {
				multemp[multemp.length-1-k] += mularray[multemp.length-1-k];
				if(multemp[multemp.length-1-k]>=10) {
					multemp[multemp.length-1-k-1] +=multemp[multemp.length-1-k]/10;
					multemp[multemp.length-1-k] = multemp[multemp.length-1-k]%10;
				}
				else {multemp[multemp.length-1-k] = multemp[multemp.length-1-k]%10;
			}
			//multemp에 덧셈 수행 후 다시 외부 반복문으로 복귀. mularray는 초기화.
		}
		
	}
		//for(int m=0;m<multemp.length;m++) {System.out.print(multemp[m]);}
		System.out.print("40자리수 이하 X와 Y의 곱 : ");
		for(int m=multemp.length-(larger_arr*2);m<multemp.length;m++) {System.out.print(multemp[m]);}
		

}
}

