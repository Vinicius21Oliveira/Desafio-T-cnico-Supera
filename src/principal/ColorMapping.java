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
}

