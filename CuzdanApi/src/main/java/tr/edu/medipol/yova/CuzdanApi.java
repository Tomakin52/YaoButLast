package tr.edu.medipol.yova;

public class CuzdanApi {
    private Cuzdan cuzdan;

    public CuzdanApi() {
        this.cuzdan = new Cuzdan();
    }

    public void paraYukle(double mýktar) {
        this.cuzdan.paraYukle(mýktar);
    }

    public void paraHarca(double mýktar) {
        this.cuzdan.paraHarca(mýktar);
    }

    public double bakýyeSorgula() {
        return this.cuzdan.bakýyeSorgula();
    }
}
