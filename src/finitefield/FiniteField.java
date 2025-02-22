package finitefield;

public class FiniteField{
    private int p;
    private int n;
    private Polynomial irreduciblePolynomial;

    public FiniteField(int p, int n, Polynomial irrPolyirreduciblePolynomialnomial){
        this.p = p;
        this.n = n;
        this.irreduciblePolynomial = irrPolyirreduciblePolynomialnomial;
    }
    
    public FieldElement add(FieldElement a, FieldElement b){
        Polynomial sum = a.getPolynomials().add(b.getPolynomials(), p);
        return new FieldElement(sum.mod(irreduciblePolynomial), this);
    }
    
    public FieldElement multiply(FieldElement a, FieldElement b){
        Polynomial product = a.getPolynomials().multiply(b.getPolynomials(), p);
        return new FieldElement(product.mod(irreduciblePolynomial), this);
    }

    public FieldElement inverse(FieldElement a){
       return null;
    }

    public boolean isElement(FieldElement a){
        return false;
    }

    public int getP() {
        return p;
    }
}
