
public class PrimeNumbers {

	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=100;i++)
		{
			int counter=0;
				for (j=i;j>=1;j--)
				{
						if(i%j ==0)	
						{
							counter = counter+1;
						}
				}
				if (counter == 2)
				{
				System.out.println(" " + i );
				}
				
			}
				
		}
}