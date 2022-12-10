package com.fundamentos.springboot.fundamentos.Bean;

public class MyBEanWithDependencyImplement implements  MyBEanWithDependency{
    private MyOperation myOperation;

    public MyBEanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWhithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion de un bean con dependencia.");
    }
}
