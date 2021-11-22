import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("입력할 정수 개수");
		 int size = sc.nextInt();
		 int[] list = new int[size];
		 
		 for(int i=0;i<size;i++) {
			 int input = sc.nextInt();
			 list[i] = input;
		 }
		 Arrays.sort(list);
		 
		 int sum=0;
		 float average=0;
		 for(int j=0;j<size;j++) {
			 sum+=list[j];
		 }
		 average = (float)sum/size;
		 
		 System.out.println("average : "+average);
		 
		 float median=0;
		 if(size%2!=0) {
			 median = list[size/2];
		 }
		 else {
			 median = (float)(list[size/2-1]+list[size/2])/2;
		 }
		 System.out.println("median : "+median);
		 

	}

}
