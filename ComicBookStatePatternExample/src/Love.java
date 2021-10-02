
public class Love implements State {
	
	Love(){
		writeBook(new AuthorMood());
	}

	@Override
	public void writeBook(AuthorMood mood) {
		System.out.println("Author cretaed Love related Book");
		
	}

}
