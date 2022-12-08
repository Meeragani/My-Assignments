package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=8;
		int a=0;
		int b=1;
		int sum=0;

		System.out.println("The Fibonacci series are");
		System.out.println(a);

		for(int i=0; i<r;i++)
		{
			sum=a+b;
				a=b;
				b=a;
				b=sum;
				System.out.println(sum);
		}


	}

}
