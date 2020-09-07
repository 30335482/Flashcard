/**
 * 
 */
package flashcardGameTests;

/**
 * @author Andrè Clark
 *
 */
public class AnswerCard extends Card{
	private int id;
	private String answer;
	
	public AnswerCard (int _id) {
		super(_id, "Answer: " + _id);
		//this.setId(_id);
		//this.setAnswer("Answer: " + _id);
		
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
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
