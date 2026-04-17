
//Chapter 7
//7.4
//Listing 7.2 Case Study

public class DeckOfCards {

    public static void printer(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        // Fills the deck array with numbers 0-51 which means 52 cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        // Shuffles the deck
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Displays the random four first cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("The card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}