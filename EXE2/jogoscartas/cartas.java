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
    public static int copas = 4;
    public static int espadas = 3;
    public static int ouros= 2;
    public static int paus = 1;
    private final int naipes;
    private final int valores;
    
 public cartas(int n, int v) {
   if (n >= paus && n <= copas)
     naipes = n;
   else
     naipes = 1;
   if (v >= 1 && n <= 13)
     valores = v;
   else
     valores = 1;
 }
 public int getNaipes() {
   return naipes;
 }
 public int getValores() {
   return valores;
 }

    /**
     *
     * @return
     */
 
    @Override
 public String toString() {
      String v1 = "";
     /**
     try{
        
     }catch(Exception e){
         String n1 = "as"; 
     }
  **/ 
   switch(valores) {
     case 1:  v1 = "às";
        break;
     case 2:  v1 = "dois";  
        break;
     case 3:  v1 = "tres";  
        break;
     case 4:  v1 = "quatro"; 
        break;
     case 5:  v1 = "cinco"; 
        break;
     case 6:  v1 = "seis";  
        break;
     case 7:  v1 = "sete";   
        break;
     case 8:  v1 = "oito";  
        break;
     case 9:  v1 = "nove";   
        break;
     case 10: v1 = "dez";    
        break;
     case 11: v1 = "valete"; 
        break;
     case 12: v1 = "dama";   
        break;
     case 13: v1 = "rei";   
        break;

  }
   switch(naipes) {
     case 1: v1 = "de paus";  
        break;
     case 2:   v1 = "de ouros"; 
        break;
     case 3: v1 = "de espadas"; 
        break;
     case 4:   v1 = "de copas";   
        break;
   }
  return v1;
 }
 }
