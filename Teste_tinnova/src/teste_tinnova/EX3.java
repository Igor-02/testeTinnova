package teste_tinnova;

import  java.util.Scanner ;

public class EX3 {
    
    
    public  static  void  main ( String [] args ) {
      Scanner ent = new Scanner(System.in);
      int num  , fat =  1 ;
      int cont =  1 ;
      
      do{
          System.out.println("digite um numero");
          num = ent.nextInt();
          
          for(int i = 1;i <= num; i++){
              fat = fat * i;
          }
          
          System.out.println("!" + num + " = "  + fat);
          cont++;
          
      }while(cont < 2);
      
    }
      
      
}

