package statickeyword;

public class StaticVariable {
	static int a=0;
	int b=0;

	public static void main(String[] args) {
		
		
		//static behaviour COMMON 
		StaticVariable st1=new StaticVariable();
		StaticVariable st2=new StaticVariable();
		st1.a++;
		System.out.println(st1.a);
		st2.a++;
		System.out.println(st2.a);
		
		//Normal Behaviour SEPERATE
		st1.b++;
		System.out.println(st1.b);
		st2.b++;
		System.out.println(st2.b);
	}
	  
	

}
