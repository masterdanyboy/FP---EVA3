/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_6_EXAMEN_2DA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean playing  = true;
        gameStart();
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        int countWins = 0;
        int countLoses = 0;
        int countDraws = 0;
        if (userChoice == 4) {
            playing = false;
            System.out.println("Gracias por jugar");
        }
        while(playing){
            String []plays = {"Piedra","Papel","Tijera"};

            int computerChoice = (int) (Math.random() * 3) + 1;

            System.out.println("Tu eleccion: " + plays[userChoice - 1]);
            System.out.println("La eleccion de la computadora: " + plays[computerChoice - 1]);
            String result = EvalPlay(userChoice,computerChoice);
            System.out.println(result);
            if (result.equals("Ganaste")) {
                countWins++;
            }
            else if (result.equals("Perdiste")) {
                countLoses++;
            }
            else {
                countDraws++;
            }
            System.out.println("Quieres jugar de nuevo?");
            System.out.println("1.- Si");
            System.out.println("2.- No");
            int playAgain = scanner.nextInt();
            if (playAgain == 2) {
                playing = false;
                System.out.println("Gracias por jugar");
            }
            else {
                gameStart();
                userChoice = scanner.nextInt();
                while (userChoice < 1 || userChoice > 4) {
                    System.out.println("Opcion invalida, intenta de nuevo");
                    gameStart();
                    userChoice = scanner.nextInt();
                }
                if (userChoice == 4) {
                    playing = false;
                    System.out.println("Gracias por jugar");
                }
            }
        }
            System.out.println("Estadisticas:");
            System.out.println("Juegos jugados: " + (countWins + countLoses + countDraws)); ;
            System.out.println("Ganadas: " + countWins);
            System.out.println("Perdidas: " + countLoses);
            System.out.println("Empates: " + countDraws);
    }
    public  static void gameStart() {
        System.out.println("Bienvenido a piedra, papel o tijera");
        System.out.println("Elije una opcion:");
        System.out.println("1.- Piedra");
        System.out.println("2.- Papel");
        System.out.println("3.- Tijera");
        System.out.println("4.- Salir");
    }
    public static  String EvalPlay(int userChoice,int computerChoice) {
        String result = "";
        boolean win =(userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2);
        if (userChoice == computerChoice) {
            result = "Empate";
        }
        else if (win) {
            result = "Ganaste";
        }
        else {
            result = "Perdiste";
        }
        return result;
    }
}

    
    

