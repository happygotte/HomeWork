package Student.supplier;

import Student.Student;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StudentWithNameAndOrdSupplier implements Supplier<Student> {

    private int createCount = 0;
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final Supplier<String> names;


    public StudentWithNameAndOrdSupplier(Supplier<String> names) { //делегирование
        this.names = names;
    }

    @Override
    public Student get() {
        Student s = new Student();
        s.setOrdNumber(++createCount);
        s.setName(names.get());
        s.setAge(rnd.nextInt(7, 17));
        s.setGrade(rnd.nextDouble(10));
        s.setPartOlymp(rnd.nextBoolean());

        return s;
    }
}
