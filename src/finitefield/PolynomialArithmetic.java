package finitefield;

import java.util.ArrayList;

public class PolynomialArithmetic {

    public static Polynomial add(Polynomial a, Polynomial b, int p){
        int maxDegree = Math.max(a.getCoefficients().length, b.getCoefficients().length);
        int[] polynomial = new int[maxDegree];

        for(int i=0; i<maxDegree; i++){
            int coeffA = a.getCoefficients()[i];
            int coeffB = b.getCoefficients()[i];
            polynomial[i] = (coeffA+coeffB)%p;
            
        }

        return new Polynomial(polynomial, p);
    }

    public static Polynomial multiply(Polynomial a, Polynomial b, int p){
        int[] coeffA = a.getCoefficients();
        int[] coeffB = b.getCoefficients();
        int[] polynomial = new int[coeffA.length+coeffB.length-1];
        for(int i=0; i<a.getCoefficients().length; i++){
            for(int j=0; j<b.getCoefficients().length; j++){
                polynomial[i+j] = (polynomial[i+j]+coeffA[i]*coeffB[j])%p;
            }
        }
        return new Polynomial(polynomial, p);
    }

    public static Polynomial mod(Polynomial a, Polynomial b){
        return null;
    }
}
