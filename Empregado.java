/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma.folha;

/**
 *
 * @author cassi
 */
public abstract class Empregado {
    
    private final String name;
    
    public Empregado(String name){
        this.name = name;
    }
    
    public void printPay(){
        System.out.println(name + " " + getPay());
    }
    
    public abstract double getPay();
}
