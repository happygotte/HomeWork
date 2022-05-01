package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через while
public class WhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        WhileOperation w1 = new WhileOperation();
        w1.allElem(container);
        w1.oddElem(container);
        w1.reverse(container);
    }

    public String allElem(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < container.length) {
            str.append(i + 1);
            str.append(" элемент = ");
            str.append(container[i]);
            str.append("; ");
            i++;
        }
        return "" + str;
    }

    public String oddElem(int[] container) {
        StringBuilder str = new StringBuilder();
        if (container.length > 1) {
            int i = 1;
            while (i < container.length) {
                if (i % 2 == 1) {
                    str.append(i + 1);
                    str.append(" элемент = ");
                    str.append(container[i]);
                    str.append("; ");
                }
                i++;
            }
        } else {
            return "Недостаточно элементов в массиве";
        }
        return "" + str;
    }

    public String reverse(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = container.length-1;
        while (i > -1) {
            str.append(i + 1);
            str.append(" элемент = ");
            str.append(container[i]);
            str.append("; ");
            i--;
        }
        return "" + str;
    }
}
