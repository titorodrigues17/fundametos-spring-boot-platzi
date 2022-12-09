package com.fundamentos.springboot.fundamentos.componet;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplemet implements  ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola es mi primer metodo inyectando mi interfaz");
    }
}
