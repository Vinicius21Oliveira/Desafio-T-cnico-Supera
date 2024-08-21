package principal;

public class Main {

	public static void main(String[] args) {
        ResistorColorCode resistorColorCode = new ResistorColorCode();


        System.out.println(resistorColorCode.calculateColorCode("47 ohms"));       /* amarelo violeta preto dourado*/
        System.out.println(resistorColorCode.calculateColorCode("4.7k ohms"));     /* amarelo violeta vermelho dourado */
        System.out.println(resistorColorCode.calculateColorCode("1M ohms"));       /* marrom preto verde dourado */
        System.out.println(resistorColorCode.calculateColorCode("100 ohms"));      /* marrom preto marrom dourado */
        System.out.println(resistorColorCode.calculateColorCode("220 ohms"));      /* vermelho vermelho marrom dourado */
    }
	
	/*
	 * Area de teste do programa, onde os cálculos são executados e os resultados são exibidos.
	 * Instância ResistorColorCode: Um objeto ResistorColorCode é criado para chamar o método calculateColorCode.
	 * Exemplos que eu usei: Cada chamada a calculateColorCode passa um valor de resistência como string, e o resultado (sequência de cores) é impresso no console usando System.out.println.
	 * 
	 */
	
}