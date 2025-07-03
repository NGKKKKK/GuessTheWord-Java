package Java;

import java.util.Random;
import java.util.Scanner;

//Game đoán từ

class Game{
    private static final int MAX_WORDS = 15;
    private static final int MAX_TOPICS = 4;
    private static final String[] TOPICS = {"Animals", "Contries", "Food", "Technology"};
    private static final String[][] WORDS = {{"cat", "dog", "elephant", "tiger", "lion", "bear", "wolf", "rabbit", "giraffe", "zebra", "monkey", "snake", "fox", "dolphin", "kangaroo"},
                                            {"vietnam", "japan", "france", "germany", "italy", "canada", "brazil", "egypt", "thailand", "norway", "australia", "spain", "sweden", "china", "mexico"},
                                            {"pizza", "burger", "sandwich", "noodles", "sushi", "spaghetti", "bread", "chocolate", "cheese", "salad", "pancake", "sausage", "taco", "curry", "donut"},
                                            {"computer", "internet", "keyboard", "monitor", "smartphone", "laptop", "camera", "speaker", "charger", "battery", "mouse", "tablet", "software", "hacker", "server"}
                                            };
    private static final String WINNER_MESSAGE = "You're the winner. Congratulation !!!";
    private static final String LOSER_MESSAGE = "Poor you:( You lost...";
    
    
    public static void PlayGame(){
        Scanner sc = new Scanner(System.in);
        Random rd_words = new Random();
        Random rd_topics = new Random();
        boolean isEndGame = false;
        System.out.println("Welcome to Guess The Word !");
        System.out.println();
        int topics = rd_topics.nextInt(MAX_TOPICS);
        int words = rd_words.nextInt(MAX_WORDS);
        String target = WORDS[topics][words];
        int alives = target.length();
        boolean win = false;
        String yourGuess = "";
        int need = alives;
        for (int i = 0 ; i < alives ; ++i) yourGuess += '_';
        while (!isEndGame){
            try {
                String guess;
                while (alives > 0 && !win){
                    System.out.println("This is your word's topic: " + TOPICS[topics]);
                    System.out.println("Your alives: " + alives);
                    System.out.println("Current progress: " + yourGuess + " (" + need + " characters left)");
                    System.out.print("Enter your guess (only 1 character): ");
                    guess = sc.nextLine();
                    System.out.println();
                    if (guess.length() != 1) continue; // Nếu đầu vào có 0 hoặc từ 2 kí trở lên thì nhập lại.
                    char key = Character.toLowerCase(guess.charAt(0));

                    //Kiểm tra xem chữ cái mà mình đoán có trong từ không ??
                    int indx = -1;
                    for (int i = 0 ; i < target.length() ; ++i){
                        if (yourGuess.charAt(i) == '_' && key == target.charAt(i)){ //Chữ cái tìm thấy nhưng chưa được mở khóa.
                            need--;
                            indx = i;
                            break;
                        }
                    }
                    if (indx == -1){
                        alives--;
                        continue; 
                    } // Nếu không có chữ cái mà mình đoán trong từ.
                    yourGuess = yourGuess.substring(0,indx) + key + yourGuess.substring(indx+1);
                    if (yourGuess.equals(target)) win = true;
                }
                
            } catch (Exception e) {
                System.err.print("Error: ");
                System.err.println(e.getMessage());
            }
            System.out.println("The word is: " + target);
            if (alives == 0) {
                System.out.print(LOSER_MESSAGE);
                isEndGame = true;
            }
            else{
                System.out.println(WINNER_MESSAGE);
                isEndGame = true;
            }
        }
        sc.close();
    }
}

public class GuessTheWord {
    public static void main(String[] args) {
        Game.PlayGame();
    }
    
}
