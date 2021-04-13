package ru.geekbrains.lesson5;

public class Employee {
    private  String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    static final int MAX_NUMBER_EMPLOYEE = 5;

    public Employee (String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void consoleOutput () {
        System.out.println("ФИО = " + fullName + "\n" + "Должность = " + position + "\n" +
                "Email = " + email +  "\n" + "Номер телефона = " + phone +  "\n" + "Зарплата = " + salary +  "\n" + "Возраст = " + age);
    }

    public static void main(String[] args) {
        Employee[] arrayOfEmployees = new Employee[MAX_NUMBER_EMPLOYEE];
        arrayOfEmployees[0] = new Employee("Ivanov Ivan", "CEO", "iivanov@yandex.ru", 111111, 100000, 50);
        arrayOfEmployees[1] = new Employee("Petrov Petr", "Developer", "ppetrov@yandex.ru", 2222222, 50000, 25);
        arrayOfEmployees[2] = new Employee("Sidorov Sidr", "Consultant", "ssidorov@yandex.ru", 3333333, 40000, 30);
        arrayOfEmployees[3] = new Employee("Frolova Ekaterina", "Accountant", "efrolova@yandex.ru", 4444444, 50000, 25);
        arrayOfEmployees[4] = new Employee("Sergeenkova Marina", "Lawyer", "msergeenkova@yandex.ru", 555555, 60000, 30);

        for (int i = 0; i < MAX_NUMBER_EMPLOYEE; i++) {
            if (arrayOfEmployees[i].age > 40) {
                arrayOfEmployees[i].consoleOutput();
            }
        }
    }

}
