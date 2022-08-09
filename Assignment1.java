class Assignment1
{
	public static void main(String[]args)
	{
        int[]arrvalue = {10, 11, 12, 13, 15, 18, 20, 32};
        int num = (arrvalue.length) / 2;
        if (num%2 == 0) 
		{
            for (int i=(num - 1); i <= num; i++) 
			{
                System.out.println(arrvalue[i]);
            }
        }else 
		    {
                System.out.println(arrvalue[num]);
            }
	}
}