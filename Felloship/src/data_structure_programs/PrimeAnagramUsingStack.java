package data_structure_programs;

public class PrimeAnagramUsingStack
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<Integer>();
		int res[]=Utility_datastructure.primeAnagrams(1000);
		for(int i=res.length-1;i>=0;i--)
			stack.push(res[i]);
			stack.display();
	}

}
