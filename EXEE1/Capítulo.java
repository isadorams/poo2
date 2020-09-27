/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1;

/**
 *
 * @author user
 */
public class Capítulo {
    private int num;
    private Livro livro;
    
    Capítulo(Livro livro,int num){
        this.livro = livro;
        this.num = num;
    }
    
     public  int getNum() {
     return this.num;
    }
    public  void  setNum ( int num ) {
      this.num = num;
    }
}
