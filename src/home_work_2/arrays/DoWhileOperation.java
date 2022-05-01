package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через do....while
public class DoWhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        DoWhileOperation d_w1 = new DoWhileOperation();

        d_w1.allElem(container);
        d_w1.oddElem(container);
        d_w1.reverse(container);
    }

    public String allElem(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        do {
            str.append(i + 1);
            str.append(" элемент = ");
            str.append(container[i]);
            str.append("; ");
            i++;
        } while (i < container.length);
        return "" + str;
    }

    public String oddElem(int[] container) {
        StringBuilder str = new StringBuilder();
        if (container.length > 1) {
            int i = 1;
            do {
                if (i % 2 == 1) {
                    str.append(i + 1);
                    str.append(" элемент = ");
                    str.append(container[i]);
                    str.append("; ");
                }
                i++;
            } while (i < container.length);
        } else {
            return "Недостаточно элементов в массиве";
        }
        return "" + str;
    }

    public String reverse (int[] container) {
        StringBuilder str = new StringBuilder();
        int i = container.length - 1;
        do {
            str.append(i + 1);
            str.append(" элемент = ");
            str.append(container[i]);
            str.append("; ");
            i--;
        } while (i > -1);
        return "" + str;
    }
}
