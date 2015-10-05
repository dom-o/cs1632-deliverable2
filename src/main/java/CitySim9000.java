import java.util.*;

public class CitySim9000
{
	public static void main(String[] args)
	{
		if(args.length == 1)
		{
			try
			{
				int seed = Integer.parseInt(args[0]);
				Map.setRand(seed);
				Driver[] drivers = new Driver[5];
				for(int i = 0; i<5; i++)
				{
					drivers[i] = new Driver(i);
					String[] drive_list = drivers[i].drive();
					for(String step : drive_list)
					{
						System.out.println(step);
					}
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Error: int required.");
			}
		}
		else
		{
			System.out.println("Error: 1 argument required; " + args.length + " arguments given.");
		}
	}
}