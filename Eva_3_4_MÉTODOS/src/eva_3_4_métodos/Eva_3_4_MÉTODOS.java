/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_4_métodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva_3_4_MÉTODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereB
         System.out.println(encontrarMayor(8, 7));
        System.out.println(diasSemana("Inserta un numero del 1 al 7"));
        
    }
    public static int encontrarMayor(int Num1, int Num2){
        int Res;
        if(Num1 > Num2)
            Res = Num1;
        else
            Res = Num2;
        return Res;
    }
    public static String diasSemana(String Msj){
        Scanner captu = new Scanner(System.in);
        System.out.println(Msj);
        int dia = captu.nextInt();
        String Sem;
        if(dia == 1){
            Sem = "Lunes";
            return Sem;
        }else if(dia == 2){
            Sem = "Martes";
            return Sem;
        }else if(dia == 3){
            Sem = "Miercoles";
            return Sem;
        }else if(dia == 4){
            Sem = "Jueves";
            return Sem;
        }else if(dia == 5){
            Sem = "Viernes";
            return Sem;
        }else if(dia == 6){
            Sem = "Sabado";
            return Sem;
        }else if(dia == 7){
            Sem = "Domingo";
            return Sem;
        }else{
            Sem = "dia no valido";
            return Sem;
        }
    }
    
}
