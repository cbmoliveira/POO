/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma.folha;

/**
 *
 * @author cassi
 */
public class PorComissao extends Empregado implements Commission {
    
    private double sales = 0.0;
    
    public PorComissao(){
        this("Sem nome", 0.0);
    }
    
    public PorComissao(String name){
        this(name, 0.0);
    }
    
    public PorComissao(String name, double sales){
        super(name);
        setVendas(sales);
    }
    
      
    @Override
    public void setVendas(double sales) {
        this.sales=(sales<0)?0.0:sales;
    }
    
    @Override
    public double getPay(){
        double pay = COMMISSION_RATE*sales;
        return pay;
    }

    
    
}
