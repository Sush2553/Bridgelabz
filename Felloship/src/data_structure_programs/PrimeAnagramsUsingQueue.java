package data_structure_programs;

public class PrimeAnagramsUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>();
		int res[]=Utility_datastructure.primeAnagrams(1000);
		for(int i:res)
			queue.enque(i);  //add to queue
			queue.display();
	}

}

