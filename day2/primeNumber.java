package week1.day2;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		int i=0;
		
		{
			for(int a=1;a<=n;a++)
			{
				if(n%a==0)
				i++;
			}
			if(i==2)		
				{
				System.out.println("It is a Prime number");
				
			    }
				else
				{
				System.out.println("It is Not a prime number");
				}
		}	        
		       
				
	
}
}