/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp02ex07;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TP02Ex07 {

    /*
    7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
        digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
        valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 3, b = 4, mult;
        int[][] mt = new int[a][b];
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        
        System.out.printf("\nInsira um valor multiplicador: ");
        mult = scan.nextInt();
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                mt[i][j] = mt[i][j] * mult;
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}
