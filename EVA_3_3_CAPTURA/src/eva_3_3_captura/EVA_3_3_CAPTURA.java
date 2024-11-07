/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String Nom = capturarTexto("Cual es tu nombre?: ");
        String Ape = capturarTexto("Cual es tu apellido?: ");
        int Edad = edad("Cual es tu edad: ");
        double Sala = salario("cual es tu salario?: ");
        System.out.println("Nombre: "+Nom);
        System.out.println("Apellido: "+Ape);
        System.out.println("Edad: "+Edad);
        System.out.println("Salario: "+Sala);
        
        
    }
    public static String capturarTexto(String Msj){
        Scanner captu = new Scanner(System.in);
        System.out.println(Msj);
        String Text = captu.nextLine();
        return Text;
        
    }
    public static int edad(String Msj){
        Scanner captu = new Scanner(System.in);
        System.out.println(Msj);
        int Ed = captu.nextInt();
        return Ed;
    }  
    public static double salario(String Msj){
        Scanner captu = new Scanner(System.in);
        System.out.println(Msj);
        double Sal = captu.nextDouble();
        return Sal;
    }
    
}
