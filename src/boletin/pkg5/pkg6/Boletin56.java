/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg6;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String tipo;
        Scanner sc = new Scanner (System.in);
        String nomArt = sc.nextLine();
        
        System.out.println("Número de ventas no ano "+ nomArt+" : ");
        int vendas = sc.nextInt();
        
        if (vendas>1000)
            tipo = "Primeira necesidade";
        else if (((vendas>500)&&(vendas>=1000)))
            tipo = "Alta Demanda";
        else
            tipo = "Baixa demanda";
        
        System.out.println("O artigo "+ nomArt +" é un artigo de "+ tipo +" porque vende "+ vendas +" unidades no ano" );
    }
    
}
