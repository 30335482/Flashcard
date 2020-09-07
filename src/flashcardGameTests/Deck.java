/**
 * 
 */
package flashcardGameTests;

import java.util.ArrayList;

/**
 * @author Andrè Clark
 *
 */
public class Deck {
	private String name;
	private ArrayList<Card> cards = new ArrayList<Card>();;
	private int size = 0;
	/**
	 * @param args
	 */
	public Deck(String _name) {
		//cards 
		this.setName(_name);
		this.setSize();
	}
	
	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String _name) {
		this.name = _name;
	}

	/**
	 * @return the cards
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	private void setCards(ArrayList<Card> cards) {
		this.cards = cards;
		setSize();
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	private void setSize() {
		this.size = cards.size();
	}
	
	public void addCards(Card _card) {
		ArrayList<Card> temp = new ArrayList<Card>();
		temp = this.getCards();
		temp.add(_card);
		
		setCards(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
