import java.util.Scanner;

public class Bidon {

	static Scanner sc=new Scanner(System.in);
	private static final int w=0;
	static int x =sc.nextInt();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bidon a = new Bidon();
//		String s=a.toString();
//		boolean b=a.equals("bonjour");
//		boolean c=a.equals(a);
		
		B b1=new B();
		B b2=new B(2003);
		B b3=new B("bonjour");
		System.out.println("b1.x="+b1.x+" b2.x="+b2.x +" b3.x="+b3.x);
		
	}

}

