package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=34343;
		
		int a,sum=0,temp = 0;
		sum=temp;
		
		 temp=n;    
		  while(n>0){    
		   a=n%10;    
		   sum=(sum*10)+a;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome number");    
		}  
		}  