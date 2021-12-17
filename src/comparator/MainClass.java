package comparator;

import java.util.*;

public class MainClass {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		List<Player> player = new ArrayList<>();

		for(int i=0; i<num; i++) {
			
			int score = sc.nextInt();
			String name = sc.nextLine();
			
			player.add(new Player(name, score));
		}
		Collections.sort(player, new SortName());
		
		player.forEach(System.out::println);		
	}

}

class SortName implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		if(o1.score < o2.score) 
			return 1;
		else
			if(o1.score > o2.score)
				return -1;
		
		return 0;
	}
	
}
