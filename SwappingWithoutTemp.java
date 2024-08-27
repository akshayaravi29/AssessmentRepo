package week2.Day2;

public class SwappingWithoutTemp {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println("before swapping a ="+a);
		System.out.println("before swapping b ="+b);
		System.out.println("**********************");
		b=b-a;
		a=a+b;
		System.out.println("after swapping a ="+a);
		System.out.println("after swapping b ="+b);

	}

}
/* before swapping a =1
before swapping b =2
**********************
after swapping a =2
after swapping b =1 */