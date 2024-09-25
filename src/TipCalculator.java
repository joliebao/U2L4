public class TipCalculator {
    private double bill;
    private int tipPercent;
    private int numPpl;

    public TipCalculator(double bill, int tipPercent, int numPpl){
        this.bill = bill;
        this.tipPercent = tipPercent;
        this.numPpl = numPpl;
    }

    public double tipMultiplier() {
        double tipMultiplier = (double) tipPercent / 100;
        return tipMultiplier;
    }

    public double tipTotal() {
        double tipTotal = tipMultiplier() * bill;
        return tipTotal;
    }

    public double totalBill() {
        double totalBill = tipTotal() + bill;
        return totalBill;
    }

    public double tipPer() {
        double tipPer = tipTotal() / numPpl;
        return tipPer;
    }

    public double billPer() {
        double billPer = totalBill() / numPpl;
        return billPer;
    }

    public void printCalculations() {
        System.out.println();
        System.out.println("Your total tip amount is $" + tipTotal());
        System.out.println("Your total bill including tip is $" + totalBill());
        System.out.println("The tip per person is $" + tipPer());
        System.out.println("The total per person is $" + billPer());
    }
}
