package tr.edu.medipol.yova;

public class Cuzdan {
    private double bakıye;

    public Cuzdan() {
        this.bakıye = 0.0;
    }

    public void paraYukle(double miktar) {
        this.bakıye += miktar;
    }

    public void paraHarca(double miktar) {
        if (this.bakıye >= miktar) {
            this.bakıye -= miktar;
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public double bakıyeSorgula() {
        return this.bakıye;
    }
}
