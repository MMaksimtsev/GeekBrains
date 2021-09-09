package lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {

    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public synchronized void add(String surname, int phoneNumber) {
        if (surname == null || surname.equals("")) {
            System.out.println("Вы ввели неверные данные, фамилия не может быть: " + surname);
            return;
        }
        if (phoneNumber < 0) {
            System.out.println("Вы ввели неверные данные, номер телефона не может быть отрицальным значением");
            return;
        }
        ArrayList<Integer> allPhone = phoneBook.get(surname);
        // if list does not exist create it
        if (allPhone == null) {
            allPhone = new ArrayList<Integer>();
            allPhone.add(phoneNumber);
            phoneBook.put(surname, allPhone);
        } else {
            // add if item is not already in list
            if (!allPhone.contains(phoneNumber)) allPhone.add(phoneNumber);
        }

    }

    public void get(String surname) {
        if (surname == null || surname.equals("")) {
            System.out.println("Вы ввели неверные данные, фамилия не может быть: " + surname);
            return;
        }
        if (!phoneBook.containsKey(surname)){
            System.out.println("В телефонной книге не найдена фамилияф: " + surname);
            return;
        }
        Iterator<Integer> phoneIterator = phoneBook.get(surname).iterator();
        System.out.print("Для фамилии " + surname + " найдены следующие телефонные номера: ");
        while (phoneIterator.hasNext()) {
            System.out.print(phoneIterator.next());
            if (phoneIterator.hasNext()) {
                System.out.print(", ");
            } else {
                System.out.println(";");
            }
        }

    }

}

