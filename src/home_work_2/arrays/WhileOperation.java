package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через while
public class WhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        WhileOperation w1 = new WhileOperation();
        w1.allElem(container);

        WhileOperation w2 = new WhileOperation();
        w2.oddElem(container);

        WhileOperation w3 = new WhileOperation();
        w3.reverse(container);
    }

    public void allElem(int[] container) {
        int j = 0;
        while (j < container.length) {
            System.out.print((j + 1) + " элемент" + " = " + container[j] + "; ");
            j++;
        }
        System.out.print("\n");
    }

    public void oddElem(int[] container) {

        if (container.length > 1) {
            int j = 1;
            while (j < container.length) {
                if (j % 2 == 1) {
                    System.out.print((j + 1) + " элемент" + " = " + container[j] + "; ");
                }
                j++;
            }
            System.out.print("\n");
        } else {
            System.out.print("Недостаточно элементов в массиве");
            System.out.println("\n");
        }
    }

    public void reverse(int[] container) {
        int j = container.length-1;
        while (j > -1) {
            System.out.print((j + 1) + " элемент" + " = " + container[j] + "; ");
            j--;
        }
        System.out.print("\n");
    }
}
