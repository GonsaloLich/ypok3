public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author authorViy = new Author("Николай", "Гоголь");
        Author authorsteelRat = new Author("Гарри", "Гаррисон");
        Book viy = new Book(authorViy, "Вий", 1835);
        Book steelRat = new Book(authorsteelRat, "Стальная крыса", 1985);
        steelRat.setYear(1990);

    }
}
