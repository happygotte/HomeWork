package Student.supplier;

import Student.Student;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StudentWithOutNameSupplier implements Supplier<Student> {

    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    @Override
    public Student get() {
        Student s = new Student();
        s.setOrdNumber(1);
        s.setAge(rnd.nextInt(7, 17));
        s.setGrade(rnd.nextDouble(10));
        s.setPartOlymp(rnd.nextBoolean());

        return s;
    }
}
