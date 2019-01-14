
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
				System.out.print(" ");
				for(int k=0;k<=i;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
		}
		
		for(int i=3;i>=0;i--)
		{
			for(int j=4;j>=i;j--)
			System.out.print(" ");
				for(int k=0;k<=i;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
		}
		
	}

}
