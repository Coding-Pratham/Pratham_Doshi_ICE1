/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Pratham Doshi 991759009
 * @author srinivsi
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);  // Random number between 1-13
            c.setSuit(Card.SUITS[random.nextInt(4)]);  // Random suit from SUITS array
            magicHand[i] = c;
        }

        // Display generated cards for reference (Optional)
        System.out.println("Magic Hand Cards:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        // Prompt the user to pick a card
        Scanner input = new Scanner(System.in);
        System.out.println("\nPick a card (1-13): ");
        int number = input.nextInt();
        System.out.println("Pick a suit (Hearts, Diamonds, Spades, Clubs): ");
        String suit = input.next();
        
        // Search for the user's card in magicHand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == number && card.getSuit().equalsIgnoreCase(suit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
}
    

