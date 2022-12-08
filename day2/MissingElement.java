package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= {1,2,3,4,7,6,8};

		Arrays.sort(numbers);
		int length=numbers.length;

	for(int i=1; i<length;i++)
	{ 
		if(i!=numbers[i-1])
		{
			System.out.println(" Missing Number is:" +i);
			break;
			}
		}

	}

}
