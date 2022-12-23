
public class C<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C<Integer> ci=new C<Integer>();
		C<Double> cd = new C<Double>();
		
		Class cci=ci.getClass();
		Class ccd=ci.getClass();
		
		System.out.println(cci.getName());
		System.out.println(ccd.getName());
	
	}

}
