package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

import Electrodomesticos.Electrodomestico;
import Electrodomesticos.Lavadora;
import Electrodomesticos.Television;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x=new Scanner(System.in);
        
        System.out.println("ingrese los datos:");
        System.out.println("Electrodomestico");
        System.out.println("codigo: ");
        int codigo=x.nextInt();
        System.out.println("descripcion: ");
        String descripcion=x.next();
        System.out.println("precio Base: ");
        double Precio=x.nextDouble();
        System.out.println("color: ");
        String color=x.next();
        System.out.println("consumo: ");
        char consumo=x.next().charAt(0);
        System.out.println("peso: ");
        int peso=x.nextInt();
        
        
    }
    
}
