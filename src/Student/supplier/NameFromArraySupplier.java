package Student.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NameFromArraySupplier implements Supplier<String> {
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final String[] names;
    private final int from;
    private final int to;

    public NameFromArraySupplier(String[] names, int from, int to) {
        this.names = names;
        this.from = from;
        this.to = to;
    }

    /**
     * Рандомный выбор имени из предложенного массива
     * names массив имён
     * from наименьшая длина имена
     * to наибольшая длина имени
     * @return одно случайное имя из массива
     */
    @Override
    public String get() {
        String name;
        do {
            name = names[rnd.nextInt(names.length)];
        } while (name.length() < from || name.length() > to);

        return name;
    }
}
