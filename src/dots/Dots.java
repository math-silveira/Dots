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
        int restam = 11;
        int pontosCpu = 0;
        int pontosUser = 0;
        System.out.print("Bem-vindo\n");
        Scanner ler = new Scanner(System.in);
        
        String[][] tabuleiro = {{"O", "-", "O", "", "O"},{"", " ", "", " ", ""}, {"O", "", "O", "", "O"}, {"", " ", "", " ", ""}, {"O", "", "O", "", "O"}};
        
        
        
        Jogador jogador1 = new Jogador(tabuleiro, "J");
        Jogador cpu = new Jogador(tabuleiro, "C");
                
        while(restam >0){
            int[] jogada;
            System.out.print("\n");
            do{
                if(restam==0)
                    break;
                for(int i=0; i<5; i++){
                    for(int j=0; j<5;j++){
                        System.out.format("%3s ", tabuleiro[i][j]);
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                System.out.println("Vez do player");
                jogada = jogador1.joga();
                if(jogador1.completou(jogada[0], jogada[1])){
                    pontosUser++;
                }
                restam--;
                
                
            }while(jogador1.completou(jogada[0], jogada[1]));
            
            System.out.print("\n");
            
            if(restam==0)
                    break;
                
            do{
                if(restam==0)
                    break;
                for(int i=0; i<5; i++){
                    for(int j=0; j<5;j++){
                        System.out.format("%3s ", tabuleiro[i][j]);
                    }
                    System.out.print("\n");
                }
                System.out.println("Vez da cpu");
                
                //por enquanto, a árvore está apenas sendo gerada.
                //jogar contra a cpu
                //jogada = cpu.cpuJoga(tabuleiro, pontosCpu, pontosUser, restam);
                
                //jogar contra outro player
                jogada = cpu.joga();
                
                if(cpu.completou(jogada[0], jogada[1])){
                    pontosCpu++;
                }
                restam--;
                
            }while(cpu.completou(jogada[0], jogada[1]));
                
                        
            
        }
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5;j++){
                System.out.format("%3s ", tabuleiro[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        if(pontosUser > pontosCpu){
            System.out.println("Player 1 wins!");
        }else if(pontosUser < pontosCpu){
            System.out.println("Cpu wins");
        }else{
            System.out.println("Empate!");
        }
    }
}