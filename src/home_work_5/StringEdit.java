package home_work_5;

public class StringEdit { // НАХУЯ ЭТОТ КЛАСС

    public String edit(String string) {
        string = string.replaceAll("(--)|[.,!?=*;:\"()<>]|(\\s*-\\s+)|(\\s+-\\s*)", " ");
        return string;
    }

    public String[] split(String string) {
        string = edit(string);
        return string.split("\\s+");
    }
}
