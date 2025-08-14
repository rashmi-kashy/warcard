/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
this is the updated one
 */
public abstract class Card {
    private String suit;
    private int rank;
    
    public Card(String suit, int rank){
        
        this.suit = suit;
        this.rank = rank;}
    
    public int getRank(){
    
    return rank;
    }
    
    public String getSuit(){
    
    return suit;
    }
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public String toString(){
       
        
        return rank +"of " + suit;
    }

}
