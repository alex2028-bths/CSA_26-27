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
}

