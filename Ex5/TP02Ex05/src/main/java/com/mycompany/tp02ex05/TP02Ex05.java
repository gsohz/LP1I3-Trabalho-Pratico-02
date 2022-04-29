/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp02ex05;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class TP02Ex05 {

    /*
    5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 3, b = 2;
        int[][] mt = new int[a][b];
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.printf("Insira o número [%d][%d] da matriz: ", i, j);
                mt[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < a; ++i){
            for(int j = 0; j < b; ++j){
                System.out.print("|" + mt[i][j] + "|");
            }
            System.out.print("\n");
        }
    }
}
