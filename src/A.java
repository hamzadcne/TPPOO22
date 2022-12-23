
public class A {
	public int x;
	public A() {x=10;}
}


class B extends A{
public B() {x++;}
public B(int i) { this(); x=x+i; }
public B(String s) { super(); x--; }
}

