package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через for
public class ForOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        ForOperation fori = new ForOperation();
        fori.allElem(container);
        fori.oddElem(container);
        fori.reverse(container);
    }

    public String allElem(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < container.length; i++) {
            str.append(i + 1);
            str.append(" элемент = ");
            str.append(container[i]);
            str.append("; ");
        }
        return "" + str;
    }

    public String oddElem(int[] container) {
        StringBuilder str = new StringBuilder();
        if (container.length > 1) {
            for (int i = 0; i < container.length; i++) {
                if (i % 2 == 1) {
                    str.append(i + 1);
                    str.append(" элемент = ");
                    str.append(container[i]);
                    str.append("; ");
                }
            }
        } else {
            return "Недостаточно элементов в массиве";
        }
        return "" + str;
    }

    public String reverse(int[] container) {
        StringBuilder str = new StringBuilder();
        for (int i = container.length-1; i > -1; i--) {
            str.append(i + 1);
            str.append(" элемент = ");
            str.append(container[i]);
            str.append("; ");
        }
        return "" + str;
    }
}
