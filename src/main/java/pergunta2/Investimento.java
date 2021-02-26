package pergunta2;

/* A classe não é instânciada */
public abstract class Investimento {
    protected float valorInicial;
    protected float jurosMensais;

    /* Construtor de Investimento*/
    public Investimento(float valorInicial, float jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;

    }

    /* Retorna lucro */
    public float calcularLucro(int meses){
        return (float) (this.valorInicial *Math.pow(1+this.jurosMensais,meses)-valorInicial);
    }
}
