package basic_java;

public class StringRecursiveReversal {
    String reverse = "";

    public String reverseString(String str){

        if(str.length() == 1){
            return str;
        } else {
            reverse = str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("KartickSaha"));

        // How to find the length of String
        String s= "Bangla";
        System.out.println("Results of String length is -->"+s.length());

        StringBuffer stringBuffer = new StringBuffer(s);
       // stringBuffer.reverse();
        stringBuffer.reverse();
        System.out.println("reverse string is "+stringBuffer.reverse());

    }
}
