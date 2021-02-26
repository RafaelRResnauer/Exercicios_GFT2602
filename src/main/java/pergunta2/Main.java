package pergunta2;

public class Main {
    public static void main(String[] args){
        /* Instanciamento dos onvestimentos*/
        InvestimentoComIR invComIR = new InvestimentoComIR(5000.00f, 0.012f);
        InvestimentoSemIR invSemIR = new InvestimentoSemIR(3000.00f,0.007f);

        /* Impressão na tela */
        System.out.printf("Investimento com IR: %.2f\n", invComIR.calcularLucro(17));
        System.out.printf("Investimento sem IR: %.2f\n", invSemIR.calcularLucro(10));
    }
}
