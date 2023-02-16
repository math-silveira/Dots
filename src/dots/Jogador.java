/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dots;

/**
 *
 * @author matri
 */
import java.util.*;

public class Jogador {
    Scanner ler = new Scanner(System.in);
    String[][] tabuleiro;
    
    public Jogador(String[][] tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    
    public void joga(int x, int y){
        
        if(!tabuleiro[x][y].equals("")){
            do{
                System.out.println("Jogada nao permitida, tente novamente.");
                x = ler.nextInt();
                y = ler.nextInt();
            }while(!tabuleiro[x][y].equals(""));
        }
        if(x%2==0)
                tabuleiro[x][y] = "-";
        else
            tabuleiro[x][y] = "|";
    }
}