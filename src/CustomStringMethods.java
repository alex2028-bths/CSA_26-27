public class CustomStringMethods {
    public CustomStringMethods() {}
    public boolean longerThan(String myString, int maxLength) {
        return myString.length() > maxLength;
    }
    public String funnyString(String str, int idx) {
        return (str.substring(idx, idx+1))+str+str.substring(idx, idx+1);
    }
    public String halvesReversed(String myString) {
        if ((myString.length())%2 == 0) {
            String string1 = myString.substring((myString.length()/2));
            String string2 = myString.substring(0, (myString.length()/2) );
            myString = string1+string2;
        }
        else {
            myString = "odd";
        }
        return myString;
    }
}
