package atividade2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class atividade2 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
    Map<String,Integer> lista = new HashMap<>();
    int cont=0;
    String nome = "";
    while(!nome.equals("*")){
        System.out.print("Informe um nome ('*' finaliza)");
        nome = sc.nextLine();

        if(nome.equals('*')) continue;
        lista.put(nome,cont++);
        System.out.print(lista);
        
        System.out.print("Informeum telefone");
        int telefone = (int) sc.nextLong(cont);
        
    } 
  
    sc.close();
        
} }
