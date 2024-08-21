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
}