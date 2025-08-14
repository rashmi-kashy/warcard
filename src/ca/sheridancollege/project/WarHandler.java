/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author rashm
 */
public class WarHandler { 
     public static List<Card> resolveWar(Card c1, Card c2, Player p1, Player p2) {
        List<Card> warPile = new ArrayList<>();
        warPile.add(c1);
        warPile.add(c2);
        
        if (p1.getCardCount() <4){
            
            p2.collectCards(warPile);
            return warPile;}
        
        if (p2.getCardCount() <4){
        
        
        p1.collectCards(warPile);
        return warPile;
        
        }        
        for (int i = 0; i < 3; i++) {
            Card card1 = p1.playCard();
            Card card2 = p2.playCard();
            if (card1 != null) warPile.add(card1);
            if (card2 != null) warPile.add(card2);
        }
        Card final1 = p1.playCard();
        Card final2 = p2.playCard();
        if (final1 != null) warPile.add(final1);
        if (final2 != null) warPile.add(final2);
        int result = Round.compareCards(final1, final2);
        if (result > 0) {
            p1.collectCards(warPile);
        } else if (result < 0) {
            p2.collectCards(warPile);
        }
        return warPile;
    }
}
    

