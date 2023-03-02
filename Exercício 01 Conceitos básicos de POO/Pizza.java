public class Pizza {
    //#region
    
    private static final  int MAX_ADCIONAIS = 8;
    private static final int VALOR_BASE = 25;
    private static final int VALOR_ADCIONAL = 4;
    private int quantidadeIngredienteAdcional;
    private String descricao;

    private void init(String descricao){
        this.descricao = descricao;
        quantidadeIngredienteAdcional = 0;
    }

    public Pizza(String descricao){
        init(descricao);
    }

    public Pizza(){
        init("Calabresa");
    }

    /**
     * Adciona ingredientes na pizza, máximo de 8 ingredientes adcionais por pizza.
     * @param quantidade de ingredientes adcionais
     * @return Um numero inteiro
     */
    public int adcionarIngredientes(int quantidade){
        if(quantidade < 0){
            quantidadeIngredienteAdcional = 0;
        }
        else if(quantidade <= MAX_ADCIONAIS){
            quantidadeIngredienteAdcional = quantidade;
        }
        return quantidadeIngredienteAdcional;
    }


    /**
     * Calcula o valor total da pizza, realiza o calculo baseado no valor base e na quantidade de ingredientes adcionais
     * @return Um numero inteiro
     */
    public int calcularValorTotal(){
        return (VALOR_ADCIONAL * quantidadeIngredienteAdcional + VALOR_BASE);
    }

    /**
     * Retorna a nota fiscal contendo a descricao e o valor total
     * @return Uma String no formato Nora Fiscal/Descricao: {descricao}/ Valor total:{valor total}
     */
    public String imprimirNotaFiscal(){
       int valorTotal = calcularValorTotal();
        String notaFiscal = "Nota Fiscal \nDescricao: "+descricao+"\nValor total: "+valorTotal;
        return notaFiscal;
    }
}