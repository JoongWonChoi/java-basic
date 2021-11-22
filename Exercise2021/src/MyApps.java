class CircleTwo {
	private int radius;
	public CircleTwo() {radius= 0;}
	public CircleTwo(int radius) { this.radius = radius;}
	public int getRadius() {return this.radius;}
	public void setRadius(int radius) {this.radius = radius;}
}

class NamedCircle{
	int radius2;
	String nc;
	CircleTwo c = new CircleTwo();
	NamedCircle(int radius, String abc){
		c.setRadius(radius);
		this.nc = abc;
	}
	
	void show() {
		System.out.println("exec show()");
		System.out.println(c.getRadius());
		System.out.println(nc);
	
	}
	
}


public class MyApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamedCircle w=new NamedCircle(5, "Waffle");
		w.show();

	}

}
