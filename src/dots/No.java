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
    String[][] tabuleiro;
    
    public No(String[][] tabuleiro){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                this.tabuleiro = tabuleiro;
            }
        }
    }
    
    public int[] possibilidades(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                //verifica se o campo está disponível para jogada.
                if(this.tabuleiro[i][j].equals("")){
                    
                    if(i%2==0)
                        this.tabuleiro[i][j] = "-";

                    else
                        this.tabuleiro[i][j] = "|";

                    var filho = new No(this.tabuleiro);
                    
                    //Se quiser visualizar a criação da árvore, descomenta os blocos de for com prints abaixo.
                    
                    /*for(int x=0; x<5; x++){
                        for(int y=0; y<5;y++){
                            System.out.format("%3s ", this.tabuleiro[x][y]);

                        }
                        System.out.print("\n");
                    }
                    System.out.println("");*/
                    
                    //cria um novo filho com a jogada efetuada
                    filho.possibilidades();
                    
                    //apaga a jogada para que o "irmão" seja criado com uma jogada diferente.
                    this.tabuleiro[i][j] = "";
                            
                            
                            
                    
                }
            }
        }
        
        
        

        //valores aleatórios apenas pra não dar erro de compilação, essa parte do código será alterada quando a IA para definição de jogada estiver pronta.
        int[] jogada = {0, 3};
        return jogada;
    }   
}
