package basic_java;

public class StringReverse {



    public static void main(String[] args) {
        String str = "Bangla";
        StringBuilder sb = new StringBuilder(str);
        System.out.println( sb.reverse().toString());

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());



}


                }


