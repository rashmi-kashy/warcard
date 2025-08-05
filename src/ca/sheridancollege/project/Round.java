/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author rashm
 */
public class Round {
    public static Card[] playRound(Player p1, Player p2) {
        Card c1 = p1.playCard();
        Card c2 = p2.playCard();
        System.out.println(p1.getName() + " plays: " + c1);
        System.out.println(p2.getName() + " plays: " + c2);
        return new Card[]{c1, c2};
    }
    public static int compareCards(Card c1, Card c2) {
        return Integer.compare(c1.getRank(), c2.getRank());
    }
    
}
