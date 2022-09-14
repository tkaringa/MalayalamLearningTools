public class MalayalamLetters {

    private static String[] letters = new String[] {"അ", "ആ", "ഇ", "ഈ", "ഉ", "ഊ", "ഋ", "എ", "ഏ", "ഐ", "ഒ", "ഓ", "ഔ", "ക", "ഖ", "ഗ", "ഘ", "ങ", "ച", "ഛ", "ജ", "ഝ", "ഞ", "ട ", "ഠ", "ഡ", "ഢ", "ണ", "ത", "ഥ", "ദ", "ധ", "ന", "പ", "ഫ", "ബ", "ഭ", "മ", "യ ", "ര", "റ", "ല", "ള", "വ", "ശ", "ഷ", "സ", "ഹ"};
    private static String[] pronuciation = new String[] {"a", "aa", "e", "ee", "u", "uu", "ear", "a", "aa", "i", "o", "oo", "ow", "ka", "kha", "ga", "gha", "naw", "ca", "cha", "ja", "jha", "nya", "ta", "thaw", "da", "dha", "nah", "ta", "tha", "da", "dha", "na", "pa", "pha", "ba", "bha", "ma", "ya", "ra", "rah", "la", "law", "va", "sha", "shhaw", "sa", "ha"};

        static boolean isLetterCorrect(int index, String input) {
            if(pronuciation[index].equals(input)) {
                return true;
            }
            return false;
        }

        static String getLetter(int i) {
            return letters[i];
        }

        static String getPronunciation(int i) {
            return pronuciation[i];
        }
}
