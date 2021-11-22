import java.util.Scanner;


class CheckPalindrome{
	public boolean isPalindrome(String word){
		int start = 0;
		int last = word.length()-1;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(start)!=word.charAt(last)) {
				return false;
			}
			start+=1;last-=1;
		}
		return true;
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		CheckPalindrome cp = new CheckPalindrome();
		boolean isBoolean = cp.isPalindrome(word);
		System.out.println("is palindrome? " + isBoolean); 
	}

}
