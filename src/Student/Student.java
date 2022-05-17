package Student;

import java.util.Objects;

public class Student implements Comparable<Student> {

    int ordNumber;
    String name;
    int age;
    double grade;
    boolean isPartOlymp;

    public Student() {
    }

    public int getOrdNumber() {
        return ordNumber;
    }

    public void setOrdNumber(int ordNumber) {
        this.ordNumber = ordNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPartOlymp() {
        return isPartOlymp;
    }

    public void setPartOlymp(boolean partOlymp) {
        isPartOlymp = partOlymp;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ordNumber == student.ordNumber;
    }

    @Override
    public String toString() {
        return "[Порядковый номер - " + this.ordNumber + ", имя - " + this.name + ", возраст - "
                + this.age + ", оценка - " + this.grade + ", участие в олимпиадах - " + this.isPartOlymp + "]";
    }
}
