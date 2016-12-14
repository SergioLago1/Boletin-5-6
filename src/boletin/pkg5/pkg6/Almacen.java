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
public class Almacen {
 private String tipo,nomArt;
    private Scanner sc = new Scanner (System.in);
    private int vendas;
    
    public Almacen(){
        
    }
    
    public void ventas(){
        System.out.println("Introducir o nome do articulo deseado - ");
        nomArt = sc.nextLine();
        
        System.out.println("Numero de ventas no ano do articulo "+ nomArt +" - ");
        vendas = sc.nextInt();
        
        if (vendas>1000)
            tipo= "Primeira necesidade";
        else if (((vendas>500)&&vendas<=500))
            tipo = "Alta demanda";
        else if ((vendas>100)&&(vendas<=500))
            tipo = "Media demanda";
        else
            tipo = "Baixa demanda";
        
        System.out.println("O artigo "+ nomArt +" é un artigo de "+ tipo +" porque vende "+ vendas +" unidades no ano ");
       
    }
    
}   

