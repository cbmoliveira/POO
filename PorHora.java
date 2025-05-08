/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma.folha;

/**
 *
 * @author cassi
 */
public class PorHora extends Empregado {
    
    private double valorHora = 0.0;
    private int numHora=0;
    
    public PorHora(){
        this("Sem nome",0.0,0);
    }
    
    public PorHora(String name, double vhora){
        this(name,vhora,0);
    }
    
    public PorHora(String name, double vhora, int nhora){
        super(name);
        setValorHora(vhora);
        setNumHora(nhora);
    }
    
    public void setValorHora(double vhora){
        this.valorHora = (vhora<0.0)?0.0:vhora;
    }
    
    public void setNumHora(int nhora){
        this.numHora = (nhora<0)?0:nhora;
    }
    
    public double getValorHora(){
        return valorHora;
    }
    
    public int getNumHora(){
        return numHora;
    }
    
    @Override
    public double getPay(){
        double pay = valorHora*numHora;
        return pay;
    }
}
