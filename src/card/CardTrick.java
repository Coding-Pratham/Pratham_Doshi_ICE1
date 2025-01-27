/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * PrathamDoshi 991759009
 * @author srinivsi
 */


import java.util.Random;

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
        

        // Step 3: Add a hardcoded lucky card (2 of Clubs)
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Check if the lucky card is in the magic hand
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You have found the lucky card (2 of Clubs)!");
        } else {
            System.out.println("The lucky card (2 of Clubs) is not in the magic hand.");
        }
    }
}

