package Encapsulation;

public class GetterSetterEx {
	private int eage = 17;
	private String ename = "Mayur";
	private char egen = 'M';
	private long esal = 50000;

	@Override
	public String toString() {
		return "GetterSetterEx [eage=" + eage + ", ename=" + ename + ", egen=" + egen + ", esal=" + esal + "]";
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public char getEgen() {
		return egen;
	}

	public void setEgen(char egen) {
		this.egen = egen;
	}

	public long getEsal() {
		return esal;
	}

	public void setEsal(long esal) {
		this.esal = esal;
	}

	public static void main(String[] args) {
		GetterSetterEx g = new GetterSetterEx();
		g.setEage(25);
		g.setEname("Mayur");
		g.setEgen('M');
		g.setEsal(35000);

		System.out.println(g.getEage());
		System.out.println(g.getEname());
		System.out.println(g.getEgen());
		System.out.println(g.getEsal());
		System.out.println(g.toString());
	}
}
