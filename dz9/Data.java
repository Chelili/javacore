
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class Data {

    public static List<Student> getStudentsList() {
        // Список курсов
        Course course1 = new Course("Java. Level 1");
        Course course2 = new Course("Java Core для тестировщиков");
        Course course3 = new Course("Введение в тестирование");
        Course course4 = new Course("Введение в тестирование. Практикум");
        Course course5 = new Course("Основы баз данных");
        Course course6 = new Course("Linux. Рабочая станция");
        Course course7 = new Course("Тестирование веб-приложений");
        Course course8 = new Course("Тестирование мобильных приложений");
        Course course9 = new Course("Английский для IT-специалистов");
        Course course10 = new Course("Автоматизация тестирования Web UI на Java");
        Course course11 = new Course("Тестирование backend на Java");
        Course course12 = new Course("Git. Базовый курс");

        // Список студентов
        Student student1 = new Student("Александр Никишкин", Arrays.asList(course1, course3, course5));
        Student student2 = new Student("Наталья Борисова", Arrays.asList(course1, course7, course11));
        Student student3 = new Student("Виталий Вакулин", Arrays.asList(course2, course4, course8, course1, course3));
        Student student4 = new Student("Анастасия Пробкина", Arrays.asList(course3, course7, course9));
        Student student5 = new Student("Григорий Кондратьев", Arrays.asList(course1, course3, course5));
        Student student6 = new Student("Надежда Назаренко", Arrays.asList(course2, course6, course7));
        Student student7 = new Student("Павел Ермилов", Arrays.asList(course3, course2, course4));
        Student student8 = new Student("Насонова Галина", Arrays.asList(course4, course8, course5));
        Student student9 = new Student("Юлия Кузнецова", Arrays.asList(course5, course1, course9));
        Student student10 = new Student("Григорий Ершов", Arrays.asList(course6, course9, course5));
        Student student11 = new Student("Владимир Попов", Arrays.asList(course7, course6, course5));
        Student student12 = new Student("Наиль Муратов", Arrays.asList(course8, course1, course5));



        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<String> courses = Arrays.asList("Java. Level 1", "Java Core для тестировщиков", "Введение в тестирование",
                "Введение в тестирование. Практикум", "Основы баз данных", "Linux. Рабочая станция", "Тестирование веб-приложений",
                "Тестирование мобильных приложений", "Английский для IT-специалистов", "Автоматизация тестирования Web UI на Java",
                "Тестирование backend на Java", "Git. Базовый курс");
        return new Course(courses.get(random.nextInt(courses.size())));
    }
}

