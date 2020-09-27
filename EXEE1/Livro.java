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
public class Livro {
    private String isbn;
    private Autor autor;
    private Biblioteca biblioteca;
    lista[] Capítulo;
    
   Livro(Biblioteca biblioteca,Autor autor,String isbn){
        this.biblioteca = biblioteca;
        this.autor = autor;
        this.isbn = isbn;
    }
    public  String getIsbn() {
     return this.isbn;
    }
    public  void  setIsbn ( String isbn ) {
      this.isbn = isbn;
    }
}
