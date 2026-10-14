public class Runner {
    public static void main(String[] args){

        String str1 = "Hello how are you today?";
        System.out.println(str1.length());
        System.out.println(str1.indexOf("H"));
        System.out.println(str1.indexOf("h"));
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.indexOf("o"));
        System.out.println(str1.indexOf("?"));
        System.out.println(str1.indexOf("ll"));
        System.out.println(str1.indexOf("ello"));
        System.out.println(str1.indexOf("lo ho"));
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.indexOf("W"));
        System.out.println(str1.indexOf(" "));
        System.out.println(str1.indexOf("howare"));
        System.out.println(str1.indexOf("Are"));
        System.out.println(str1.indexOf("Hello how are you today?"));

        int x = str1.indexOf("e") + str1.indexOf("E");
        System.out.println(x);

        String str2 = "how";
        System.out.println(str1.indexOf(str2));
        System.out.println(str2.indexOf(str1));
    }
}