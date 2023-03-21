/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dots;

/**
 *
 * @author matri
 */
public class No {
    
    int miniMax;
    int pontosCpu;
    int pontosUser;
    int[] jogada;
    String[][] tabuleiro;
    
    public No(String[][] tabuleiro, int pontosCpu, int pontosUser, int x, int y){
        this.pontosCpu = pontosCpu;
        this.pontosUser = pontosUser;
        jogada[0] = x;
        jogada[1] = y;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                this.tabuleiro[i][j] = tabuleiro[i][j];
            }
        }
    }
    
    public No(String[][] tabuleiro, int pontosCpu, int pontosUser){
        this.pontosCpu = pontosCpu;
        this.pontosUser = pontosUser;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                this.tabuleiro[i][j] = tabuleiro[i][j];
            }
        }
    }
    
    public int[] possibilidades(int turno, int restam){
        //se o turno for -1 significa que a vez é da CPU
        --restam;
        
        if(restam==0){
            if(this.pontosCpu > this.pontosUser){
                this.miniMax = 1;
            }else if(this.pontosCpu < this.pontosUser){
                this.miniMax = -1;
            }else{
                this.miniMax = 0;
            }
            return jogada;
        }
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                //verifica se o campo está disponível para jogada.
                if(this.tabuleiro[i][j].equals("")){
                    
                    if(i%2==0)
                        this.tabuleiro[i][j] = "-";

                    else
                        this.tabuleiro[i][j] = "|";

                    var filho = new No(this.tabuleiro, this.pontosCpu, this.pontosUser, i, j);
                    
                    //Se quiser visualizar a criação da árvore, descomenta os blocos de for com prints abaixo.
                    
                    /*for(int x=0; x<5; x++){
                        for(int y=0; y<5;y++){
                            System.out.format("%3s ", this.tabuleiro[x][y]);

                        }
                        System.out.print("\n");
                    }
                    System.out.println("");*/
                    
                    
                    //cria um novo filho com a jogada efetuada
                    if(completou(i, j)){
                        filho.possibilidades(turno, restam);
                    }else{
                        filho.possibilidades(turno*-1, restam);
                    }
                    
                    //apaga a jogada para que o "irmão" seja criado com uma jogada diferente.
                    this.tabuleiro[i][j] = "";
                   
                    
                }
            }
        }
        
        
        

        //valores aleatórios apenas pra não dar erro de compilação, essa parte do código será alterada quando a IA para definição de jogada estiver pronta.
        
        return jogada;
    }
    
    public boolean completou(int x, int y){
        boolean flag = false;
        if(x==0 && y==1){
            if(tabuleiro[1][0].equals("-")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==0 && y==3){
            if(tabuleiro[1][4].equals("|")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==1 && y==0){
            if(tabuleiro[0][1].equals("-")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==1 && y==2){
            if(tabuleiro[1][0].equals("|")){
                if(tabuleiro[0][1].equals("-")){
                    if(tabuleiro[2][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[1][4].equals("|")){
                if(tabuleiro[0][3].equals("-")){
                    if(tabuleiro[2][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
            
        }
        
        if(x==1 && y==4){
            if(tabuleiro[0][3].equals("-")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[2][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==2 && y==1){
            if(tabuleiro[1][0].equals("|")){
                if(tabuleiro[1][2].equals("|")){
                    if(tabuleiro[0][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[3][0].equals("|")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[4][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==2 && y==3){
            if(tabuleiro[1][2].equals("|")){
                if(tabuleiro[1][4].equals("|")){
                    if(tabuleiro[0][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[3][2].equals("|")){
                if(tabuleiro[3][4].equals("|")){
                    if(tabuleiro[4][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==3 && y==0){
            if(tabuleiro[4][1].equals("-")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[2][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==3 && y==2){
            if(tabuleiro[2][1].equals("-")){
                if(tabuleiro[3][0].equals("|")){
                    if(tabuleiro[4][1].equals("-")){
                        
                        flag = true;
                    }
                }
            }
            
            if(tabuleiro[2][3].equals("-")){
                if(tabuleiro[3][4].equals("|")){
                    if(tabuleiro[4][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==3 && y==4){
            if(tabuleiro[2][3].equals("-")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[4][3].equals("-")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==4 && y==1){
            if(tabuleiro[2][1].equals("-")){
                if(tabuleiro[3][0].equals("|")){
                    if(tabuleiro[3][2].equals("|")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        if(x==4 && y==3){
            if(tabuleiro[2][3].equals("-")){
                if(tabuleiro[3][2].equals("|")){
                    if(tabuleiro[3][4].equals("|")){
                        
                        flag = true;
                    }
                }
            }
        }
        
        return flag;
    }
}