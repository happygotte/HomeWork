package Student.predicate;

import Student.Student;

import java.util.function.Predicate;

public class StudentAgeGreatAndEqual implements Predicate<Student> {

    private final int age;

    public StudentAgeGreatAndEqual(int age) { // передаём в конструктор возраст, по которому пойдёт фильтр
        this.age = age;
    }

    /**
     * Проверка соответствия условию - возраст равен или выше указанного
     * @param item объект Student
     * @return true, если возраст объекта выше/равен переданному в конструкторе, false, если нет
     */
    @Override
    public boolean test(Student item) {
        return item.getAge() >= age;
    }
}
