package Student.supplier;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class NameFromRandomCharacterSupplier implements Supplier<String> {
    private final ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private final int from;
    private final int to;

    public NameFromRandomCharacterSupplier(int from, int to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Создание строки с рандомными кириллическими буквами
     * from нижняя граница длины строки
     * to верхняя граница длины строки
     * @return строка
     */
    @Override
    public String get() {
        Random rnd = new Random();
        int length = from + rnd.nextInt(to - from);
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = (char) (1040 + rnd.nextInt(64));
        }
        return String.copyValueOf(chars);
    }

}
