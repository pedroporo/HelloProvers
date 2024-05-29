package org.example;

public class MyCalculator {

    public int add(int a,int b) {
        if (a<0 || b<0){
            throw new IllegalArgumentException("La suma no puede contener numeros negativos");
        }
        return a+b;
    }
    public int sub(int a,int b) {
        if (a<0 || b<0){
            throw new IllegalArgumentException("La resta no puede contener numeros negativos");
        }
        return a-b;
    }
    public int mult(int a,int b) {
        if (a<0 || b<0){
            throw new IllegalArgumentException("La multiplicacion no puede contener numeros negativos");
        }
        return a*b;
    }
    public int div(int a,int b) {
        if (a<0 || b<0){
            throw new IllegalArgumentException("La division no puede contener numeros negativos");
        }
        if (b==0){
            throw new ArithmeticException("Division Por Cero");
        }
        return a/b;
    }
}
