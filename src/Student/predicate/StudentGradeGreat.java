package Student.predicate;

import Student.Student;

import java.util.function.Predicate;

public class StudentGradeGreat implements Predicate<Student> {

    private final int grade;

    public StudentGradeGreat(int grade) { // передаём в конструктор оценку, по которой пойдёт фильтр
        this.grade = grade;
    }

    /**
     * Проверка соответствия условию - оценка выше указанной
     * @param item объект Student
     * @return true, если оценка объекта выше переданной в конструкторе, false, если нет
     */
    @Override
    public boolean test(Student item) {
        return item.getGrade() > grade;
    }
}
