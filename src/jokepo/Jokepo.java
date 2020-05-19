/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokepo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JoãoMarcus
 */
public class Jokepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] op = new String[4];
        op[0] = "Pedra";
        op[1] = "Papel";
        op[2] = "Tesoura";

        int sair = 0;
        
        

        
        
        while(sair < 9) {
            int pc = (int) (Math.random() * 3) + 1;
            
            
            System.out.println("---------------------------------------");
            System.out.println("Escolha sua jogada:");
            System.out.println("---------------------------------------");

            System.out.println("1- Pedra, 2- Papel, 3-Tesoura, 9-Sair");
            System.out.println("---------------------------------------");
            Scanner t = new Scanner(System.in);
            int opcao = t.nextInt();
            
            if(pc == 0) {
                System.out.println("O computador jogou Pedra");
            } else if( pc == 1) {
                 System.out.println("O computador jogou Papel");
            } else if( pc == 2) {
                 System.out.println("O computador jogou Tesoura");
            }
            
            if(opcao == 1) {
              // Pessoa jogou Pedra
              System.out.println("Você jogou Pedra");
              System.out.println("---------------------------------------");
              if(pc == 0) {                              
                    
                    System.out.println("Você empatou!!!");
                  
              } else if(pc == 1) {
             
                    System.out.println("Você perdeu!!!");
              } else if(pc == 2) {
        
                  System.out.println("Você ganhou!!!");
              }
     
            } else if(opcao == 2) {
               // Pessoa jogou Papel
                System.out.println("Você jogou Papel");
                System.out.println("---------------------------------------");
                if(pc == 0) {

                      System.out.println("Você ganhou!!!");
                } else if(pc == 1) {

                      System.out.println("Você empatou!!!");
                } else if(pc == 2) {

                      System.out.println("Você perdeu!!!");
                }
              
            } else if(opcao == 3) {
              // Pessoa jogou  Tesoura
              System.out.println("Você jogou Tesoura");
              System.out.println("---------------------------------------");
              if(pc == 0) {
               
                    System.out.println("Você perde!!!"); 
              } else if(pc == 1) {
           
                    System.out.println("Você ganhou!!!");
              } else if(pc == 2) {
                    
                    System.out.println("Você empata!!!"); 
              }
            } else if(opcao == 9) {
                // Sair do Sistema
                
                
                System.out.println("Saindo do Sistema....");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Fim, Obrigado por jogar!!");
                sair = opcao;
            } else {
                System.out.println("Você digitou um numero errado");
               
            }
        }
        
        
        
    }
    
}
