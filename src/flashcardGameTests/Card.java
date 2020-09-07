/**
 * 
 */
package flashcardGameTests;

/**
 * @author Andrè Clark
 *
 */
public class Card {
	private int id;
	//may use may not
	private static int nextPairId = 1;
	private static int nextId;
	private String answer; //card 1
	private String question; // card 2
	private static int nextIndiId;
	private String content;
	// might make diffrent classes for both question and awnser
	//might need to have a super class if we want to change the content type on the cards but for now this will do
	/**
	 * @param args
	 */
	
	public Card() {
		this.setId(getNextId());
		this.answer = "a"+id;
		this.question = "q"+id;
	}
	
	public Card(int _id, String _content) {
		this.setId(_id);
		this.setContent(_content);
	}
	
	
	
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	private void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}




	/**
	 * @param answer the answer to set
	 */
	private void setAnswer(String answer) {
		this.answer = answer;
	}




	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}




	/**
	 * @param question the question to set
	 */
	private void setQuestion(String question) {
		this.question = question;
	}




	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	private void setId(int id) {
		
		this.id = id;
	}

	private int getNextId() {
		int _nextid = Card.nextId++;
		
		return _nextid;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
