package basic_java;

public class ContentEquals {

    public static void main(String args[]) {
        String str1 = "Bangladesh";
        String str2 = "Bangladesh01";
        StringBuffer str3 = new StringBuffer( "Bangladesh01");
        //StringBuffer str4 = new StringBuffer( "First String");
        System.out.println("str1 equals to str3:"+str1.contentEquals(str3));
        System.out.println("str2 equals to str3:"+str2.contentEquals(str3));
        //System.out.println("str1 equals to str4:"+str1.contentEquals(str4));
        ////System.out.println("str2 equals to str4:"+str2.contentEquals(str4));
    }
}
