import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Производный класс
        InternationalStudent internationalStudent = new InternationalStudent(
                "Garas",
                "Peter",
                "01.01.2000",
                "12345",
                "egypt@example.com",
                List.of(new Grade("Math", 85, "01.01.2023"), new Grade("History", 92, "02.01.2023")),
                "Egypt"
        );

        // Задание 2: Применение модификатора protected
        internationalStudent.printFullNameAndEmail();

        // Задание 3: Перегрузка метода
        internationalStudent.printFullNameAndEmailWithCountry();

        // Задание 4: Вызов конструктора базового класса
        System.out.println("Страна: " + internationalStudent.getCountry());

        // Задание 5: Замена методов Display используя метод toString
        System.out.println(internationalStudent);

        // Задание 6: Использование абстрактного класса
        // В этом примере, абстрактный класс не требуется

        // Задание 7: Использование интерфейсов
        System.out.println("Email: " + internationalStudent.getEmail());

        // Задание 8: Клонирование
        try {
            InternationalStudent clonedStudent = (InternationalStudent) internationalStudent.clone();
            System.out.println("Клонированный студент: " + clonedStudent);
        } catch (CloneNotSupportedException e) {
            System.err.println("Клонирование не поддерживается: " + e.getMessage());
        }

        // Задание 9: Шаблон класса
        Box<String> stringBox = new Box<>("Hello, World!");
        Box<Integer> intBox = new Box<>(42);

        System.out.println("String Box Content: " + stringBox.getContent());
        System.out.println("Integer Box Content: " + intBox.getContent());
    }
}
