package pergunta3;

public class InvestimentoComIR extends Investimento {
    /* Construtor */
    public InvestimentoComIR(float valorInicial, float jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    /* Método é sobreescrito */
    @Override
    public float calcularLucro(int meses){
        float desconto;// Variavel para desconto
        /* Cadeia de condicinais para decidir o desconto */
        if (meses < 6){
            desconto = 0.225f;
        }else if(meses < 12){
            desconto = 0.20f;
        }else if(meses < 24){
            desconto = 0.175f;
        }else {
            desconto = 0.15f;
        }
        /* Calculo do lucro original */
        float lucro = (float) (this.valorInicial *Math.pow(1+this.jurosMensais,meses)-valorInicial);
        return lucro*(1-desconto); // Retorna lucro com desconto
    }
}
