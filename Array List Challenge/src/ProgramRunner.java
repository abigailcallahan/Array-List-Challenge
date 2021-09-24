import java.util.ArrayList;

public class ProgramRunner
	{
		static ArrayList<Program> TVShows = new ArrayList<Program>();
		public static void main(String[] args)
		{
		//Program is the name of the class I am pulling from
		
		
		TVShows.add(new Program("The Office", "Sitcom", 9));
		TVShows.add(new Program("Parks and Rec", "Sitcom", 7));
		TVShows.add(new Program("New Girl", "Comedy", 7));
		TVShows.add(new Program("Grey's Anatomy", "drama", 18));
		TVShows.add(new Program("Outer Banks", "Mystery", 2));
		
		//this will print the entire arrayList?
		printList();
		//add a year to numberofseasonsaired
//		printList();
//		//delete show with longest title
//		printList();
//		//change title of the first show to something else
//		printList();
//		
		}
		
		public static void printList()
		{
			for(int i = 0; i < TVShows.size(); i++)
			{
				System.out.println(TVShows.get(i).getTitle() + ", " + TVShows.get(i).getGenre() + ", " + TVShows.get(i).getNumberOfSeasonsAired());
			}
					
		}
		
	}
