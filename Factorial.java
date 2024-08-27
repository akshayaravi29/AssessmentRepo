package week2.Day2;

public class Factorial {
	public static void main(String[] args) {
		int a=5;
		int fact=1;
		for(int i=a; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println("The factorial of "+ a +"is =" + fact);
	}

}
//output
//The factorial of 5is =120

