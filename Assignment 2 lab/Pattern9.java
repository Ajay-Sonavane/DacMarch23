class Pattern9
{
	public static void main (String args [])
	{
		int alpha =64;
		int j;
		for (int i=1; i<=5; i++)
		{
			for ( j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
		   
		   for (int k=1; k<=i;k++)
		   {
			   System.out.print(" "+(char) (alpha+k));
		   }
		
		        System.out.println();
		}    
		
		
	}
}