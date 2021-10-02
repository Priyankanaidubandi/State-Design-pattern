
public class Fun implements State {
	
	Fun(){
		writeBook(new AuthorMood());
	}

	@Override
	public void writeBook(AuthorMood mood) {
		 
		System.out.println("Author cretaed Commic related Book");
		
	}

}
