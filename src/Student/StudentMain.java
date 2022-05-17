package Student;

import Student.comparator.ComparatorAge;
import Student.comparator.ComparatorGrade;
import Student.comparator.ComparatorName;
import Student.predicate.StudentAgeGreatAndEqual;
import Student.predicate.StudentGradeGreat;
import Student.supplier.*;
import home_work_4.comparators.ComparatorComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentMain {
    public static void main(String[] args) {
        Supplier<Student> students = new StudentWithNameAndOrdSupplier( // выбираем любого студента из саплайеров, если там внутри требуется саплайер для имени - указываем в качестве параметра
                new NameFromArraySupplier2(3, 10)
        );

        Predicate<Student> filter = new StudentAgeGreatAndEqual(12)
                .and(new StudentGradeGreat(8));

        Comparator<Student> cmp1 = new ComparatorGrade().reversed();
        Comparator<Student> cmp2 = new ComparatorName();
        Comparator<Student> cmp3 = new ComparatorAge();
        Comparator<Student> cmp4 = new ComparatorComparable<>();

        List<Student> job = job(students, filter);

        /**
         * Сортировка отфильтрованного списка по убыванию оценки
         */
        job.sort(cmp1);
        /**
         * Вывод топ-10 отсортированного по убыванию оценки списка
         */
        top(job, 10);
        System.out.println("\n");

        /**
         * Сортировка отфильтрованного списка по именам
         */
        job.sort(cmp2);
        /**
         * Вывод топ-10 отсортированного по именам списка
         */
        top(job, 10);
        System.out.println("\n");


        /**
         Сортировка по имени
         Компаратор компараблов из задания DataContainer
         */
        job.sort(cmp4);

        /**
         * Комбинированная сортировка по возрасту и оценке
         */
        Comparator<Student> ageGradeComp = cmp3.thenComparing(cmp1); // комбинация двух компараторов с помощью дефолтного метода из интерфейсa Comparator
        job.sort(ageGradeComp);

        /**
         * Вывод топ-10 по каждому возрасту
         */
        int i = 0;
        int currentAge = 0;
        for (Student item : job) {

            if(currentAge != item.getAge()){
                i = 0;
                currentAge = item.getAge();
            }

            if(i++ >= 10){
                continue;
            }
            System.out.println(item);
        }

        /**
         * Вывод среднего возраста в отфильтрованном списке
         */
        int averageAge;
        int sum = 0;
        for (Student student : job) {
            sum += student.age;
        }
        averageAge = sum / job.size();
        System.out.println(averageAge);
    }

    public static <T> List<T> job(Supplier<T> supplier, Predicate<T> filter) {

        /**
        Генерация списка студентов
         */
        List<T> students = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            students.add(supplier.get());
        }

        /**
        Фильтр списка по возрасту и оценке
         */
        List<T> filtered = new ArrayList<>();

        for (T item : students) {
            if(filter.test(item)){
                filtered.add(item);
            }
        }
        return filtered;
    }

    /**
     * Вычленение части списка объектов от начала
     * @param students список объектов класса Student
     * @param num необходимое количество объектов
     */
    public static <T> void top(List<T> students, int num) {
        int count = 0;
        for (T student : students) {
            System.out.println(student);
            count++;
            if (count == num) {
                break;
            }
        }
    }

}



