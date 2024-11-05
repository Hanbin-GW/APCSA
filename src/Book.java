public class Book{
    String title;
    String author;

    void show() {System.out.println(title + " " + author);}

    public Book(){
        this("","");
        System.out.println("Constructor has been called");
    }

    public Book(String title)
    {
        this(title, "Unknown User");
    }

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public static void main(String[]args)
    {
        Book javaBook = new Book("Java Learn","황기태");
        Book bible = new Book("Bible");
        Book emptyBook = new Book();

        bible.show();
    }
}