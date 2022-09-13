import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letterAnswer = "";
        int letterIndex = 0;
        do  {
            letterIndex = (int) Math.floor(Math.random() * 4); //creates a random index to find a letter in the malayalam array
            System.out.println("Please type how you would pronounce " + "'" + MalayalamLetters.getLetter(letterIndex) + "': ");
            letterAnswer = in.nextLine();
            while(!MalayalamLetters.isLetterCorrect(letterIndex, letterAnswer)) {
                System.out.println("Sorry, that wasn't right, try again: ");
                letterAnswer = in.nextLine();
            }
            System.out.println("Awesome job! Keep going, press any key to continue, or type 'stop' to terminate program");
        } while (!(in.nextLine().equals("stop")));
    }
}
