
public class BookContext {
	
	public State state ;
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public  AuthorMood mood ;

	public AuthorMood getMood() {
		return mood;
	}

	public void setMood(AuthorMood mood) {
		this.mood = mood;
	}
	
	public void change(String val) {
		
	 if(val.equals("Fun")) {
		 state = new Fun();
	 }else if(val.equals("Political")) {
		 state = new Political() ;
	 }else if(val.equals("Love")) {
		state = new Love();
	 }
		
		
		
	}
	
	

}
