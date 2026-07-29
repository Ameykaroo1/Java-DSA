public class Aggreation {
  String title;
  int pages;

  Aggreation(String title, int pages){
    this.title = title;
    this.pages = pages;
  }

  String displayInfo(){
    return this.title + " (" + this.pages + " pages)";
  }
}
class Library{
  String name;
  int year;
  Aggreation[] books;
  
  Library(String name,int year,Aggreation[] books){
    this.name = name;
    this.year = year;
    this.books = books;
  }

  void displayInfo(){
    System.out.println("The " + this.year + " "+ this.name);
    System.out.println("Books Available:");
    for (Aggreation book: books){
      System.out.println(book.displayInfo());
    }
  }
}
class Maains{
  public static void main(String[] args) {
    Aggreation book1 = new Aggreation("The Fellow of the Ring", 426);
    Aggreation book2 = new Aggreation("The Two Towers", 567);
    Aggreation book3 = new Aggreation("THe Return of the King",982);

    Aggreation[] books = {book1,book2,book3};

    Library library = new Library("NYC Public Library", 1897, books);

    library.displayInfo();

  }
}
