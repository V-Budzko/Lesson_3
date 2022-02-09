package Lesson_3;

import java.util.Arrays;

public class EmpData {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Иванов Иван Ивонович ", "Директор ", "Directro@mail.com ", "+375-33-111-11-11 ", 6000, 54);
        employees[1] = new Employees("Сидоров Петр Сергеевич ", "Инженер-технолог ", "Eng-Tech@mail.com ", "+375-33-222-22-22 ", 4500, 38);
        employees[2] = new Employees("Петров Генадий Викторович ", "Инженер-конструктор ", "Eng_Konst@mail.com ", "+375-29-123-45-67 ", 3600, 50);
        employees[3] = new Employees("Маратов Алексей Денисович ", "Системный администратор ", "OSAdm@mail.com ", "+375-29-541-89-90 ", 2200, 27);
        employees[4] = new Employees("Тихонов Дмитрий Владимирович ", "Водятел ", "Driver@mail.com ", "+375-49-898-12-01 ", 1100, 38);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].getInfo();
            }
        }
    }
}
