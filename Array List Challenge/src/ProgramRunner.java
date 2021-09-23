import java.util.ArrayList;

public class ProgramRunner
	{
		static int longestWord = 0;
		public static void main(String[] args)
		{
		//Program is the name of the class I am pulling from
		ArrayList<Program> TVShows = new ArrayList<Program>();
		
		TVShows.add(new Program("The Office", "Sitcom", 9));
		TVShows.add(new Program("Parks and Rec", "Sitcom", 7));
		TVShows.add(new Program("New Girl", "Comedy", 7));
		TVShows.add(new Program("Grey's Anatomy", "drama", 18));
		TVShows.add(new Program("Outer Banks", "Mystery", 2));
		
		printList();
		System.out.println("This is a test to see if I can put it back into GitHub");
		}
		
		public static void printList()
		{
			for(int i = 0; i < TVShows.size(); i ++)
				{
					if(TVShows.get(i) > longestWord)
						{
							
						}
				}
		}
		
	}
