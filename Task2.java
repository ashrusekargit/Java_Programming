class Book{
    String bookName="Default";
    String authorName="Unknown";
    Book(String bookName, String authorName){
        this.bookName=bookName;
        this.authorName=authorName;
    }
    Book(String bookName){
        this.bookName=bookName;
        this.authorName=authorName;
    }
    void details(){
        System.out.println("Title: "+bookName+", Author: "+authorName);
    }
}
class MathUtils{
    public int add(int a, int b){
        return a+b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
}
public class Task2 {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        Book detail = new Book("The Hobbit", "Tolkien");
        Book detail2 = new Book("A Book");
        System.out.println(MathUtils.multi(5,10));
        System.out.println(math.add(5, 10));
        detail.details();
        detail2.details();
    }
}
