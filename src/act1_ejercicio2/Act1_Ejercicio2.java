/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1_ejercicio2;
import java.util.Scanner;
/**
 *
 * @author GLORIA PAULINA MORENO SALDIVAR
 */
public class Act1_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingresa la edad para veirificar si elegible para votar");
        edad = asignar.nextInt();
        if (edad >= 18)
        {
            System.out.println("El candidato es elegible para votar");
        }
        else
        {
            System.out.println("El candidato no es elegible para votar");
        }
    }    
}
