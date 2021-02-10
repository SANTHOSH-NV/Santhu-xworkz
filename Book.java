class Book
{
String name;
double price;
public static void main(String a[])
{
/* ClassName referance = new ClassName();*/
 Book book = new Book();
  book.name="java";
  book.price=90.00;
  System.out.println(book.name +" "+ book.price );
  Book book1 = new Book();
  book1.name="python";
  book1.price=85.00;
  System.out.println(book1.name +" "+ book1.price );
  Book book2 = new Book();
  book2.name="dot.net";
  book2.price=1000.00;
  System.out.println(book2.name +" "+ book2.price );
  }
  }
  