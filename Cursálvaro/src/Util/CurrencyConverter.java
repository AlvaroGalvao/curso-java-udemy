package Util;

// Classe utilitária CurrencyConverter, que fornece métodos para converter valores entre diferentes moedas,
// incluindo Real, Dólar e Euro, considerando também o Imposto sobre Operações Financeiras (IOF).
public class CurrencyConverter {

    // Constante pública IOF com valor fixo de 0.06 (6%) que será aplicada em todas as conversões.
    public final static double IOF = 0.06;

    // Método estático que converte um valor em Real para Dólar.
    // Recebe o valor de 1 Real em Dólar e a quantidade de Reais a serem convertidos para Dólar.
    public static double convRealEmDolar(double valorRealPraDolar, double qtdRealPraDolar) {
        // Retorna o valor em Dólar com IOF incluído.
        return valorRealPraDolar * qtdRealPraDolar + qtdRealPraDolar * valorRealPraDolar * IOF;
    }

    // Método estático que converte um valor em Real para Euro.
    // Recebe o valor de 1 Real em Euro e a quantidade de Reais a serem convertidos para Euro.
    public static double convRealEmEuro(double valorRealPraEuro, double qtdRealPraEuro) {
        // Retorna o valor em Euro com IOF incluído.
        return valorRealPraEuro * qtdRealPraEuro + qtdRealPraEuro * valorRealPraEuro * IOF;
    }

    // Método estático que converte um valor em Dólar para Real.
    // Recebe o valor de 1 Dólar em Real e a quantidade de Dólares a serem convertidos para Reais.
    public static double convDolarEmReal(double valorDolarPraReal, double qtdDolarPraReal) {
        // Retorna o valor em Real com IOF incluído.
        return valorDolarPraReal * qtdDolarPraReal + valorDolarPraReal * qtdDolarPraReal * IOF;
    }

    // Método estático que converte um valor em Dólar para Euro.
    // Recebe o valor de 1 Dólar em Euro e a quantidade de Dólares a serem convertidos para Euros.
    public static double convDolarEmEuro(double valorDolarPraEuro, double qtdDolarPraEuro) {
        // Retorna o valor em Euro com IOF incluído.
        return valorDolarPraEuro * qtdDolarPraEuro + qtdDolarPraEuro * valorDolarPraEuro * IOF;
    }

    // Método estático que converte um valor em Euro para Real.
    // Recebe o valor de 1 Euro em Real e a quantidade de Euros a serem convertidos para Reais.
    public static double convEuroEmReal(double valorEuroPraReal, double qtdEuroPraReal) {
        // Retorna o valor em Real com IOF incluído.
        return valorEuroPraReal * qtdEuroPraReal + valorEuroPraReal * qtdEuroPraReal * IOF;
    }

    // Método estático que converte um valor em Euro para Dólar.
    // Recebe o valor de 1 Euro em Dólar e a quantidade de Euros a serem convertidos para Dólares.
    public static double convEuroEmDolar(double valorEuroPraDolar, double qtdEuroPraDolar) {
        // Retorna o valor em Dólar com IOF incluído.
        return valorEuroPraDolar * qtdEuroPraDolar + valorEuroPraDolar * qtdEuroPraDolar * IOF;
    }
}