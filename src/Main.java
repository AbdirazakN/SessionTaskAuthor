import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task:Author деген класс тузунуз анын полялары (fullName,  email, gender)
        //1.Author дун пустой конструктоу болбоcун
        //2.Author дун атын жана жынысын озгорто албашыныз керек
        //Book деген класс тузунуз  анан полялары (name, author, price, qty)
        //1.Author жана Book -га 5тен 10 обьект тузунуз
        //2.Китептерди арзанын жана кымбатын,  таап берген код жазыныз
        //3.Author-дун аты аркылуу  кайсыл китепти жазганын тапкан код жазыныз.

        Author author1 = new Author("Abdishukur ajy Narmatov","Abdishukurajy@mail.ru",'m');
        Author author2 = new Author("Chubak ajy Jalilov","Chubakajy75@gmail.com",'m');
        Author author3 = new Author("Chyngyz Aitmatov","Aitmatov12@gmail.com",'m');
        Author author4 = new Author("Seiitbek Idirisov","Idirisovseiitbek564@mail.ru",'m');
        Author author5 = new Author("Myktybek Arstanbek","Arstanbek2022@gmail.com",'m');

        Author[] authors = {author1,author2,author3,author4,author5};

        Book book1 = new Book("Ochpos omur","Abdishukur ajy Narmatov",650,2000);
        Book book2 = new Book("Baktyluuluktun formulasy","Chubak ajy Jalilov",350,2500);
        Book book3 = new Book("Birinci mugalim","Chyngyz Aitmatov",550,3000);
        Book book4 = new Book("Az.Umar bin Hattab","Seiitbek Idirisov",250,1500);
        Book book5 = new Book("Paigambardyn yiyk jolu","Myktybek Arstanbek",200,1800);

        Book[] books = {book1,book2,book3,book4,book5};
        getMaxMinPriceBook(books);
        getByAuthor(authors);
    }
    public static void getMaxMinPriceBook(Book[] books) {
        float max = books[0].getPrice();
        float min = books[0].getPrice();
        for (int i = 0; i < books.length; i++) {
            max = Math.max(max, books[i].getPrice());
            min = Math.min(min, books[i].getPrice());
        }

        for (Book book : books) {
            if (book.getPrice() == max) {
                System.out.println("Expensive book is:  " + max);
                System.out.println(book.toString());
            } else if (book.getPrice() == min) {
                System.out.println("Cheap book is:  " + min);
                System.out.println(book.toString());
            }
        }
    }
        public static void getByAuthor(Author[] authors){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write author name:   ");
            String authorName = scanner.nextLine();
            for (Author author:authors) {
                if (author.getFullName().equals(authorName)) {
                    System.out.println("This author's book is:  " + author.toString());
                }
            }


    }
}