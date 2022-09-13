public class MalayalamLetters {

    private static String[] letters = new String[] {"a", "b", "c", "d"};
    private static String[] pronuciation = new String[] {"a", "b", "c", "d"};

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