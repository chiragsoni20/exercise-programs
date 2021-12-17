package comparator;


public class Player{
	
	String name;
	int score;
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}	

}
