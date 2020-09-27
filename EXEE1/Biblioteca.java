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
public class Biblioteca {
     private String nome;
      lista[] livros;
      
     Biblioteca(String nome){
         this.nome = nome;
     }
     
     public  String  getNome() {
     return this.nome;
    }
    public  void  setNome ( String nome ) {
      this.nome = nome;
    }
}
