package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;

        int ex1 = 5 + 2 / a;    // ex1 = 5, 5 + 0, целочисленное деление 2 на 8
        int ex2 = (5 + 2) / a;  // ex2 = 0, целочисленное деление 7 на 8
        int ex3 = (5 + b++) / a;// ex3 = 0, аналогично ex2, инкримент в b ещё не применён

        int c = 2;

        int ex4 = (5 + c++) / --a;  // ex4 = 1, 7/7, инкримент в с ещё не применён, декримент в а применён

        int d = 2;
        int e = 8;

        int ex5 = (5 * 2 >> d++) / --e; // ex5 = 0, инкримент в d ещё не применён, декримент в e применён
                                        // двочиное число 10 (5*2) со смещением вправо на два = 00000010
                                        // 00000010 - это десятичное 2, целочесленное деление 2 на 7 = 0
        int f = 2;
        int g = 8;

        int ex6 = (5 + 7 > 20 ? 68 : 22 * 2 >> f++) / --g; // ex6 = 1, тернарный оператор даёт false,
                                            // выполняется часть 22 * 2 >> f++ = 44 >> 2 = 00001011 = 11
                                            // инкримент в f ещё не применён, декримент в g применён
                                            // целочисленное деление 11 на 7 = 1

        //int ex7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a;
        // некорректная запись, т.к. в левой части в значении true тернарного оператора булево значение,
        // которое не может быть поделено на int

        boolean first = 6 - 2 > 3 && 12 * 12 <= 119; // first = false, 4 > 3 && 144 <= 119, true && false
        boolean second = true && false; // second = false, аналогично first

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println(ex4);
        System.out.println(ex5);
        System.out.println(ex6);
        System.out.println(first);
        System.out.println(second);
    }
}
