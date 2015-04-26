/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wshop01.diogenes_marciodiogenes_renato.zip;

import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class HashMapMain {
    
    public static void main(String[] args) {
       HashMapsLivros mapsLivros = new HashMapsLivros();
       int op=0;
       Scanner entrada=new Scanner(System.in);
       do{
            System.out.println( "----------Menu--------- ");
            System.out.println( "Digite 0 para sair ");
            System.out.println( "Digite 1 para cadastrar um novo livro ");
            System.out.println( "Digite 2 para Pesquisar um livro ");
            System.out.println( "Digite uma opção: ");
            op=entrada.nextInt();
            
            switch(op){
                case 0 :
                    System.out.println( "Opção de saida Escolhida");
                    break;
                case 1 :
                    mapsLivros.cadastrarNovoLivro();
                    break;
                case 2 :
                    mapsLivros.procurarLivro();
                    break;    
            }
            
       }while(op!=0); 
        
    }
}
