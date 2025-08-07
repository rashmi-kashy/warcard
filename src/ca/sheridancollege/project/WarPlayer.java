/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rashm
 */
public class WarPlayer extends Player {
    
    protected LinkedList<Card> hand = new LinkedList<>();

    public WarPlayer(String name) {
        super(name);
    }

    public void addToHand(List<Card> cards) {
        hand.addAll(cards);
    }

    @Override
    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.poll();
        }
        return null;
    }

    @Override
    public void collectCards(List<Card> wonCards) {
        hand.addAll(wonCards);
    }

    @Override
    public void play() {
    }

    @Override
    public boolean hasCards() {
        return !hand.isEmpty();
    }
    
    public int getCardCount() {
        return hand.size();
    }
}
    
