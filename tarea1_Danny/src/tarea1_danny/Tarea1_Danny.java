/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_danny;

/**
 *
 * @author Usuario
 */
public class Tarea1_Danny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumatoriaDiagonal1 = 0;
        int sumatoriaDiagonal2 = 0;

        int [][] matriz = new int [3][3];
       
        for (int f = 0; f <3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz [0][0] = 12;
                matriz [0][1] = 13;
                matriz [0][2] = 14;
                
                matriz [1][0] = 22;
                matriz [1][1] = 23;
                matriz [1][2] = 24;
                
                matriz [2][0] = 32;
                matriz [2][1] = 33;
                matriz [2][2] = 34;         
                System.out.print(matriz[f][c]+"  ");    
                
                sumatoriaDiagonal1 = matriz[0][0];
                sumatoriaDiagonal1 += matriz[1][1];
                sumatoriaDiagonal1 += matriz[2][2];
                
                sumatoriaDiagonal2 = matriz[0][2];
                sumatoriaDiagonal2 += matriz[1][1];
                sumatoriaDiagonal2 += matriz[2][0];

            }
            System.out.println("");        
        }
        System.out.println("La sumatoria de la diagonal de IZQUIERDA a DERECHA es de:"+sumatoriaDiagonal2);
        System.out.println("La sumatoria de la diagonal de DERECHA a IZQUIERDA es de:"+sumatoriaDiagonal1);
        
    }
    
}
