package Student;

import Student.comparator.ComparatorGrade;
import Student.comparator.ComparatorName;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        StudentOperations studentOperations = new StudentOperations();

        /**
         * Сгенерированный список объектов
         */
        List<Student> students = studentOperations.generate(10000, 7, 17, 0.0, 10.0);

        /**
         * Фильтр изначального списка сначала по возрасту, затем по оценке
         */
        List<Student> filterList1 = studentOperations.filterAge(students, 12, 17);
        List<Student> filterList2 = studentOperations.filterGrade(filterList1, 8.0, 10.0);

        /**
         * Вывод среднего возраста в отфильтрованном списке
         */
        System.out.println(studentOperations.averageAge(filterList2));

        /**
         * Сортировка отфильтрованного списка по убыванию оценки
         */
        filterList2.sort(new ComparatorGrade());
        /**
         * Вывод топ-10 отсортированного по убыванию оценки списка
         */
        studentOperations.top(filterList2, 10);
        System.out.println("\n");

        /**
         * Сортировка отфильтрованного списка по именам
         */
        filterList2.sort(new ComparatorName());
        /**
         * Вывод топ-10 отсортированного по именам списка
         */
        studentOperations.top(filterList2, 10);
        System.out.println("\n");

        /**
         * Вывод топ-10 отсортированного по оценкам списка для каждого возраста в заданном диапазоне
         */
        int ageLow = 12;
        int ageUp = 17;

        for (int i = ageLow; i <= ageUp; i++) {
            List<Student> filterList3 = studentOperations.filterAge(students, i, i);
            filterList3.sort(new ComparatorGrade());
            studentOperations.top(filterList3, 10);
        }
    }
}



