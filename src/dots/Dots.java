/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dots;

/**
 *
 * @author matri
 */

import java.util.*;

public class Dots {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int restam = 0;
        System.out.print("Bem-vindo\n");
        Scanner ler = new Scanner(System.in);
        
        String[][] tabuleiro = {{"O", "-", "O", "", "O"},{"", "O", "", "O", ""}, {"O", "", "O", "", "O"}, {"", "O", "", "O", ""}, {"O", "", "O", "", "O"}};
        
        
        
        Jogador jogador1 = new Jogador(tabuleiro, "J");
        Jogador cpu = new Jogador(tabuleiro, "C");
                
        while(restam <12){
            int[] jogada;
            System.out.print("\n");
            do{
                for(int i=0; i<5; i++){
                    for(int j=0; j<5;j++){
                        System.out.format("%3s ", tabuleiro[i][j]);
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                jogada = jogador1.joga();
            }while(jogador1.completou(jogada[0], jogada[1]));
            
            System.out.print("\n");
            
            for(int i=0; i<5; i++){
                for(int j=0; j<5;j++){
                    System.out.format("%3s ", tabuleiro[i][j]);
                }
                System.out.print("\n");
            }
                System.out.print("\n");
                
                jogador1.cpuJoga(tabuleiro);
                        
            restam++;
        }
    }
}