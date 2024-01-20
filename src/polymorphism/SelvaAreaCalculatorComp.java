package polymorphism;

public class SelvaAreaCalculatorComp {

	public int getArea(int side) {
		return side*side;
	}
	public double getArea(double side) {
		return side*side;
	}
	public double getArea(double len,double wid) {
		return len*wid;
	}
	public int getArea(int len,int wid) {
		return len*wid;
	}
	

}
