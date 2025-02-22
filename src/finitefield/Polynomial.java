package finitefield;

public class Polynomial {
    private int[] coefficients;
    private int p;

    public Polynomial(int[] coefficients, int p){
        this.coefficients = coefficients;
        this.p = p;
    }

    public Polynomial add(Polynomial other, int p){
        return PolynomialArithmetic.add(this, other, this.p);
    }
    
    public Polynomial multiply(Polynomial other, int p){
        return PolynomialArithmetic.multiply(this, other, this.p);
    }

    public Polynomial mod(Polynomial other){
        return null;
    }

    public Polynomial gcd(Polynomial other){
        return null;
    }

    public int[] getCoefficients(){
        return coefficients;
    }

    public int getP(){
        return p;
    }
}
