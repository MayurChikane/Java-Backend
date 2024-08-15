package Polymorphism;

public class ShapeMtdOverLoading {
	double area;

	public void calArea(int radius) {
		area = (3.14) * radius * radius;
		System.out.println("Area of Circle: " + area);
	}

	public void calArea(double d, double e) {
		area = d * e;
		System.out.println("Area of rectangle: " + area);
	}

	public void calArea(float base, float height) {
		area = (0.5) * base * height;
		System.out.println("Area of triangle: " + area);
	}

	public static void main(String[] args) {
		ShapeMtdOverLoading obj1 = new ShapeMtdOverLoading();
		obj1.calArea(7);
		obj1.calArea(4, 6);
		obj1.calArea(4.2, 9.6);

	}

}
