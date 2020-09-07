/**
 * 
 */
package flashcardGameTests;

/**
 * @author Andrè Clark
 *
 */
public class QuestionCard extends Card{
	private int id;
	private String question;
	
	public QuestionCard(int _id) {
		super(_id, "Question: " + _id);
		//this.setId(_id);
		//this.setQuestion("Question: " + _id);
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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
