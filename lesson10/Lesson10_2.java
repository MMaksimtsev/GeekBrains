package lesson10;

public class Lesson10_2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", 111);
        phoneBook.add("Петров", 222);
        phoneBook.add("Иванов", 333);

        phoneBook.get("Иванов");
    }
}
