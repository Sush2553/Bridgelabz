package functional_Programs;

import utility.Utility;
/**
 * @author Sushant Patwari
 * @version 1.0
 */
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake,goal,trails;
		System.out.println("enter amount:");
		stake=Utility.getInt();
		System.out.println("enter goal:");
		goal=Utility.getInt();
		System.out.println("enter number of trails:");
		trails=Utility.getInt();
		int wins=0;
		int loss=0;
		int count=0;
			int cash = stake;
			{
				if(goal<=cash)
				System.out.println("goal is less than or equal to cash");
			
				else 
				{
						for(int m=1;m<=trails;m++)
						{
							count++;
							double v=Math.random();
							if(v< 0.5) 
							{
								loss++;	
								cash=cash-1; //if looses,deduct 1 from cash
							}	
							else 
							{
								wins++;
								cash=cash+1;	//if wons,add 1 to cash
							}
						
					
			//check whether goal has reached or not	
			if(cash==goal)
			{
				System.out.println("reached goal...");
				break;
			}
			
		}
			if(cash<goal)
				System.out.println("can't reach the goal...");
			//calculate win and loss percentage
			double pw= (wins*100)/count;
			System.out.println(" win percentage="+pw);
			double pl= (loss*100)/count;
			System.out.println(" loss percentage="+pl);
			
			}
		
	}

}
}
