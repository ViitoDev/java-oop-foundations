package Exercises.Class4.Exercise1;

public class CurrencyConverter implements FinancialConversion{
    @Override
    public void convertDollarReal(double dollarValue) {
        double dollarQuote = 5.19;
        double realValue = dollarValue * dollarQuote;
        System.out.println("The real value is : R$" + realValue);
    }
}
