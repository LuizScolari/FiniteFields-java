package finitefield;

public class FinitFieldTest {
    public static void main(String[] args) {
        // Definir o polinômio irreduzível para GF(2^2), por exemplo, x^2 + x + 1 (representado como [1, 1, 1])
        Polynomial irreducible = new Polynomial(new int[]{1, 1, 1}, 2);
        
        // Criar o campo finito GF(2^2)
        FiniteField field = new FiniteField(2, 2, irreducible);
        
        // Criar polinômios para testar
        Polynomial poly1 = new Polynomial(new int[]{1, 1}, 2); // Representa x + 1
        Polynomial poly2 = new Polynomial(new int[]{1, 0}, 2); // Representa x
        
        // Criar elementos do campo
        FieldElement element1 = new FieldElement(poly1, field);
        FieldElement element2 = new FieldElement(poly2, field);
        
        // Testar soma
        FieldElement sum = element1.add(element2);
        System.out.println("Soma: " + sum);
        
        // Testar multiplicação
        FieldElement product = element1.multiply(element2);
        System.out.println("Multiplicação: " + product);
    }
}

