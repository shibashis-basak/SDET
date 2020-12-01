package javaactivity2;

public class Activity1_2 {

	public static void main(String[] args) {
		
		int[] iarr= {10, 77, 10, 54, -11, 10};
		int arrlen= iarr.length;
		int arrsum=0;
		for (int i=0; i<arrlen; i++) 
		{
			if (iarr[i]%10==0)
				arrsum+=iarr[i];		
		}
		if (arrsum==30)
			System.out.println("The sum is 30");
		else
			System.out.println("The sum is not 30");
	}

}
