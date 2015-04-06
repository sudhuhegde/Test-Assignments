
public class PrintPattern {

	public static void main(String[] args) {
		int count =5,i,j;
		for (i=1;i<=count;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
				
			}
			System.out.println();
		}
		for (i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
				
			}
			System.out.println();
				
		}

}
}