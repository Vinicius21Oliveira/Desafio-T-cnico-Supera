package principal;

import java.util.HashMap;
import java.util.Map;

public class ColorMapping {
	
	private static final Map<Character, String> colorCodes = new HashMap<>();

    static {
        colorCodes.put('0', "preto");
        colorCodes.put('1', "marrom");
        colorCodes.put('2', "vermelho");
        colorCodes.put('3', "laranja");
        colorCodes.put('4', "amarelo");
        colorCodes.put('5', "verde");
        colorCodes.put('6', "azul");
        colorCodes.put('7', "violeta");
        colorCodes.put('8', "cinza");
        colorCodes.put('9', "branco");
    }

    // Esse método é para obter uma cor a partir de um dígito
    public String getColor(char digit) {
        return colorCodes.get(digit);
    }
    
	/*
	 * Objetivo: Mapear os dígitos numéricos (0 a 9) para as suas respectivas cores.
	 * Importação das Bibliotecas: HashMap e Map eu importei para criar um mapeamento entre os dígitos e suas cores correspondentes. 
	 * Mapeamento de Cores (colorCodes): É uma variável estática e final, o que significa que é única para todas as instâncias da classe e seu valor não pode ser alterado. 
	 * Então nesse caso o mapeamento é feito dentro de um bloco static que é executado quando a classe é carregada.
	 * Método getColor: Este método recebe um dígito (caractere) como argumento e retorna a cor correspondente usando o colorCodes. 
	 * Por exemplo, se o dígito for '2', ele retornará "vermelho".
	 */
}

