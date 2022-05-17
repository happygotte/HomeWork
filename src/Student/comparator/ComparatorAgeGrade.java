package Student.comparator;

import Student.Student;

import java.util.Comparator;

public class ComparatorAgeGrade implements Comparator<Student> {

    private ComparatorAge comparatorAge;
    private ComparatorGrade comparatorGrade;

    public ComparatorAgeGrade() {
        this.comparatorAge = new ComparatorAge();
        this.comparatorGrade = new ComparatorGrade();
    }

    @Override
    public int compare(Student o1, Student o2) {
        int ageCompare = this.comparatorAge.compare(o1, o2);

        if(ageCompare != 0){
            return ageCompare;
        }

        return this.comparatorGrade.compare(o2, o1);
    }
}
