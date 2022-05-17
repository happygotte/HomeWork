package Student.comparator;

import Student.Student;

import java.util.Comparator;

public class ComparatorGrade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGrade(), o2.getGrade());
    }

}
