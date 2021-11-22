import java.util.*;
import java.io.*;


class Card {
int num;
Card() {};
Card(int n) { num = n; }
public String toString() {
return "wow" + num;
}
}



public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		ArrayList list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(1, 100);
		System.out.println(v);
		System.out.println(v.get(2));
		
		int arr[] = new int[10];
		Arrays.fill(arr, 200);
		System.out.println(Arrays.toString(arr));
		int a=10;
		int b=9;
		
		List<String> list2 = Arrays.asList("2","3","2","3","4"); 
		//Arrays.toString(list2)
		String str [] = {"!","@"};
		System.out.println(Arrays.toString(str));
		
		
		System.out.println(list2);
		
		try {
			String filename = "test2.txt";
			FileInputStream fis = new FileInputStream(filename);
			FileReader fr = new FileReader(filename);
			
			int data = 0;
			while((data = fis.read())!=-1) {
				System.out.print((char)data);
			}
			data = 0;
			while((data=fr.read())!=-1) {
				System.out.println((char)data);
			}
			fis.close();
			fr.close();
			
		
	}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
		Card card = new Card(100);
		//card.toString();
		System.out.println(card);
		
		
		
		
		

	}

}
