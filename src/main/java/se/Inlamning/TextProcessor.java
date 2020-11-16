package se.Inlamning;



public class TextProcessor {
    public String textToUpperCase(String str1) {
        return str1.toUpperCase();
    }

    public  String textToLowerCase(String str2) {
        return str2.toLowerCase();
    }
    public static String reverse (String str){
       return  new StringBuilder(str).reverse().toString();
    }



    public static void main(String[] args) {
        System.out.println("UpperCase = " + new TextProcessor().textToUpperCase("watch out!"));
        System.out.println("LowerCase = " + new TextProcessor().textToLowerCase("TAKE IT EASY"));

        String str = " krowemoh ";
        str=reverse(str);
        System.out.println(" Reverse = " + str);

    }

}
