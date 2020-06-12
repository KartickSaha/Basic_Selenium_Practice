package basic_java;

public class CompareIgnoreCaseExample {
    public static void main(String args[]) {
        String string1 = "HELLO";
        String string2 = "hello99";
        String string3 = "HellO100";

        int var1 = string1.compareToIgnoreCase(string2);
        System.out.println("string1 and string2 comparison: "+var1);

        int var2 = string1.compareToIgnoreCase(string3);
        System.out.println("string1 and string3 comparison: "+var2);

        int var3 = string1.compareToIgnoreCase("HeLLo");
        System.out.println("string1 and HeLLo comparison: "+var3);
    }
}
