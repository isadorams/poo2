package atividade3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class atividade3 {
    public static void main(String[] args) {
	
	Set<Integer> numeros = new HashSet<>();
           numeros.add(1);
           numeros.add(2);
           numeros.add(3);
           numeros.add(4);
           numeros.add(5);
           
    numeros.forEach(e->System.out.println(e));
     
    long qtd = numeros.stream().filter(e-> e > 0).count();
    System.out.print("Quantidade: " + qtd);

} }
