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
        
        String[][] tabuleiro = {{"O", "", "O", "", "O"},{"", "O", "", "O", ""}, {"O", "", "O", "", "O"}, {"", "O", "", "O", ""}, {"O", "", "O", "", "O"}};
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5;j++){
                System.out.format("%3s ", tabuleiro[i][j]);
            }
            System.out.print("\n");
        }
        
        Jogador jogador1 = new Jogador(tabuleiro);
        Jogador cpu = new Jogador(tabuleiro);
                
        while(restam <12){
            jogador1.joga(ler.nextInt(), ler.nextInt());

            for(int i=0; i<5; i++){
                for(int j=0; j<5;j++){
                    System.out.format("%3s ", tabuleiro[i][j]);
                }
                System.out.print("\n");
            }
            
            cpu.joga(ler.nextInt(), ler.nextInt());
            for(int i=0; i<5; i++){
                for(int j=0; j<5;j++){
                    System.out.format("%3s ", tabuleiro[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}