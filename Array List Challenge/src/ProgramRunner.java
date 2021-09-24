import java.util.ArrayList;

public class ProgramRunner
	{
		static ArrayList<Program> TVShows = new ArrayList<Program>();
		static int longestTitle = 0; 
		static String longerTitle;
		
		public static void main(String[] args)
		{
		//Program is the name of the class I am pulling from
		TVShows.add(new Program("The Office", "Sitcom", 9));
		TVShows.add(new Program("Parks and Rec", "Sitcom", 7));
		TVShows.add(new Program("New Girl", "Comedy", 7));
		TVShows.add(new Program("Greys Anatomy", "Drama", 18));
		TVShows.add(new Program("Outer Banks", "Mystery", 2));
		
		//this will print the entire arrayList
		printList();
		
		//add a year to every numberofseasonsaired
		System.out.println("\nLet's add a year to each season in each show:\n");
		for(int i = 0; i < TVShows.size(); i++)
			{
				TVShows.get(i).setNumberOfSeasonsAired(TVShows.get(i).getNumberOfSeasonsAired() + 1);
			}
		printList();
		
		//delete show with longest title
		System.out.println("\nOk, now I am going to delete the show with the longest title\n");

		for(int i = 0; i < TVShows.size(); i++)
			{
				if((TVShows.get(i).getTitle().replaceAll(" ", "").length()) > longestTitle)
					{
						longestTitle = TVShows.get(i).getTitle().replaceAll(" ", "").length();
						longerTitle = TVShows.get(i).getTitle();
					}
			}

		for(int i = 0; i < TVShows.size(); i++)
			{
				if(TVShows.get(i).getTitle().equals(longerTitle)) 
					{
						TVShows.remove(i);
					}
			}
		printList();
		
		//change title of the first show to something else
		System.out.println("\nNow I am going to change the title of the first show to something else\n");
		TVShows.get(0).setTitle("Gilmore Girls");
		printList();
		}
		
		public static void printList()
		{
			System.out.println("Your shows are: ");
			for(int i = 0; i < TVShows.size(); i++)
			{
				System.out.println(TVShows.get(i).getTitle() + ", " + TVShows.get(i).getGenre() + ", " + TVShows.get(i).getNumberOfSeasonsAired());
			}
					
		}

	}
