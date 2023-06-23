package tr.edu.medipol.yova;

public class CuzdanApi {
    private Cuzdan cuzdan;

    public CuzdanApi() {
        this.cuzdan = new Cuzdan();
    }

    public void paraYukle(double m�ktar) {
        this.cuzdan.paraYukle(m�ktar);
    }

    public void paraHarca(double m�ktar) {
        this.cuzdan.paraHarca(m�ktar);
    }

    public double bak�yeSorgula() {
        return this.cuzdan.bak�yeSorgula();
    }
}
