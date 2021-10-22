package overriding;

public class Child implements Parent {
	
	public static void main(String[] args) {
		
		Child child=new Child();
		child.m1();
		child.m1(2, 2);
		
	}

	@Override
	public void m1() {
		System.out.println("jjbj");
		
	}

	@Override
	public void m1(int a, int b) {
		
		System.out.println("jbbbh");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
