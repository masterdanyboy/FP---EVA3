/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_5_métodos_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA_3_5_MÉTODOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 String DiaSema[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        imprimirArreglo(DiaSema);
        String Mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        imprimirArreglo(Mes);
        int Bille[] = {20, 50, 100, 200, 500, 1000};
        imprimirEntero(Bille);
    }
    public static void imprimirArreglo(String[] Arreg){
        for(int i = 0; i < Arreg.length; i++){
            System.out.println(Arreg[i]);
            
        }
     
    }
    public static void imprimirEntero(int[] Billete){
        for(int i = 0; i < Billete.length; i++){
            System.out.println(Billete[i]);
        }
    }
}