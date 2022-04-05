package home_work_2.arrays;

import home_work_2.Utils.ArraysUtils2_1;

// Реализация интерфейса IArraysOperation только через foreach
public class ForEachOperation implements IArraysOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils2_1.arrayFromConsole();

        ForEachOperation foreach1 = new ForEachOperation();
        foreach1.allElem(container);

        ForEachOperation foreach2 = new ForEachOperation();
        foreach2.oddElem(container);

        ForEachOperation foreach3 = new ForEachOperation();
        foreach3.reverse(container);
    }

    public void allElem(int[] container) {
        int x = 1;
        for (int l : container) {
            System.out.print(x + " элемент" + " = " + l + "; ");
            x++;
        }
        System.out.println("\n");
    }

    public void oddElem(int[] container) {

        if (container.length > 1) {
            int x = 1;
            for (int l : container) {
                if (x % 2 == 0) {
                    System.out.print(x + " элемент" + " = " + l + "; ");
                }
                x++;
            }
            System.out.println("\n");
        } else {
            System.out.print("Недостаточно элементов в массиве");
            System.out.println("\n");
        }
    }

    public void reverse(int[] container) {
        int x = 1;
        String result = "";
        for (int l : container) {
            result = x + " элемент" + " = " + l + "; " + result;
            x++;
        }
        System.out.print(result);
        System.out.println("\n");
    }
}
