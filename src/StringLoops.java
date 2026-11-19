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

    public boolean isPalindrome(String myString) {
        myString = removeString(" ", myString);
        return (myString.equals(reverseString(myString)));
    }
}

