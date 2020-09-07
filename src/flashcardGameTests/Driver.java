/**
 * 
 */
package flashcardGameTests;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andrè Clark
 *
 */
public class Driver {
	Scanner console;
	boolean stillRunning;
	private int pairsMax = 5;
	private int pairsMin = 1;
	//will almost defiantly need to make deck into some sort of collection
	Deck deck;
	//ArrayList<Card> deckCards = new ArrayList<Card>();
	Deck gameDeck;

	
	/**
	 * @param args
	 */
	public Driver() {
		this.console = new Scanner(System.in);
		stillRunning = true;
	}
	
	public void start() {
		int choice;
		while(stillRunning) {
			showMainMenu();
			choice = getUserSelection(0, 13);
			if (choice == 0) stillRunning = false;
			processChoiceMainMenu(choice);
		}
	}
	public void showMainMenu() {
		System.out.println();
		System.out.println("What Do");
		System.out.println("1. Create Deck?");
		System.out.println("2. Create card?");
		System.out.println("3. Sets?");
		System.out.println("4. Match?");

		//add more to as needed
	}
	public void processChoiceMainMenu(int choice) {
		switch(choice) {
		case 1:
			deck = createNewDeck();
			//deckCards = deck.getCards();
			break;
		case 2:
			for (int i = 0; i < 5; i++) {
				createNewCard();
			}
			break;
		case 3:
			prepareGame();
			break;
			
		case 4:
			match();
			break;
		case 0:
			this.stillRunning = false;
			System.out.println("end");
			break;
		}
	}
	
	
	private Deck createNewDeck() {
		Deck d; //= new Deck();
		String dName;
		//dName = this.getAMultiwordString("Please name your deck: ");
		dName = "TEST";
		d = new Deck(dName);
		
		return d;
	}
	
	private Card createNewCard() {
		
		Card c = new Card();
		System.out.println(c.getId());
		// will change this later so the player can select a deck to add to
		deck.addCards(c);
		
		
		return c;
		
	}
	
	
	private void prepareGame() {
		//will have to change this so the player can select what deck to use
		Deck d = deck;
		AnswerCard a;
		QuestionCard q;
		//ArrayList<Card> gameCards = new ArrayList<Card>();
		if(deck.getCards().size() < pairsMax) {
			pairsMax = deck.getCards().size();
		}
		int p = setPairs();
		//will change this to be random cards later
		gameDeck = new Deck("tempDeck");
		for (int i = 0; i < p; i++) {
			int cardId = d.getCards().get(i).getId();
			a = new AnswerCard(cardId);
			q = new QuestionCard(cardId);
			//pairCard1 = d.getCards().get(i).getId() + d.getCards().get(i).getAnswer();
			System.out.println(a.getContent());
			//pairCard2 = d.getCards().get(i).getId() + d.getCards().get(i).getQuestion();
			System.out.println(q.getContent());
			//gameCards.add(d.getCards().get(i));
			gameDeck.addCards(a);
			gameDeck.addCards(q);
		}
		System.out.println(p);
		
		
	}
	private int setPairs() {
		int pairs;
		
		do {
			pairs = this.getANumber("Pairs?");
			if (pairs < pairsMin || pairs > pairsMax) {
				System.out.println("INVALID please enter a number between: " + pairsMin + " and " + pairsMax );
			}
		}while (pairs < pairsMin || pairs > pairsMax);

		return pairs;
		
	}
	private void match() {
		int deckSize = gameDeck.getCards().size();
		//gameDeck.getCards().size()
		for(int i = 0; i < deckSize; i++) {
			System.out.println(gameDeck.getCards().get(i).getContent());
		}

		//int cardIndex = getUserSelection(0, deckSize);
		//need to add stuff so the same card cant be picked for both and also that cards outside of the index cant be selected
		int cardIndex = validateCardIndex();
		
		//
		Card selectedCard = gameDeck.getCards().get(this.getANumber("[s]index in list"));
		Card matchCard = gameDeck.getCards().get(this.getANumber("[m]index in list"));
		
		if (selectedCard.getId() == matchCard.getId()) {
			System.out.println("MATCH");
			gameDeck.getCards().remove(selectedCard);
			gameDeck.getCards().remove(matchCard);
//			for(int i = 0; i < gameDeck.getCards().size(); i++) {
//				System.out.println(gameDeck.getCards().get(i).getContent());
//			}
			if (gameDeck.getCards().size() == 0) {
				System.out.println("WINNER");
			}else {
				match();
			}
		}else {
			System.out.println("WRONG");
			match();
		}
		
	}
	
	private int validateCardIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getUserSelection(int lower, int upper) {
		int userInput;
		if (lower > upper)
			return 0;
		do {
			System.out.print("Enter a number ("+lower +"-"+ upper+"):");
			userInput = console.nextInt();
			console.nextLine();
			
			if(userInput < lower || userInput > upper)
				System.out.println("Invalid choice");
		}while (userInput < lower || userInput > upper);
		System.out.println();
		return userInput;
	}
	
	public String getAString(String _prompt) {
		System.out.println(_prompt);
		String reply = this.console.next();
		if(this.console.hasNextLine()) this.console.nextLine();
		return reply;
	}
	
	public String getAMultiwordString(String _prompt) {
		System.out.println(_prompt);
		String ans = this.console.nextLine();
		return ans;
	}
	public int getANumber(String _prompt) {
		System.out.println(_prompt);
		int userInput = console.nextInt();
		console.nextLine();
		return userInput;
	}
	
	public static void main(String[] args) {
		Driver d = new Driver();
		d.start();

	}

}
