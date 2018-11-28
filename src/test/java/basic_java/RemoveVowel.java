package basic_java;

public class RemoveVowel {

    public static void main(String[] args) {
       removeVowel01();
       removeVowel02();
    }
    public static void removeVowel01(){
        String string = "Bangladesh";
        String lowerCase = string.toLowerCase();
        String removeVowel = lowerCase.replaceAll("[aeiou]","");
        System.out.println(removeVowel);
    }
    public static void removeVowel02(){
        String string = "Bangladesh";
        String removeVowel = string.replaceAll("[aAeEiIoOuU]","");
        System.out.println(removeVowel);
    }
}
