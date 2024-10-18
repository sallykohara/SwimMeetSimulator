import java.util.ArrayList;
import java.util.Random;




public class swimRelay
	{
		public static void main(String[] args) 
			{
				RelayLane.fillTeam();
				delay();
				ArrayList<InitialVsResult> results = simulateRelay();
				displayResults(results);
			}
	
		
				public static ArrayList<InitialVsResult> simulateRelay()
					{
					ArrayList<InitialVsResult> results = new ArrayList<>();
					Random random = new Random();
						System.out.println("We're getting ready to swim the 400 freestyle relay at the 2016 Rio Olympics!! Here are the relays sorted from slowest to fastest:");
						System.out.println("1: Canada, Time = 3:15.66 (195.66 seconds)");
						System.out.println("2: Sweden, Time = 3:15.54 (195.54 seconds)");
						System.out.println("3: Great Britain, Time = 3:15.23 (193.23 seconds) ");
						System.out.println("4: South Africa, Time = 3:14.89 (194.89 seconds)");
						System.out.println("5: Australia, Time = 3:14.65 (194.65 seconds)");
						System.out.println("6: Italy, Time = 3:13.45 (193.45 seconds)");
						System.out.println("7: France, Time = 3:12.36 (192.36 seconds)");
						System.out.println("8: United States, Time = 3:12.23 (192.23 seconds)");
						delay(); 
						
						System.out.println(" ");
						System.out.println("France and the United States have a rivalry, who is going to win this race?");
						System.out.println(" ");
						System.out.println("With the United States seeded first at a 3:12.23, these are the relays in their lanes:");
						
						
				for(Times swimmer : RelayLane.team) 
					{
							System.out.println("Lane " + (RelayLane.team.indexOf(swimmer) + 1) + ": " + swimmer.getName());
					}
						
						System.out.println(" ");
						delay();
						System.out.println(" Starting the Mens 400 Freestyle Relay:");
						delay(); 
						System.out.println("First leg swimmers, take your mark... ");
						delay();
						System.out.println("*BEEP*");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				        System.out.println("|     |     |     |     |     |     |     |     |");
				    delay();
	
				    for(Times swimmer : RelayLane.team)
			    	{
			    		double initialTime = swimmer.getSeconds();
			    		double finalTime = initialTime - (random.nextDouble()*5);
			    		InitialVsResult result = new InitialVsResult(swimmer.getName(), initialTime, finalTime);
			    		results.add(result);
			    	}
				   return results;
					}
				
				public static void displayResults(ArrayList<InitialVsResult> results)
			    {
			        System.out.println("Results of the relay:");
			        for (InitialVsResult result : results) {
			            double timeDifference = result.getFinalTime() - result.getInitialTime();
			            System.out.printf("Swimmer: %s, Initial Time: %.2f seconds, Final Time: %.2f seconds, Time Difference: %.2f seconds (Improved: %s)%n",
			                    result.getCountry(), result.getInitialTime(), result.getFinalTime(), timeDifference, result.improved());
			        }
			    }
			
				public static void announceWinner(ArrayList<InitialVsResult> results)
				{
					InitialVsResult winner = results.get(0);
					for(InitialVsResult result: results)
					{
						if(result.getFinalTime() < winner.getFinalTime()) {
							winner = result;
						}
					}
					System.out.println("The winner is " +winner.getCountry()+ "with a final time of " +winner.getFinalTime()+ ".");
				}


					public static void delay()
				    {
				      try
				        {

				              Thread.sleep(3000);
				          }
				      catch (InterruptedException e) 
				        {
				          System.out.println("main thread interrupted");
				      }
				    }
				}

