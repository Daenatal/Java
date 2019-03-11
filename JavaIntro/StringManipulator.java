public class StringManipulator {
    public String trimAndConcat(String one, String two) {
        String onetrim = one.trim();
        String twotrim = two.trim();
        String three = onetrim.concat(twotrim);
        return three; 
    }
    public Integer getIndexOrNull(String word, char letter) {
        Integer b = word.indexOf(letter);
        if (b == -1) {
            return null;
        } else{
            return b;
        }
    }
    public Integer getIndexOrNull(String word, String letter1) {
        Integer b = word.indexOf(letter1);
        if (b == -1) {
            return null;
        } else{
            return b;
        }
    }
    public String concatSubstring(String word, int index1, int index2, String word2) {
        String word3 = word.substring(index1, index2);
        String finalWord = word3.concat(word2);
        return finalWord;
    }
}