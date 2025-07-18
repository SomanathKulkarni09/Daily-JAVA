package PracticeQ;

public class OneConstrInANother {

	public OneConstrInANother() {
		System.out.println("hi");
	}
	
	public OneConstrInANother(int a) {
		
		this();
		System.out.println("bye");
		
	}
	public static void main(String[] args) {
		OneConstrInANother o=new OneConstrInANother(2);
	}
}
