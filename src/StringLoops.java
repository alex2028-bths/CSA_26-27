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

    /* Returns a String with all instances of "searchChar" in "origString" replaced with
   "replaceChar"; matches should be case-sensitive (i.e. no need to worry about
    lowercase vs. uppercase)

   - if searchChar = "a", origString = "canned beans and bananas", replaceChar = "*"
     this method returns "c*nned be*ns *nd b*n*n*s" (A not a match because of case)
   - if searchChar = "t", origString = "Ratatattat", replaceChar = "p"
     this method returns "Rapapappap"
   - if searchChar = "!", origString = "Nice! Day today!", replaceChar = "?"
     this method returns "Nice? Day today?"
   - if searchChar = "i", origString = "it’s the brain drain pain train",
     replaceChar = "I", this method returns "It’s the braIn draIn paIn traIn"
   - if searchChar = "i", origString = "it’s the brain drain pain train",
     replaceChar = " ", this method returns " t’s the bra n dra n pa n tra n"
   - if searchChar = "A", origString = "ABABABABABC", replaceChar = "D"
     this method returns "DBDBDBDBDBC"
   - if searchChar = "a", origString = "ABABABABABC", replaceChar = "D"
     this method returns "ABABABABABC" (no matches because of case)


    PRECONDITION: searchChar and replaceChar are single characters and are not equal
  */
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

}

