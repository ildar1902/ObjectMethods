public class Main {

    public static void main(String[] args) {

        System.out.println("    Методы объектов");
        System.out.println("Черновик");
        System.out.println();
        PersonService personService = new PersonService();
        Person irina = new Person("Irina", 28);
        if (personService.isAdult(irina)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }
        System.out.println(irina);
        irina.increaseAge(1);
        System.out.println(irina);

//        ДЗ
        System.out.println();
        System.out.println("    Домашнее задание");
        Author vilmont = new Author("Екатерина", "Вильмонт");
        Book book1 = new Book("Невероятное везение", vilmont, 2001);
        Author orson = new Author("Орсон", "Кард");
        Book book2 = new Book("Тень Эндера", orson, 1999);
        book1.setPublishingYear(2002);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}