package home_work_2.loops;

import java.util.Scanner;

public class Task1_5_edit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("С какого числа начинаем таблицу умножения?");
        int strNum = scanner.nextInt();
        System.out.println("Введите максимальное количество столбцов в строке");
        int mxCountColinRow = scanner.nextInt();
        System.out.println("Введите общее количество столбцов в таблице");
        int CountColumns = scanner.nextInt();
        
        //количество строчек для вывода всех столбцов с учётом заданного условия, округлённое в большую сторону
        int CountRow = (int) Math.ceil(CountColumns / (double) mxCountColinRow);

        // печать строки
        for (int i = 0; i < CountRow; i++) {
            //конечное значение в последнем столбце одной строки (начало для каждой строки + максимум для строки - 1)
            int CurrentTo = strNum + mxCountColinRow + (mxCountColinRow * i) - 1;
            //разница между общим количеством столбцов и максимально возможным в строке
            int tmp = CountColumns - (mxCountColinRow * i);
            // если получается строка с меньшим количеством столбцов, чем возможно по условию
            if (tmp < mxCountColinRow) {
                // то конечное значение в последнем столбце такой строки включает эту разницу, а не максимум
                CurrentTo = strNum + (mxCountColinRow * i) + tmp - 1;
            }
            //1 - умножение на i определяет значение для первого столбца строки, 2 - значение последнего столбца
            printRow(strNum + (mxCountColinRow * i), CurrentTo);
            System.out.println();
        }
    }

    /**
     * Вывод на консоль строк с указанными столбцами
     * @param from значение первого столбца
     * @param to значение последнего столбца
     */
    public static void printRow(int from, int to) {
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to; j++) {
                if (i < 10) {
                    System.out.print(j + " *  " + i + " = " + (j * i) + "\t\t");
                } else {
                    System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
                }
            }
            System.out.println("");
        }
    }
}
