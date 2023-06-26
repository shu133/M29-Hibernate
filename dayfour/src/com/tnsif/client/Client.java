package com.tnsif.client;
import com.tnsif.service.BookService;
import com.tnsif.service.BookServiceImpl;

public class Client {
	public static void main(String[] args) {
	BookService service=new BookServiceImpl();
	
	System.out.println("Book with specific ID:");
	System.out.println(service.getBookByID(101));
	
	System.out.println("Book with specific Author:");
	System.out.println(service.getAuthorBooks("Dennis Ritchie"));
	
	System.out.println("Book with specific title:");
	System.out.println(service.getBookByTitle("AI"));
	
	System.out.println("Book Count:");
	System.out.println(service.getBookCount());
	
	System.out.println("Book with specific price range:");
	System.out.println(service.getBookByPrice(300,500));

}
}
