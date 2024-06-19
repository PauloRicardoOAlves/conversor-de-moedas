public class Calculator {
    double rate;
    double qtd;
    String inputCurrency;
    String outputCurrency;

    public Calculator (double rate, double qtd, String inputCurrency, String outputCurrency){
        this.rate = rate;
        this.qtd = qtd;
        this.inputCurrency = inputCurrency;
        this.outputCurrency = outputCurrency;
    }

    public double convert() {
    return rate * qtd;
    }

    @Override
    public String toString() {
        return qtd + " em [" + inputCurrency + "] é igual a " + convert() + " em [" + outputCurrency + "]";    }

}
