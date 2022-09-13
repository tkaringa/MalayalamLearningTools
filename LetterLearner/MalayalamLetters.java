public class MalayalamLetters {

    private static String[] letters = new String[] {"അ", "ആ", "ഇ", "ഈ"};
    private static String[] pronuciation = new String[] {"a", "aa", "e", "ee"};

        static boolean isLetterCorrect(int index, String input) {
            if(pronuciation[index].equals(input)) {
                return true;
            }
            return false;
        }

        static String getLetter(int i) {
            return letters[i];
    }
}
