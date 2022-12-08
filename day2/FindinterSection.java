package week1.day2;

public class FindinterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {3,2,11,4,6,7};
		
		int array2[]= {1,2,8,4,9,7};
		
		System.out.println("The Intersections are");
		
		for(int a=0;a<array1.length;a++)
		{
			for(int b=0;b<array2.length;b++)
			{
				if(array1[a]==array2[b])
					
					System.out.println(array2[b]);
			}
		}

	}

}
