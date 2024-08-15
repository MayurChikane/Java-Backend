package Encapsulation;

public class ToStringEncap {

	private int rollno = 12;
	private String name = "Akash";
	private char std = '5';

	@Override
	public String toString() {
		return "ToStringEncap [rollno=" + rollno + ", name=" + name + ", std=" + std + "]";
	}

	public static void main(String[] args) {
		ToStringEncap t = new ToStringEncap();
		System.out.println(t.toString());
	}

}
