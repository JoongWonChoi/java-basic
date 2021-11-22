class Circle{
	private int radius;
	public Circle(int radius) {this.radius = radius;}
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius = radius;}
}
class Circlemanager{
	static void copy(Circle	src, Circle dest) {
		dest.setRadius(src.getRadius());
	}
	static boolean equals(Circle a, Circle b) {
		if(a.equals(b)){System.out.println("True");return true;}
		else
			System.out.println("false");
			return false;
		
	}
	
}
public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circlemanager cm = new Circlemanager();
		Circle c1 = new Circle(5);
		System.out.println(c1.getRadius());
		Circle c2 = new Circle(1);
		System.out.println(c2.getRadius());
		cm.equals(c1,c2);
		cm.copy(c1, c2);
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		cm.equals(c1,c2);

	}

}
