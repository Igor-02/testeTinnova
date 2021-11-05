package Ex01;

    import Ex01.percentual;
    import java.util.Scanner;



public class main {
    public static void main(String[] args){
        
        float branco,nulo,valido,total,mostrar;
        Scanner ler = new Scanner(System.in);
        
        // total de votos 
        System.out.println("Informe o total de votos");
        total = ler.nextFloat();
        
        // votos validos
        System.out.println("Informe o votos validos");
        valido = ler.nextFloat();
        percentual per = new percentual();
        mostrar = per.Valido(total,valido);
        System.out.println("o percentual:"+mostrar+"%" );
        
        // votos nulos 
        System.out.println("Informe o votos nulos");
        branco = ler.nextFloat();
        mostrar = per.branco(total,branco);
        System.out.println("o percentual:"+mostrar+"%" );
        
       //votos brancos
        System.out.println("Informe o votos brancos");
        nulo = ler.nextFloat();
        mostrar = per.nulo(total,nulo);
        System.out.println("o percentual:"+mostrar+"%" );
    }
    
}
