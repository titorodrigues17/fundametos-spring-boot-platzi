package com.fundamentos.springboot.fundamentos.Bean;

public class MyBennImplemet implements MyBean{
    @Override
    public void print() {
       System.out.println("Hola desde mi implemenacion propia del bean");
    }
}
