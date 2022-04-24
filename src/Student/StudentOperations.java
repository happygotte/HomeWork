package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentOperations {

    /**
     * Создание списка объектов класс Student с рандомно заполненными полями
     * @return список объектов
     */
    public List<Student> generate(int amount, int ageLow, int ageUp, double gradeLow, double gradeUp) {
        Random rnd = new Random();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            Student student = new Student();
            student.setOrdNumber(i + 1);
            student.setName(name(3,10));
            student.setAge(ageLow + rnd.nextInt(ageUp - ageLow + 1));
            student.setGrade(gradeLow + rnd.nextDouble() * gradeUp);
            student.setPartOlymp(rnd.nextBoolean());
            students.add(student);
        }
        return students;
    }

    public String name(int a, int b) {
        Random rnd = new Random();
        ;
        int length = a + rnd.nextInt(b - a);
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = (char) (1040 + rnd.nextInt(64));
        }
        return String.copyValueOf(chars);
    }

    /**Фильтр списка объектов по полю возраста
     * @param students список объектов класса Student
     * @param ageLow нижняя граница возраста
     * @param ageUp верхняя граница возраста
     * @return отфильтрованный список
     */
    public List<Student> filterAge(List<Student> students, int ageLow, int ageUp) {
        List<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.age >= ageLow && student.age <= ageUp) {
                students1.add(student);
            }
        }
        return students1;
    }

    /**
     * Фильтр списка объектов по полю оценки
     * @param students список объектов класса Student
     * @param gradeLow нижняя граница оценки
     * @param gradeUp верхняя граница оценки
     * @return отфильтрованный список
     */
    public List<Student> filterGrade(List<Student> students, double gradeLow, double gradeUp) {
        List<Student> students1 = new ArrayList<>();
        for (Student student : students) {
            if (student.grade >= gradeLow && student.grade <= gradeUp) {
                students1.add(student);
            }
        }
        return students1;
    }

    /**
     * Расчёт среднего значения по полю возраста
     * @param students список объектов класса Student
     * @return значение среднего возраста
     */
    public int averageAge(List<Student> students) { // сначала был double, но я решила, что это странно
        int averageAge;
        int sum = 0;
        for (Student student : students) {
            sum += student.age;
        }
        averageAge = sum / students.size();
        return averageAge;
    }

    /**
     * Вычленение части списка объектов от начала
     * @param students список объектов класса Student
     * @param num необходимое количество объектов
     */
    public void top(List<Student> students, int num) {
        int count = 0;
        for (Student student : students) {
            System.out.println(student);
            count++;
            if (count > num) {
                break;
            }
        }
    }

}
