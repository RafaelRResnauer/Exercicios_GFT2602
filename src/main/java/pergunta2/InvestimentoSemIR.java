package pergunta2;

public class InvestimentoSemIR extends Investimento{

    /* Construtor */
    public InvestimentoSemIR(float valorInicial, float jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    /* Método é sobreescrito */
    @Override
    public float calcularLucro(int meses){
        /* Verifica se o valor inicial é menor que 1000 */
        if(this.valorInicial < 1000.00f){
            System.out.println("O valor Inicial não pode ser menor que R$1000");
            return 0;
        }else{
            return (float) (this.valorInicial *Math.pow(1+this.jurosMensais,meses)-valorInicial);
        }
    }

}
