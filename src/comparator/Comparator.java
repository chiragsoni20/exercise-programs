package comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comparator {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		List<Player> player = new ArrayList<Player>();
		
		for(int i=0; i<num; i++) {
			
			int score = sc.nextInt();
			String name = sc.nextLine();
			
			player.add(new Player(name, score));
		}
		
		player.forEach(System.out::println);
		
	}

}
