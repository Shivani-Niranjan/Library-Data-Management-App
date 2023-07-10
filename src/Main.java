class  Library_Item{
    int id;
    String title;
    int year;

    public void Library_Details(){
        System.out.println(id);
        System.out.println(title);
        System.out.println(year);
    }
}

class Book extends Library_Item{
    String author;
    public void Book_Details(){
        System.out.println(author);
        System.out.println(id);
        System.out.println(title);
        System.out.println(year);
        System.out.println();
    }

}

class Magazine extends Library_Item{
    int issue;
    public void Magazine_Details(int issue, int id,String Title,int year){
        System.out.println(issue);
        System.out.println(id);
        System.out.println(title);
        System.out.println(year);
        System.out.println();

    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Shivani";
        book.id = 01;
        book.title = "Twilight";
        book.year = 2002;

        Magazine magazine = new Magazine();
        magazine.id = 01;
        magazine.title = "Narnia";
        magazine.year = 2020;
        magazine.issue = 1000;

        book.Book_Details();
        magazine.Magazine_Details(500,06,"Jungle Book",2012);;
        book.Library_Details();
    }
}