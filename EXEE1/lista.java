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
class lista {
     private String nomeObra;
    private String nomeAutor;
    private String genero;

   lista(String nomeObra,String nomeAutor,String genero){
        this.nomeObra = nomeObra;
        this.nomeAutor = nomeAutor;
        this.genero = genero;
    }
    
    
    public String toString(){
        return "Nome da Obra: " + this.nomeObra + "\n" + "Nome do autor: " + this.nomeAutor + "\n" + "Genero: " + this.genero;
       
    }
    
    public  String  getAutor() {
     return this.nomeAutor;
    }
    public  void  setNomeAutor ( String nomeAutor ) {
      this.nomeAutor = nomeAutor;
    }
    
     public  String  getNomeObra() {
     return this.nomeObra;
    }
    public  void  setNomeObra ( String nomeObra ) {
      this.nomeObra = nomeObra;
    }
    
     public  String  getGenero() {
     return this.genero;
    }
    public  void  setGenero ( String genero ) {
      this.genero = genero;
    }
    
}
