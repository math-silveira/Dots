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
    
    public void possibilidades(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(!this.tabuleiro[i][j].equals("O")){
                    if(!this.tabuleiro[i][j].equals("|")){
                        if(!this.tabuleiro[i][j].equals("-")){
                            if(i%2==0)
                                this.tabuleiro[i][j] = "-";

                            else
                                this.tabuleiro[i][j] = "|";
                            
                            var filho = new No(this.tabuleiro);
                            for(int x=0; x<5; x++){
                                for(int y=0; y<5;y++){
                                    System.out.format("%3s ", this.tabuleiro[x][y]);
                                    
                                }
                                System.out.print("\n");
                            }
                            filho.possibilidades();
                            this.tabuleiro[i][j] = "";
                            
                            
                            
                        }
                    }
                }
            }
        }
    }   
}
