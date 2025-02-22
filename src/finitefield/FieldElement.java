package finitefield;

public class FieldElement {
    private final Polynomial polynomial;
    private final FiniteField field;

    public FieldElement(Polynomial polynomial, FiniteField field){
        this.polynomial = polynomial;
        this.field = field;
    }

    public FieldElement add(FieldElement other){
        return field.add(this, other);
    }

    public FieldElement multiply(FieldElement other){
        return field.multiply(this, other);
    }
    
    public FieldElement inverse(){
        return field.inverse(this);
    }

    public Polynomial getPolynomials(){
        return polynomial;
    }

    public FiniteField getField(){
        return field;
    }

    public boolean equals(Object obj){
        return false;
    }

    public String toString(){
        return null;
    }
}
