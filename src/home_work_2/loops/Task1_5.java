package home_work_2.loops;

public class Task1_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                if (i < 10 & (j * i) < 10) {
                    System.out.print(j + " *  " + i + " = " + j * i + "    ");
                } else if (i < 10) {
                    System.out.print(j + " *  " + i + " = " + j * i + "   ");
                } else {
                   System.out.print(j + " * " + i + " = " + j * i + "   ");
                }
            }
        System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                if (i < 10 & (j * i) < 10) {
                    System.out.print(j + " *  " + i + " = " + j * i + "    ");
                } else if (i < 10) {
                    System.out.print(j + " *  " + i + " = " + j * i + "   ");
                } else {
                    System.out.print(j + " * " + i + " = " + j * i + "   ");
                }
            }
            System.out.println("");
        }
    }
}
