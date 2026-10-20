public class CustomStringMethods {
    public CustomStringMethods() {
    }

    public boolean longerThan(String myString, int maxLength) {
        return myString.length() > maxLength;
    }

    public String funnyString(String str, int idx) {
        return (str.substring(idx, idx + 1)) + str + str.substring(idx, idx + 1);
    }

    public String halvesReversed(String myString) {
        String string1 = myString.substring((myString.length() / 2));
        String string2 = myString.substring(0, (myString.length() / 2));
        myString = string1 + string2;
        return myString;
    }

    public String pigLatin(String orig) {
        orig = orig.substring(1, orig.length()) + orig.substring(0, 1) + "ay";
        return orig;
    }

    public String removeCharacter(String myString, int removeIdx) {
        if (removeIdx < myString.length()) {
            myString = myString.substring(0, removeIdx) + myString.substring(removeIdx + 1);
        }
        return myString;
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        if (orig.indexOf(searchStr) > 0) {
            return orig.substring(0, orig.indexOf(searchStr)) + insertText + orig.substring(orig.indexOf(searchStr), orig.length());
        }
        return orig+insertText;
    }
}