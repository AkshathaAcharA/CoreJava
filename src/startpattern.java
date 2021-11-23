
public class startpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		int alpha=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j));
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
