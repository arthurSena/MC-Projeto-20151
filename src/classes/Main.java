package classes;

import java.io.File;
import java.io.FileNotFoundException;
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
			double currentMemory1 = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
			String tecnica = args[0];
			
			String entrada  = deserializeString(new File(args[2]));
			
			String padrao  = deserializeString(new File(args[1]));

			if (tecnica.equalsIgnoreCase("Knuth-Morris-Pratt")){
				System.out.println("texto_buscado: "
						+ (new File(args[1]).getName()) + " texto_busca: "
						+ (new File(args[2]).getName()));

				
			    long inicio = System.currentTimeMillis();    
			    KnuthMorrisPratt kmp = new KnuthMorrisPratt(entrada, padrao);    
			    long fim  = System.currentTimeMillis();    
			    long tempo = fim - inicio;
			    System.out.println("tempo_execucao: " + String.valueOf(tempo) +" milisegundos ");  
			    double currentMemory2 = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
			    System.out.println("consum_memom: " + (currentMemory2 - currentMemory1)/1024 + "MB");
			    System.out.println("num_operacaoes: " + kmp.getOperationNumber());
			}
			else if(tecnica.equalsIgnoreCase("Rabin–Karp")){
				System.out.println("texto_buscado: "
						+ (new File(args[1]).getName()) + " texto_busca: "
						+ (new File(args[2]).getName()));
				
				 long inicio = System.currentTimeMillis();    
	            RabinKarp rk = new RabinKarp(entrada, padrao);   
	            long fim  = System.currentTimeMillis();    
			    long tempo = fim - inicio;
			    System.out.println("tempo_execucao: " + String.valueOf(tempo) +" milisegundos ");   
			    double currentMemory2 = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
			    System.out.println("consum_memom: " + (currentMemory2 - currentMemory1)/1024 + "MB");
			    System.out.println("num_operacaoes: " + rk.getOperationNumber());

			}
			else if(tecnica.equalsIgnoreCase("forca-bruta")){
				System.out.println("texto_buscado: "
						+ (new File(args[1]).getName()) + " texto_busca: "
						+ (new File(args[2]).getName()));
				NossaImplementacao_ForcaBruta nossaImpl = new NossaImplementacao_ForcaBruta(entrada,padrao);
				
				long inicio = System.currentTimeMillis();    
				nossaImpl.search();
				long fim  = System.currentTimeMillis();    
			    long tempo = fim - inicio;
			    System.out.println("tempo_execucao: " + String.valueOf(tempo) +" milisegundos ");  
			    double currentMemory2 = ( (double)((double)(Runtime.getRuntime().totalMemory()/1024)/1024))- ((double)((double)(Runtime.getRuntime().freeMemory()/1024)/1024));
			    System.out.println("consum_memom: " + (currentMemory2 - currentMemory1)/1024 + "MB");
			    System.out.println("num_operacaoes: " + nossaImpl.getOperationNumber());

			}
			else{
				System.out.println("Tecnica Inválida.");
			}
			
		}
		catch(FileNotFoundException e ){
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println(e.getMessage());
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

