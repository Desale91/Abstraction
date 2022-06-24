package Demo1;

public class Sample1 extends Demo1 {

	public static void main(String[] args) {
		
		Demo1 obj = new Sample1();
		obj.m1();
		obj.m2();
		//obj.s2();

	}

	@Override
	public void m2() {

		System.out.println("s2 method in Sample1 class");
	}
	
	public void s2() {
		
		System.out.println("s2 method in sample1 class");
	}

}
