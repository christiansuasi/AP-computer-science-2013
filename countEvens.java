//Christian Suasi

import java.util.Random;

public class countEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int [] scores = new int[8];
		//generates new array size 8. 0-7
		int i = 0;
		

		int [] list = getEvens(scores);
		
		for (i = 0; i < scores.length; i++)
		{
			int num = rand.nextInt(11) + 10;
			//numbers 11-20
			scores[i] = num;
			System.out.println(num + " " );
		}
		
		System.out.println("# of Evens = " + countEvens(scores));
		}  
	
	public static int countEvens(int [] nums)
	{
		int evens = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] % 2 == 0){
				evens ++;
			}
		}
		return evens;
	}

	public static int[] getEvens(int [] nums){	
		
		int [] evens = new int[countEvens(nums)] ;
		
		int b = 0;
		
		for (int i = 0; i < b; i++)
		{
			if (nums[i] % 2 == 0)
			{
				evens[b] = nums[i] ;
				b++;
			}
			
		}
		return evens;
	}
}

/*
13 
15 
16 
20 
19 
10 
11 
16 
# of Evens = 4
*/
