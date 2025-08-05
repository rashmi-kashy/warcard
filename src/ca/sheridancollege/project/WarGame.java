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
public class WarGame extends Game {public WarGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        Player p1 = getPlayers().get(0);
        Player p2 = getPlayers().get(1);
        while (p1.hasCards() && p2.hasCards()) {
            
            System.out.println("\nCurrent Cards for players: " + p1.getName() + " = " + p1.getCardCount() + ", " + p2.getName() + " = " + p2.getCardCount());
            Card[] cards = Round.playRound(p1, p2);
            int result = Round.compareCards(cards[0], cards[1]);
            if (result > 0) {
                List<Card> won = new ArrayList<>();
                won.add(cards[0]);
                won.add(cards[1]);
                p1.collectCards(won);
            } else if (result < 0) {
                List<Card> won = new ArrayList<>();
                won.add(cards[0]);
                won.add(cards[1]);
                p2.collectCards(won);
            } else {
                WarHandler.resolveWar(cards[0], cards[1], p1, p2);
            }
        }
    }@Override
    public void declareWinner() {
        Player p1 = getPlayers().get(0);
        Player p2 = getPlayers().get(1);
        if (p1.hasCards()) {
            System.out.println(p1.getName() + " wins the game!");
        } else if (p2.hasCards()) {
            System.out.println(p2.getName() + " wins the game!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    
}
