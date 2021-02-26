package pergunta3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner para pegar entrada
        /* Pega o valor inicial */
        System.out.print("Digite o valor inicial:");
        float entrada = sc.nextFloat();

        /* Cria os investimentos */
        InvestimentoComIR invComIR = new InvestimentoComIR(entrada, 0.0035f);
        InvestimentoSemIR invSemIR = new InvestimentoSemIR(entrada,0.003f);

        /* For loop para impressão mensal */
        for(int mes = 1; mes <= 36;mes++){
            System.out.printf("Mês: %d | Investimento sem IR: %.2f | Investimento com IR: %.2f\n",mes, invSemIR.calcularLucro(mes),invComIR.calcularLucro(mes));
        }
    }
}
