public class TipCalculatorRunner {
    public static void main(String[] args) {
        TipCalculator tipCalculation = new TipCalculator(405.26,35,8);

        tipCalculation.tipMultiplier();
        tipCalculation.tipTotal();
        tipCalculation.totalBill();
        tipCalculation.tipPer();
        tipCalculation.billPer();
        tipCalculation.printCalculations();
    }
}
