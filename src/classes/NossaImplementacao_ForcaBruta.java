package classes;


/**
 * 
 * This class implements an algorithm that will look for a pattern inside a
 * string
 * 
 * @author Arthur, Brunna
 */

public class NossaImplementacao_ForcaBruta {

	private String text;
	private String pattern;
	private int operationNumber = 0;

	/**
	 * This is the class constructor
	 * 
	 * @param text
	 *            This is the text where we will find or not a pattern
	 * @param pattern
	 *            This is the pattern we want to find
	 * 
	 */
	public NossaImplementacao_ForcaBruta(String text, String pattern) {
		this.text = text;
		this.pattern = pattern;
	}

	/**
	 * The method below will search for the pattern and prompt to the user if it
	 * was found or not
	 */
	public void search() {
		char[] temp_text = text.toCharArray();
		char[] temp_pattern = pattern.toCharArray();
		int posicao = -1;

		for (int i = 0; i < temp_text.length; i++) {
			if (temp_text[i] == temp_pattern[0]) {
				if (compare(temp_text, temp_pattern, i)) {
					posicao = i;
				}
			}
			else {
				this.operationNumber += 1;
			}
		}
		if (posicao == -1) {
			System.out.println("resultado: nao contem ");
		} else {
			System.out.println("resultado: contem");
		}
	}

	private boolean compare(char[] text, char[] pattern, int pos) {
		boolean temp = true;
		int z = 0;
		for (int i = pos; z < pattern.length; i++) {
			this.operationNumber += 1;
			if (text[i] != pattern[z]) {
				temp = false;
				break;
			}
			z++;
		}
		return temp;
	}
	
	public int getOperationNumber(){
		return this.operationNumber;
	}
}

