import java.util.Scanner;




public class lotofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("40�ڸ��� ���� X �Է� => ");
		String x = sc.nextLine();
		System.out.print("40�ڸ��� ���� Y �Է� => ");
		String y = sc.nextLine();
		

		int intarray[] = new int[40];
		int intarray2[] = new int[40];
		int countarray[] = new int[41];//�ø�
		int temp[] = new int[41];//�ڸ����� ����� ����
		int result[] = new int[41];
		
		String str1[] = x.split("");
		String str2[] = y.split("");
		
		for(int i=0;i<str1.length;i++) {
			intarray[intarray.length-1-i]=Integer.parseInt(str1[str1.length-1-i]);//str1�� ������ index->intarray�� ������ index
			}
		for(int i=0;i<str2.length;i++) {
			intarray2[intarray2.length-1-i]=Integer.parseInt(str2[str2.length-1-i]);//str1�� ������ index->intarray�� ������ index	
		}
		//����40 �迭�� �������ķ� ���ڵ� ����
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
		System.out.print("40�ڸ��� ���� X�� Y�� �� : ");
		for(int m=result.length-larger_arr-1;m<result.length;m++) {System.out.print(result[m]);}
		System.out.println();
		//����
		
		
		int multemp[] = new int[81];//���� �� ������ ���� ���� ���̴� �ִ� 2n�̴�(80)

		for(int i=0;i<intarray2.length;i++) { //�ι�° �ٿ� �� ���鸸ŭ �ݺ�
			int mularray[] = new int[81];//�ݺ� �� ������ mularray �迭 �ʱ�ȭ
			
			for(int j=0;j<intarray.length;j++) {//ù��° �� �� ����ŭ �ݺ�
				int mul_eachSum = intarray2[intarray2.length-1-i]*intarray[intarray.length-1-j];
				if (mul_eachSum>9) {//�ø�ó��
					mularray[mularray.length-1-j-i-1]+=mul_eachSum/10;//�����ڸ� ���� ���� �ε����� �ø�ó��
					mularray[mularray.length-1-j-i]+=mul_eachSum%10; // �����ڸ� �� ����
					if(mularray[mularray.length-1-j-i]>9) {
						mularray[mularray.length-1-j-i-1]+=mularray[mularray.length-1-j-i]/10;
						mularray[mularray.length-1-j-i]=mularray[mularray.length-1-j-i]%10;}
					}
				else {mularray[mularray.length-1-j-i]+=mul_eachSum%10;}
			}//1ȸ �ݺ� �Ϸ�, mularray�� ���.
				
			
			//temp+=mularray ������ ��ġ�� �ι�° �� ��� ����ŭ ���� �ݺ�.
			//ó�� temp�� ����ֱ� ������ ���� �ص� ��� ����
			for(int k=0;k<mularray.length;k++) {
				multemp[multemp.length-1-k] += mularray[multemp.length-1-k];
				if(multemp[multemp.length-1-k]>=10) {
					multemp[multemp.length-1-k-1] +=multemp[multemp.length-1-k]/10;
					multemp[multemp.length-1-k] = multemp[multemp.length-1-k]%10;
				}
				else {multemp[multemp.length-1-k] = multemp[multemp.length-1-k]%10;
			}
			//multemp�� ���� ���� �� �ٽ� �ܺ� �ݺ������� ����. mularray�� �ʱ�ȭ.
		}
		
	}
		//for(int m=0;m<multemp.length;m++) {System.out.print(multemp[m]);}
		System.out.print("40�ڸ��� ���� X�� Y�� �� : ");
		for(int m=multemp.length-(larger_arr*2);m<multemp.length;m++) {System.out.print(multemp[m]);}
		

}
}

