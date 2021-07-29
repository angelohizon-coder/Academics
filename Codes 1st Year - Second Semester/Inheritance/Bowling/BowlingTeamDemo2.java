import java.util.*;

public class BowlingTeamDemo2
{
	public static void main(String[] args)
	{
		String name;
		BowlingTeam bowlTeam = new BowlingTeam();
		
		int x;
		final int NUM_TEAM_MEMBERS =  4;
		final int NUM_TEAMS = 4;
		BowlingTeam[] team = new BowlingTeam[NUM_TEAMS];
		int y;
		
		Scanner input = new Scanner(System.in);
		
		for (y = 0; y < NUM_TEAMS; ++y)
		{
			team[y] = new BowlingTeam();
		
			System.out.print("Enter Team Name: ");
			name = input.nextLine();
			team[y].setTeamName(name);
			
			for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team member's name: ");
				name = input.nextLine();
				team[y].setMember(x, name);
			}
		}
		
		//System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		//for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
		//	System.out.println(bowlTeam.getMember(x) + " ");
		
		//System.out.println();
		
		for (y = 0; y < NUM_TEAMS; y++)
		{
			System.out.println("\nMembers of team " + team[y].getTeamName());
			
			for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
				System.out.print(team[y].getMember(x) + " ");
			System.out.println();
		}
	}
}