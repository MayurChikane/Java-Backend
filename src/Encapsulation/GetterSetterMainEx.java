package Encapsulation;

public class GetterSetterMainEx {

	public static void main(String[] args) {
		GetterSetterEx t= new GetterSetterEx();
		System.out.println(t.toString());
		t.setEage(32);
		System.out.println(t.getEage());
		t.setEname("Ganesh");
		System.out.println(t.getEname());
		t.setEgen('M');
		System.out.println(t.getEgen());
		t.setEsal(76000);
		System.out.println(t.getEsal());
	}

}
