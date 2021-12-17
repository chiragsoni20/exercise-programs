package sigletonPattern;

public class AppConfig {
	
	private AppConfig() {
		// TODO Auto-generated constructor stub
		//getInstance();
	}
	
	private static AppConfig obj = null;
	
	public static AppConfig getInstance() {
		
		if(obj==null) {
			obj = new AppConfig();
		}
		
		return obj;
	}

}
