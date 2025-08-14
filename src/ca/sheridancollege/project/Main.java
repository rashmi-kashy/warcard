/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rashm
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ask for player names
        System.out.print("Enter Player 1 name: ");
        String player1Name = sc.nextLine();

        System.out.print("Enter Player 2 name: ");
        String player2Name = sc.nextLine();
        
        GroupOfCards deck = new GroupOfCards(52);
        deck.generateDeck();
        deck.shuffle();

        WarPlayer p1 = new WarPlayer(player1Name);
        WarPlayer p2 = new WarPlayer(player2Name);

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                p1.addToHand(List.of(deck.getCards().get(i)));
            } else {
                p2.addToHand(List.of(deck.getCards().get(i)));
            }
        }

   

        WarGame game = new WarGame("War Card Game");
        game.registerPlayer(p1);
        game.registerPlayer(p2);

        game.play();
        game.declareWinner();  
     sc.close();}
}
    

