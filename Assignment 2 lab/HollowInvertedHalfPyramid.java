class HollowInvertedHalfPyramid 
{
    public static void main (String args [])
	{
		 int n=6;
	    for (int i=1 ; i <=5; i++)
		{
		      for(int j =1; j<=5; j++)
				  
			  {
				  
				 if (i==1|| j==1 || j== n-i)
			      System.out.print("*");
			  
			  else 
				  System.out.print(" ");
			  }
			  System.out.println();
		}
	}
}
/*   ******
     *   *
     *  *
     * *
     **
     *
         */