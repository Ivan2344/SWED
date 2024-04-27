package Ulamlol;

public class ulammain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ulam(127));
	}
	
	public static int ulam(int n) 
	{
		while(n > 1) 
		{
			if(n % 2 == 0) 
			{
				n = n/2;
			}else 
			{
				n = (n*3) + 1;
			}
		}
		return n;
	}

}
