public static void main(String[] args) {
    CustomStringMethods methods = new CustomStringMethods();
    String str = methods.insertAt("ghost", "BOO!", "o");
    System.out.println(str);
    str = methods.insertAt("ghost", "BOO!", "st");
    System.out.println(str);
    str = methods.insertAt("ghost", "BOO!", "m");
    System.out.println(str);
    str = methods.insertAt("spooooky!", "YIKES", "o");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", "18th", "y");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", "18th", "birthday");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", "18th", " ");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", " 18th", " ");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", "18th ", "bir");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", "18th", "!");
    System.out.println(str);
    str = methods.insertAt("happy birthday!", "18th", "z");
    System.out.println(str);
    str = methods.insertAt("a", "m", "a");
    System.out.println(str);
    str = methods.insertAt("a", "m", "p");
    System.out.println(str);
}