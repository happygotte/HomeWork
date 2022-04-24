package Student.comparator;

import Student.Student;

import java.util.Comparator;

public class ComparatorGrade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o2.getGrade()> o1.getGrade()) {
            return 1;
        } else if(o2.getGrade()< o1.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
