package Encapsulation;

public class DistanceObjPassAsParm {
	int m, cm;

	DistanceObjPassAsParm() {
		System.out.println("Default Constructor called here");
	}

	DistanceObjPassAsParm(int m, int cm) {
		this.m = m;
		this.cm = cm;
	}

	@Override
	public String toString() {
		return "DistanceObjPassAsParm [m=" + m + ", cm=" + cm + "]";
	}

	public DistanceObjPassAsParm add(DistanceObjPassAsParm d2) {
		DistanceObjPassAsParm d3 = new DistanceObjPassAsParm();
		d3.cm = this.cm + d2.cm;
		d3.m = this.m + d2.m;
		if (d3.cm >= 100) {
			d3.m = m + 1;
			d3.cm = d3.cm - 100;
		}
		return d3;
	}

	public static void main(String[] args) {
		DistanceObjPassAsParm d1 = new DistanceObjPassAsParm();
		DistanceObjPassAsParm d2 = new DistanceObjPassAsParm(40, 80);
		DistanceObjPassAsParm d3 = new DistanceObjPassAsParm(20, 74);
		System.out.println(d3.add(d2));
	}

}
