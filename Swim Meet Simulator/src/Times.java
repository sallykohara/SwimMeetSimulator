
public class Times
	{
			private String name; 
			private int minutes; 
			private int seconds;
			private int milliseconds;
			
			public Times(String n, int m, int s, int j)
			{
				name = n;
				minutes = m;
				seconds = s;
				milliseconds = j;
				
			}
			public String getName()
			{
				return name;
			}
			public void setName(String n)
			{
				name = n;
			}
			public int getMinutes()
			{
				return minutes;
			}
			public void setMinutes(int m)
			{
				minutes = m;
			}
			public int getSeconds()
			{
				return seconds;
			}
			public void setSeconds(int s)
			{
				seconds = s;
			}
			public int getMilliseconds()
			{
				return milliseconds;
			}
			public void setMilliseconds(int j)
			{
				milliseconds = j;
			}
			
		
			
		}
	
