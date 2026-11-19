public class StringLoops {
    public StringLoops() {}

    public int countCharacters(String character, String searchString) {
        searchString = searchString.toLowerCase();
        character = character.toLowerCase();
        int count = 0;
        for(int i = 0; i < searchString.length(); i++) {
            if((searchString.substring(i,i+1).equals(character))) {
                count++;
            }
        }
        return count;
    }

    public String reverseString(String origString) {
        String reverseString = "";
        for(int i = origString.length() - 1; i >= 0; i--) {
            reverseString += origString.substring(i, i+1);
        }
        return reverseString;
    }

    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
        String newString = "";
        for(int i = 0; i < origStr.length(); i++) {
            String character = origStr.substring(i,i+1);
            if(!(character.equals(searchChar))) {
                newString += character;
            } else {
                newString += replaceChar;
            }
        }
        return newString;
    }

    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
        int index = 0;
        while((origStr.indexOf(searchChar) != -1)) {
            index = origStr.indexOf(searchChar);
            origStr = origStr.substring(0, index) + replaceChar + origStr.substring(index + 1);
        }
        return origStr;
    }

    public int countString(String searchString, String origString) {
        int count = 0;
        String template = "";
        for(int i = 0; i <= origString.length() - searchString.length(); i++) {
            template = origString.substring(i, i + searchString.length());
            if(template.equals(searchString)) {
                count++;
            }
        }
        return count;
    }

    public String removeString(String searchString, String origString) {
       while (origString.indexOf(searchString) != -1) {
           int index = origString.indexOf(searchString);
           origString = origString.substring(0,index) + origString.substring(index + searchString.length());
       }
        return origString;
    }

    /* Returns true if myString is a palindrome, i.e. the characters read the same
   forwards and backwards, and false otherwise. Don't worry about case.
   NOTE!  Spaces should be disregarded when determining if it's a palindrome.
   "no lemon no melon" is a palindrome!

    Examples:
    - myString = "A", return true
    - myString = "mom", return true
    - myString = "dad", return true
    - myString = "bob", return true
    - myString = "noon", return true
    - myString = "deed", return true
    - myString = "12321", return true
    - myString = "aaaaaaa", return true
    - myString = "baaabaaab", return true
    - myString = "civic", return true
    - myString = "kayak", return true
    - myString = "racecar", return true
    - myString = "my gym", return true
    - myString = "step on no pets", return true
    - myString = "45TTGTT54", return true
    - myString = "no lemon no melon", return true
    - myString = "a nut for a jar of tuna", return true
    - myString = "! 1 2 3 4 M 6M4321!", return true
    - myString = "was it a car or a cat i saw", return true
    - myString = "a man a plan a canal panama", return true
    - myString = "mod", return false
    - myString = "dang", return false
    - myString = "boo", return false
    - myString = "noonish", return false
    - myString = "indeed", return false
    - myString = "1234432", return false
    - myString = "civics", return false
    - myString = "kayaks", return false
    - myString = "racing car", return false
    - myString = "my gyms", return false
    - myString = "step on pets", return false
    - myString = "1 3 2 4 3 2 1", return false
    - myString = "AAADAA", return false
    - myString = "BaaBaaaB", return false
   */
    public boolean isPalindrome(String myString) {
        myString = removeString(" ", myString);
        return (myString.equals(reverseString(myString)));
    }
}

