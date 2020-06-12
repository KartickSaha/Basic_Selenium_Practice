package basic_java;

import java.util.Locale;

public class UpperCaseExample {
    public static void main(String args[]){
        String str = new String("kartick saha");
        //Standard method of conversion
        System.out.println(str.toUpperCase());

        //By specifying Locale
        //System.out.println(str.toUpperCase(Locale.CHINA));
    }
}