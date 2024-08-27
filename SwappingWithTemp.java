package week2.Day2;

public class SwappingWithTemp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("before swapping a =" +a);
		System.out.println("before swapping b =" +b);
		System.out.println("*************************");
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a =" +a);
		System.out.println("after swapping b ="+b);

	}

}

/*output
 before swapping a =10
before swapping b =20
*************************
after swapping a =20
after swapping b =10*/

