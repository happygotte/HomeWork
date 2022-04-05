package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через for
public class ForOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        ForOperation for1 = new ForOperation();
        for1.allElem(container);

        ForOperation for2 = new ForOperation();
        for2.oddElem(container);

        ForOperation for3 = new ForOperation();
        for3.reverse(container);
    }

    public void allElem(int[] container) {
        for (int k = 0; k < container.length; k++) {
            System.out.print((k + 1) + " элемент" + " = " + container[k] + "; ");
        }
        System.out.print("\n");
    }

    public void oddElem(int[] container) {

        if (container.length > 1) {
            for (int k = 0; k < container.length; k++) {
                if (k % 2 == 1) {
                    System.out.print((k + 1) + " элемент" + " = " + container[k] + "; ");
                }
            }
            System.out.print("\n");
        } else {
            System.out.print("Недостаточно элементов в массиве");
            System.out.println("\n");
        }
    }

    public void reverse(int[] container) {
        for (int k = container.length-1; k > -1; k--) {
            System.out.print((k + 1) + " элемент" + " = " + container[k] + "; ");
        }
        System.out.print("\n");
    }
}
