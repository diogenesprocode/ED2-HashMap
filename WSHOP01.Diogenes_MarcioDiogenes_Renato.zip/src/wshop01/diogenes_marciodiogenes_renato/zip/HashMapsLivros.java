/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wshop01.diogenes_marciodiogenes_renato.zip;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Marcio
 */
public class HashMapsLivros {
    private HashMap<Integer, Livro> mapeamentoDeLivros; 
    Scanner entrada=new Scanner(System.in);
    public HashMapsLivros(){ 
        mapeamentoDeLivros = new HashMap<Integer, Livro>(); 
    }
    public void cadastrarNovoLivro(){  
        
         
        
        Livro livro = new Livro();
        System.out.println( "Digite os dados do novo livro: ");
        System.out.println( "Numero ISBN: ");
        livro.setIsbn(entrada.nextInt());
        if(mapeamentoDeLivros.containsKey(livro.getIsbn())){
            System.out.println("Erro: Numero ISBN Não encontrado!");   
        }else{
            System.out.println( "Titulo :");
            livro.setTitulo(entrada.next());
            System.out.println( "Autor :");
            livro.setAutor(entrada.next());
            System.out.println( "Ano :");
            livro.setAno(entrada.nextInt());
            mapeamentoDeLivros.put(livro.getIsbn(), livro);  
        }      
    }     
  
    public void procurarLivro() {
        System.out.println("Digite um ISBN para pesquisa:");
        int valorPsquisa = entrada.nextInt();
 
        try {  
             
            if( !mapeamentoDeLivros.containsKey(valorPsquisa) )  
                throw new Exception();  
              
            System.out.println( "ISBN:   "+ mapeamentoDeLivros.get(valorPsquisa).getIsbn());  
            System.out.println( "Titulo: "+ mapeamentoDeLivros.get(valorPsquisa).getTitulo());  
            System.out.println( "Autor:  "+ mapeamentoDeLivros.get(valorPsquisa).getAutor());  
            System.out.println( "Ano:    "+ mapeamentoDeLivros.get(valorPsquisa).getAno());  
        }  
        catch( Exception e){  
            System.out.println("Erro: Numero ISBN Não encontrado!");         
        }  
      
    }//fim do metodo entradaDoUsuario 
}
