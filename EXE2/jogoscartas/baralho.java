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
import java.util.*;

public final class baralho {
  
  protected Baralho baralho;

  
  public baralho() {
   
    baralho = new Baralho();
   
    for(int valores = menorValor(); valores <= maiorValor(); valores++) {
      for(int naipes = primeiroNaipe(); naipes <= ultimoNaipe(); naipes++) {
        baralho.add(criaCarta(valores, naipes));
      }
    }
  }

  
  protected cartas criaCarta(int valores, int naipes) {
    return new cartas(valores, naipes);
  }

  
  public int menorValor() {
    return cartas.menorValor();
  }
  public int maiorValor() {
    return cartas.maiorValor();
  }
  public int primeiroNaipe() {
    return cartas.primeiroNaipe();
  }
  public int ultimoNaipe() {
    return cartas.ultimoNaipe();
  }
  public int numeroDeCartas() {
    return baralho.size();
  }
  public Iterator iterator() {
    return baralho.iterator();
  }
  
  public void embaralhar() {
    int posicao;
    for(posicao = 0; posicao < numeroDeCartas() - 1; posicao++) {
      int posAleatoria = posicao +
                         (int)((numeroDeCartas() - posicao) *
                               Math.random());
      // troca as cartas em posição e posAleatória
    cartas temp = (cartas)baralho.get(posicao);
      baralho.set(posicao, baralho.get(posAleatoria));
      baralho.set(posAleatoria, temp);
    }
  }

   
  public cartas pegaCarta() {
    if(numeroDeCartas() == 0) return null;
    return (cartas)baralho.remove(numeroDeCartas()-1);
  }
}


   
    
