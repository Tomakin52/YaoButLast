package tr.edu.medipol.yova;

public class Cuzdan {
    private double bakiye;

    public Cuzdan() {
        this.bakiye = 0.0;
    }

    public void paraYukle(double miktar) {
        this.bakiye += miktar;
    }

    public void paraHarca(double miktar) {
        if (this.bakiye >= miktar) {
            this.bakiye -= miktar;
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public double bakiyeSorgula() {
        return this.bakiye;
    }
}
