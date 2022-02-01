package entornos;


public class Triangle {
	int a;
	int b;
	int c;
	public Triangle (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String type() {
		String type = "";
		if ((a <=0) || (b<=0) || (c<=0)) 
			type = "INVALID";
		else if ((a+b<=c) || (a+c<=b) || (b+c<=a))
			type = "NOT_A_TRIANGLE";
		else if ((a==b) && (b==c))
			type = "EQUILATERAL";
		else if ((a==b) || (b==c) || (a==c))
			type = "ISOSCELES";
		else
			type = "SCALENE";
		return type;
	}
}
