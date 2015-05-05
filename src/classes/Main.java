package classes;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import classes.NossaImplementacao_ForcaBruta;


/**
 * 
 * This is the Main class of our program
 * @author Arthur, Brunna
 *
 */
public class Main {

	public static void main(String[] args){
		
		try{
			
			String tecnica = args[0];
			
			if (tecnica.equalsIgnoreCase("Knuth-Morris-Pratt")){
				
			}
			else if(tecnica.equalsIgnoreCase("Rabin–Karp")){
				
			}
			else if(tecnica.equalsIgnoreCase("forca-bruta")){
				
			}
			
			String entrada  = deserializeString(new File(args[2]));
			
			String padrao  = deserializeString(new File(args[1]));

			NossaImplementacao_ForcaBruta nossaImpl = new NossaImplementacao_ForcaBruta(entrada,padrao);
			nossaImpl.search();

		}
		catch(Exception e ){
			System.out.println("Error");
		}

	}
	
	/**
	 * This method takes a file as input and returns a string that represents the file
	 * @param file
	 *           This is the file
	 * @return
	 *           A string
	 * @throws IOException
	 *          Case file was not found 
	 */
	
	public static String deserializeString(File file) throws IOException {
	      int len;
	      char[] chr = new char[4096];
	      final StringBuffer buffer = new StringBuffer();
	      final FileReader reader = new FileReader(file);
	      try {
	          while ((len = reader.read(chr)) > 0) {
	              buffer.append(chr, 0, len);
	          }
	      } finally {
	          reader.close();
	      }
	      return buffer.toString();
	}
}
