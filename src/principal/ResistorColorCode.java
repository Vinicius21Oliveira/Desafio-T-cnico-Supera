package principal;

public class ResistorColorCode {
	
	private final ColorMapping colorMapping;


    public ResistorColorCode() {
        this.colorMapping = new ColorMapping();
    }

    public String calculateColorCode(String ohmsValue) {
        

        String value = ohmsValue.replace(" ohms", "");

        double numericValue;
        if (value.contains("k")) {
            numericValue = Double.parseDouble(value.replace("k", "")) * 1000;
        } else if (value.contains("M")) {
            numericValue = Double.parseDouble(value.replace("M", "")) * 1000000;
        } else {
            numericValue = Double.parseDouble(value);
        }

        String strValue = String.valueOf((int)numericValue);


        char firstDigit = strValue.charAt(0);
        char secondDigit = strValue.charAt(1);
        int multiplier = strValue.length() - 2;

        if (multiplier < 0) {
            multiplier = 0;
        }

        String firstColor = colorMapping.getColor(firstDigit);
        String secondColor = colorMapping.getColor(secondDigit);
        String multiplierColor = colorMapping.getColor((char)(multiplier + '0'));

        return firstColor + " " + secondColor + " " + multiplierColor + " dourado";
    }
    
    /*
     * Objetivo: Essa classe contém a lógica principal para converter um valor de resistência em ohms na sequência de cores correspondente.
     * Atributo colorMapping: Esta variável é uma instância da classe ColorMapping, ela permite que a classe ResistorColorCode utilize o mapeamento de cores para os dígitos.
     * Construtor ResistorColorCode: Ele inicializa o atributo colorMapping quando um objeto dessa classe é criado, nesse caso vai permitir que outros métodos da classe usem colorMapping para acessar as cores.
     * Método calculateColorCode:
     * Input: Recebe uma string representando o valor do resistor, como "4.7k ohms".
     * Remoção de ohms: A string " ohms" é removida, ficando apenas o valor numérico.
     * Conversão de Valor:
     * Se o valor contém "k", ele é multiplicado por 1.000.
     * Se contém "M", é multiplicado por 1.000.000.
     * Caso contrário, ele é tratado como um valor simples.
     * Identificação dos Dígitos: O primeiro e segundo dígitos são extraídos para determinar as cores.
     * Cálculo do Multiplicador: O multiplicador é determinado pelo número de dígitos restantes após os dois primeiros.
     * Obtenção das Cores: Usando o objeto colorMapping, as cores correspondentes aos dígitos e ao multiplicador são obtidas.
     * Retorno: A função retorna a sequência de cores, adicionando a cor dourada para a tolerância.
     */
}
