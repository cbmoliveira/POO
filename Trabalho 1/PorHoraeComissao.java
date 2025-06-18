/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma.folha;

/**
 *
 * @author cassi
 */
public final class PorHoraeComissao extends PorHora implements Commission {
    
    private double sales = 0.0;
    
    public PorHoraeComissao(){
        this("Sem nome",0.0,0,0.0);
    }
    
    public PorHoraeComissao(String name, double vhora, int nhora){
        this(name, vhora, nhora,0.0);
    }
    
    public PorHoraeComissao(String name, double vhora, int nhora, double s){
        super(name,vhora,nhora);
        setVendas(s);
    }
    
    @Override
    public void setVendas(double s){
        sales = (s<0.0)?0.0:s;
    }
    
    @Override
    public void printPay(){
        super.printPay();
        System.out.printf("Ganho por hora: %s\n",getValorHora()*getNumHora());
        System.out.printf("Ganho por Comissao: %s",COMMISSION_RATE*sales);
    }
    
    @Override
    public double getPay(){
        double pay = getValorHora()*getNumHora()+COMMISSION_RATE*sales;
        return pay;
    }
    
}
