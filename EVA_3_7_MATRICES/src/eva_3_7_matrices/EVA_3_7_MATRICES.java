/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_7_matrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_3_7_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //bienvenido al juego de tictac toe
        System.out.println("Bienvenido al juego de tictac toe");
        //creamos un tablero de 3x3
        char[][] board = new char[3][3];

        //inicializamos el tablero
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        //creamos un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        //creamos un booleano para saber si el juego ha terminado
        boolean gameEnded = false;
        //creamos un char para saber el jugador actual
        char currentPlayer = 'X';
        //mientras el juego no haya terminado
        while(!gameEnded){
            //imprimimos el tablero
            printBoard(board);
            //pedimos la fila y columna al usuario
            System.out.println("Jugador "+currentPlayer+" es tu turno");
            System.out.println("Ingresa la fila (0, 1, 2)");
            int row = scanner.nextInt();
            System.out.println("Ingresa la columna (0, 1, 2)");
            int col = scanner.nextInt();
            //validamos que la fila y columna sean validas
            if(row<0 || row>=3 || col<0 || col>=3){
                System.out.println("Movimiento invalido, intenta de nuevo");
                continue;
            }
            //validamos que la casilla este vacia
            if(board[row][col]!=' '){
                System.out.println("La casilla ya esta ocupada, intenta de nuevo");
                continue;
            }
            //hacemos el movimiento
            board[row][col] = currentPlayer;
            //verificamos si el jugador actual ha ganado
            if(checkWinner(board, currentPlayer)){
                System.out.println("Jugador "+currentPlayer+" ha ganado!");
                printBoard(board);
                gameEnded = true;
            }
            //verificamos si el tablero esta lleno
            if(isBoardFull(board)){
                System.out.println("El juego ha terminado en empate!");
                gameEnded = true;
            }
            //cambiamos de jugador
            currentPlayer = (currentPlayer=='X' ? 'O' : 'X');
        }
    }
    private static void printBoard(char[][] board){
        for (int i = 0; i < 3; i++) {
            System.out.println(" "+board[i][0]+" | "+board[i][1]+" | "+board[i][2]);
        }
    }
    private  static  boolean isBoardFull(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==' ') return false;
            }
        }
        return true;
    }
    private static boolean checkWinner(char[][] board, char currentPlayer){
        for (int i = 0; i < 3; i++) {
            //verificamos si hay un ganador en las filas o columnas
            if(board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer){
                return true;
            }
            if(board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer){
                return true;
            }
        }
        //verificamos si hay un ganador en las diagonales
        return (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)|| (board[0][0]==currentPlayer && board[1][1]==currentPlayer && board[2][2]==currentPlayer);
    }
}
            
        
    
    

