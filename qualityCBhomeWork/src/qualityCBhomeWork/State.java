package qualityCBhomeWork;

public class State extends country {
	
	private String StateName = "Maryland";
	
	public static void main(String[] args) {

	State myState = new State();
	
	myState.wether();
	
	System.out.println(myState.StateName + " " + myState.population);
	}
}
