package sebbppe.utils;

public class Color {
    public static final String red="\033[31m";
    public static final String green="\033[32m";
    public static final String yellow="\033[33m";
    public static final String blue="\033[34m";
    public static final String purple="\033[35m";
    public static final String reset="\u001B[0m";
    public static final String plus =green+"+"+reset;
    public static final String minus =red+"-"+reset;
    public static final String ballColor =purple+"o"+reset;
    public static final String point =yellow+"*"+reset;
}
