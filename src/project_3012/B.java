package project_3012;

public class B {

	 int x=2;
	 void triple () {x=x*3;}
	 int returnIT() {return x;}

	}

	class C extends B{
		void triple () {
			x=x+3;

		}

	}

	class main{
		public static void main (String [] args) {
			B b = new B();
			System.out.println("b,x: + b,returnit()");
			C c = new C();
			System.out.println("c,returnit()");
			b.triple ();
			c.triple ();
			System.out.println("b,x posle b.triple(): "+ b.returnit());
			System.out.println("c,x posle c.triple(): "+ c.returnit());

		

		}

	}