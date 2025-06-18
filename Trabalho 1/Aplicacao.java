/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package forma.folha;

/**
 *
 * @author cassi
 */
public class Aplicacao {

    public static void main(String[] args) {
        PorHora h1;
        Empregado listapag[] = new Empregado[3];
        listapag[0] = new PorComissao("Cassia");
        listapag[1] = new PorHora("Salomão",30);
        listapag[2] = new PorHoraeComissao("Estela",10,200);
        
        ((Commission) listapag[0]).setVendas(25000);
        ((Commission) listapag[2]).setVendas(10000);
        
        for(int i=0; i<listapag.length && listapag[i] != null; i++)
        {
            if(listapag[i]instanceof PorHora){
                h1=(PorHora)listapag[i];
                h1.setNumHora(200);
            }
            
            listapag[i].printPay();
        }
    }
}
