package Student.supplier;

import Student.Student;

import java.util.function.Supplier;

public class EmptyStudentSupplier implements Supplier<Student> {

    @Override
    public Student get() {
        return new Student();
    }
}
