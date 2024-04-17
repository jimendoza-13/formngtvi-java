public class Book { 
	  String title;
	  String author;
	  int yearPublished; 
	  double price;
	   
	  //creating constructor  
	  Book(String bookname, String bookauthor, int published, double cost){    
	  title = bookname;  
	  author = bookauthor;
	  yearPublished = published;
	  price = cost;
	    }  
	   
	    void display(){
	    	System.out.println("Title: "+title);
	    	System.out.println("Author: "+author);
	    	System.out.println("Year Published: "+yearPublished);
	    	System.out.println("Price: $"+price);
	    	System.out.println();
	    	}  
	   
	  public static void main(String args[]){ 
	  Book book1 = new Book("Java Programming","John Smith",2021,39.99);  
	  Book book2 = new Book("Pyhton Basics","Jane Doe",2020,29.99);  
	  Book book3 = new Book("C++ Essentials","Michael Johnson",2019,49.99);
	  
	  System.out.println("Book 1:");
	  book1.display();  
	  System.out.println("Book 2:");
	  book2.display(); 
	  System.out.println("Book 3:");
	  book3.display(); 
	   }  
	}
