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
public class Autor {
    private String nome;
    private int idade;
    lista[] livro;
    
    Autor(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    
    public  String  getNome() {
     return this.nome;
    }
    public  void  setNome ( String nome ) {
      this.nome = nome;
    }
    
    public  int getIdade() {
     return this.idade;
    }
    public  void  setIdade ( int idade ) {
      this.idade = idade;
    }
}
