package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через do....while
public class DoWhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        DoWhileOperation d_w1 = new DoWhileOperation();
        d_w1.allElem(container);

        DoWhileOperation d_w2 = new DoWhileOperation();
        d_w2.oddElem(container);

        DoWhileOperation d_w3 = new DoWhileOperation();
        d_w3.reverse(container);

    }

    public void allElem(int[] container) {
        int i = 0;
        do {
            System.out.print((i + 1) + " элемент" + " = " + container[i] + "; ");
            i++;
        } while (i < container.length);
        System.out.print("\n");
    }

    public void oddElem(int[] container) {
        if (container.length > 1) {
            int i = 1;
            do {
                if (i % 2 == 1) {
                    System.out.print((i + 1) + " элемент" + " = " + container[i] + "; ");
                }
                i++;
            } while (i < container.length);
            System.out.print("\n");
        }
    }

    public void reverse (int[] container) {
        int i = container.length - 1;
        do {
            System.out.print((i + 1) + " элемент" + " = " + container[i] + "; ");
            i--;
        } while (i > -1);
        System.out.print("\n");
    }
}
