
public class BookStateDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Based on the Author mood books will be developed \n");
		
		BookContext bookContext = new BookContext();
 
		bookContext.setState(new Love());
		
		AuthorMood authMood = new AuthorMood();
		authMood.setMood("Fun");
		bookContext.setMood(authMood);
		bookContext.change(authMood.getMood());
		
		
	}
}
