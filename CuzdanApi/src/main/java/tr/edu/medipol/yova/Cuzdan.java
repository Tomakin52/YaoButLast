package tr.edu.medipol.yova;

public class Cuzdan {
    private double bak�ye;

    public Cuzdan() {
        this.bak�ye = 0.0;
    }

    public void paraYukle(double miktar) {
        this.bak�ye += miktar;
    }

    public void paraHarca(double miktar) {
        if (this.bak�ye >= miktar) {
            this.bak�ye -= miktar;
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public double bak�yeSorgula() {
        return this.bak�ye;
    }
}
