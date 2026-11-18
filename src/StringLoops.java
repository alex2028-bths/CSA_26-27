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

    /* Returns the number of times "searchString" appears in "origString";
   matches should be case-sensitive (i.e. no need to worry about lower vs. uppercase)

   Examples:
   - if searchString = "an" and origString = "canned beans and bananas",
     this method returns 5: canned beans and bananas
   - if searchString = "tat" and origString = "Ratatattat",
     this method returns 3: Ratatattat (note the overlap!)
   - if searchString = "lower" and origString = "sunflower",
     this method returns 1: sunflower
   - if searchString = "haha" and origString = "Hahahahaha",
     this method returns 3: Hahahahaha (note the overlap!)
   - if searchString = "rain" and origString = "rain drain pain train",
     this method returns 3: rain drain pain train
   - if searchString = "was" and origString = "I was about to call you",
     this method returns 1: I was about to call you
   - if searchString = "but" and origString = "I was about to call you",
     this method returns 0: I was about to call you
   - searchString = "i", origString = "iiiit's supercalifragilisticexpialidociousi",
     this method returns 12: iiiit's supercalifragilisticexpialidociousi
  */
    public int countString(String searchString, String origString) {
        int count = 0;
        String template = "";
        for(int i = 0; i < origString.length() - searchString.length(); i++) {
            template = origString.substring(i, i + searchString.length());
            if(template.equals(searchString)) {
                count++;
            }
        }
        return count;
    }

}

