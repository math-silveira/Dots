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
    int pontos = 0;
    String marcador;
    
    
    public Jogador(String[][] tabuleiro, String marcador){
        this.tabuleiro = tabuleiro;
        this.marcador = marcador;
    }
    
    public int[] joga(){
        Scanner ler = new Scanner(System.in);
        int[] jogada = new int[2];
        int x = ler.nextInt();
        int y = ler.nextInt();
        
        if(!tabuleiro[x][y].equals("")){
            do{
                System.out.println("Jogada nao permitida, tente novamente.");
                x = ler.nextInt();
                y = ler.nextInt();
            }while(!tabuleiro[x][y].equals(""));
        }
        if(x%2==0){
            
            tabuleiro[x][y] = "-";
        }else{
            
            tabuleiro[x][y] = "|";
            }
        
        jogada[0] = x;
        jogada[1] = y;
        return jogada;       
    }
    
    public int[] cpuJoga(String [][] tabuleiro, int pontosCpu, int pontosUser, int restam){
        int jogada[] = new int[2];
        var arvorePossibilidades = new No(tabuleiro, pontosCpu, pontosUser);
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                this.tabuleiro[i][j] = tabuleiro[i][j];
            }
        }
        
        jogada = arvorePossibilidades.possibilidades(-1, restam);
        
        //armazena a jogada escolhida pela cpu
        
        
        return jogada;
    }
    
    public boolean completou(int x, int y){
        boolean flag = false;
        
        if(x==0 && y==1){
            if(tabuleiro[1][0].equals("-")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][1].equals("-")){
                        this.pontos++;
                        tabuleiro[1][1] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==0 && y==3){
            if(tabuleiro[1][4].equals("|")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][3].equals("-")){
                        this.pontos++;
                        tabuleiro[1][3] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==1 && y==0){
            if(tabuleiro[0][1].equals("-")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][1].equals("-")){
                        this.pontos++;
                        tabuleiro[1][1] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==1 && y==2){
            if(tabuleiro[1][0].equals("|")){
                if(tabuleiro[0][1].equals("-")){
                    if(tabuleiro[2][1].equals("-")){
                        this.pontos++;
                        tabuleiro[1][1] = this.marcador;
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[1][4].equals("|")){
                if(tabuleiro[0][3].equals("-")){
                    if(tabuleiro[2][3].equals("-")){
                        this.pontos++;
                        tabuleiro[1][3] = this.marcador;
                        flag = true;
                    }
                }
            }
            
        }
        
        if(x==1 && y==4){
            if(tabuleiro[0][3].equals("-")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][3].equals("-")){
                        this.pontos++;
                        tabuleiro[1][3] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==2 && y==1){
            if(tabuleiro[1][0].equals("|")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[0][1].equals("-")){
                        this.pontos++;
                        tabuleiro[1][1] = this.marcador;
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[3][0].equals("|")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[4][1].equals("-")){
                        this.pontos++;
                        tabuleiro[3][1] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==2 && y==3){
            if(tabuleiro[1][2].equals("|")){
                if(tabuleiro[1][4].equals("|")){
                    if(tabuleiro[0][3].equals("-")){
                        this.pontos++;
                        tabuleiro[1][3] = this.marcador;
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[3][2].equals("|")){
                if(tabuleiro[3][4].equals("|")){
                    if(tabuleiro[4][3].equals("-")){
                        this.pontos++;
                        tabuleiro[3][3] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==3 && y==0){
            if(tabuleiro[4][1].equals("-")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[2][1].equals("-")){
                        this.pontos++;
                        tabuleiro[3][1] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==3 && y==2){
            if(tabuleiro[2][1].equals("-")){
                if(tabuleiro[3][0].equals("|")){
                    if(tabuleiro[4][1].equals("-")){
                        this.pontos++;
                        tabuleiro[3][1] = this.marcador;
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[2][3].equals("-")){
                if(tabuleiro[3][4].equals("|")){
                    if(tabuleiro[4][3].equals("-")){
                        this.pontos++;
                        tabuleiro[3][3] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==3 && y==4){
            if(tabuleiro[2][3].equals("-")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[4][3].equals("-")){
                        this.pontos++;
                        tabuleiro[3][3] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==4 && y==1){
            if(tabuleiro[2][1].equals("-")){
                if(tabuleiro[3][0].equals("|")){
                    if(tabuleiro[3][2].equals("|")){
                        this.pontos++;
                        tabuleiro[3][1] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        if(x==4 && y==3){
            if(tabuleiro[2][3].equals("-")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[3][4].equals("|")){
                        this.pontos++;
                        tabuleiro[3][3] = this.marcador;
                        flag = true;
                    }
                }
            }
        }
        
        return flag;
    }
}