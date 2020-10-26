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
public class baralho {
     private final cartas monte[];
     private int topo;
     public baralho() {
        monte = new cartas[52];
        topo = 0;
   for (int n=1; n<5; n++)
     for (int v=1; v<14; v++) {
       monte[topo++] = new cartas(n, v);
     }
 }
 public boolean temCarta() {
   return topo > 0;
 }
 public cartas darCarta() {
   cartas n1 = null;
   if (topo > 0)
     n1 = monte[--topo];
   return n1;
 }
 public void embaralhar() {
   for(int c=0; c<52; c++) {
     int i = (int) Math.round(Math.random()*51);
     cartas tmp = monte[i];
     monte[i] = monte[c];
     monte[c] = tmp;
   }
 }

}
