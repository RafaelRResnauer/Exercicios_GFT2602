package pergunta1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Scanner para pegar a entrada
        int entrada; // Valor para guardar a entrada
        int soma = 0; // Valor para guardar a soma
        boolean loop = true; // Variavel para controlar loop

        while(loop) {
            /* Pega a entrada */
            System.out.print("Digite um número:");
            entrada = sc.nextInt();

            /* Verifica se a entrada é positiva*/
            if(entrada >= 0){
                soma += entrada;
            }else{
                System.out.println("Números negativos não são permitidos");
            }

            /* Verifica se a soma já superou 300 */
            if(soma >= 300){
                System.out.println("O Somatório foi " + soma);
                loop = false;
            }
        }
    }
}
