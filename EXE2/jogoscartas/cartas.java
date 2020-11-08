/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoscartas;

/**
 *
 * @author user
 */
public class cartas {
    public static final int AS = 1;
    public static final int PAUS = 1;
    public static final int OUROS= 2;
    public static final int ESPADAS = 3;
    public static final int COPAS = 4;
    public static final int VALETE = 11;
    public static final int DAMA = 12;
    public static final int REI = 13;
    private final int naipes;
    private final int valores;
    
    public cartas(int valores, int naipes) {
    this.valores =valores;
    this.naipes = naipes;
  }
    public int getNaipes() {
   return naipes;
 }
    public int getValores() {
   return valores;
 }
    public static int menorValor() {
      return AS;
  }
    public static int maiorValor() {
      return REI;
  }
    public static int primeiroNaipe() {
      return PAUS;
  }
    public static int ultimoNaipe() {
      return COPAS;
  }
 
   public int compareTo(cartas outra) {
      return getValores() - outra.getValores();
  }

  public boolean equals(Object objeto) {
      if(! (objeto instanceof cartas)) {
          return false;
      }
     cartas outra = (cartas)objeto;
      return getValores() == outra.getValores()
              && getNaipes() == outra.getNaipes();
  }

    /**
     *
     * @return
    @Override
 public String toString() {
      String v1 = "";
     /**
     try{
        
     }catch(Exception e){
         String n1 = "as"; 
     }
  **/ 
     
     protected static final String[] nomeDeCarta = {
    "","AS","DOIS","TRES","QUATRO","CINCO","SEIS","SETE","OITO","NOVE","DEZ","VALETE","DAMA","REI",};

  protected static final String[] nomeDeNaipe = {
    "PAUS","OUROS","COPAS", "ESPADAS"};
     
    @Override
     public String toString() {
    return nomeDeCarta[getValores()] + " de " + nomeDeNaipe[getNaipes()];
  }    
 }
 
