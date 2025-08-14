/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;


import java.util.List;

/**
 *
 * @author rashm
 */
public class WarGame extends Game {
     private int roundNumber = 10;
    public WarGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        Player p1 = getPlayers().get(0);
        Player p2 = getPlayers().get(1);
        for (int round = 1; round <= roundNumber; round++) {
            System.out.println("\n Round " + round);

            Card c1 = ((WarPlayer) p1).playCard();
            Card c2 = ((WarPlayer) p2).playCard();

            if (c1 == null || c2 == null) {
                System.out.println("The end");
                break;
            }

            System.out.println(p1.getName() + " plays " + c1);
            System.out.println(p2.getName() + " plays " + c2);

            int result = Round.compareCards(c1, c2);

            if (result > 0) {
                System.out.println(p1.getName() + " wins this round");
                ((WarPlayer) p1).collectCards(List.of(c1, c2));
            } else if (result < 0) {
                System.out.println(p2.getName() + " wins this round");
                ((WarPlayer) p2).collectCards(List.of(c1, c2));
            } else {
                System.out.println("War!");
                WarHandler.resolveWar(c1, c2, (WarPlayer) p1, (WarPlayer) p2);
            }
        }
    }@Override
    public void declareWinner() {
        Player p1 = getPlayers().get(0);
        Player p2 = getPlayers().get(1);
        if (p1.hasCards()) {
            System.out.println(p1.getName() + " wins the game.");
        } else if (p2.hasCards()) {
            System.out.println(p2.getName() + " wins the game.");
        } else {
            System.out.println("It's a tie");
        }
    }

    
}
