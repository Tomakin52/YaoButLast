package tr.edu.medipol.yova;

public class CuzdanApi {
    private Cuzdan cuzdan;

    public CuzdanApi() {
        this.cuzdan = new Cuzdan();
    }

    public void paraYukle(double miktar) {
        this.cuzdan.paraYukle(miktar);
    }

    public void paraHarca(double miktar) {
        this.cuzdan.paraHarca(miktar);
    }

    public double bakiyeSorgula() {
        return this.cuzdan.bakiyeSorgula();
    }
}
