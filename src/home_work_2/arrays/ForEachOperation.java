package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через foreach
public class ForEachOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        ForEachOperation foreach1 = new ForEachOperation();
        foreach1.allElem(container);
        foreach1.oddElem(container);
        foreach1.reverse(container);
    }

    public String allElem(int[] container) {
        StringBuilder str = new StringBuilder();
        int i = 1;
        for (int num : container) {
            str.append(i);
            str.append(" элемент = ");
            str.append(num);
            str.append("; ");
            i++;
        }
        return "" + str;
    }

    public String oddElem(int[] container) {
        StringBuilder str = new StringBuilder();
        if (container.length > 1) {
            int i = 1;
            for (int num : container) {
                if (i % 2 == 0) {
                    str.append(i);
                    str.append(" элемент = ");
                    str.append(num);
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
        int i = 1;
        String result = "";
        for (int num : container) {
            result = i + " элемент" + " = " + num + "; " + result;
            i++;
        }
        return result;
    }
}
