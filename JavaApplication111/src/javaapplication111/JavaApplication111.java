
package javaapplication111;

import java.util.Scanner;

/**
 *
 * @author Isai
 */
public class JavaApplication111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int respuesta,respuesta2;
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        System.out.println("-------------------Tipos de musica------------------");
        
        System.out.println("Ingresa el genero que mas te gusta de los siguientes");
        
        System.out.println("\n (1) Pop"
                + "\n (2) Regueton"
                + "\n (3) Rap");
               
        respuesta=s.nextInt();
        switch(respuesta){
            
            case(1):
                ClasePadre pop = new Pop();
                System.out.println("Tu eleccion fue el pop");
                pop.PedirRegionPop();
                pop.Operaciones();
                pop.MostrarResultados();
                
                System.out.println("Escoje de esta lista de cantantes, un artista pop: "
                        + "\n(1) Sebastian Yatra"
                        + "\n(2) Michael Jackson"
                        + "\n(3) Taylor Swift");
                respuesta2=n.nextInt();
                
                switch(respuesta2){
                    
                    case(1):
                     
                                
                                
            vistas v=new vistas();
                        System.out.println("Las canciones mas populares de Sebastian Yatra son: ");
                        System.out.println("Ojos marrones ");
                        System.out.println("Tacones rojos ");
                        System.out.println("Pareja del año ");
                        v.viisitas(576889900, 332993909, 14613507);
                     
                    case(2):
                        System.out.println("Las canciones mas populares de Michael Jackson son: ");
                        System.out.println("Billie Jean ");
                        System.out.println("Beat it ");
                        System.out.println("Chicago ");
                        
                    case(3):
                        System.out.println("Las canciones mas populares de Taylor Swift son: ");
                        System.out.println("august ");
                        System.out.println("dont Blame Me ");
                        System.out.println("Blank Space ");
                }
                
                break;
            case(2):
                ClasePadre reg = new Regueton();
                System.out.println("Tu eleccion fue el Regueton");
                reg.PedirRegionRegueton();
                reg.Operaciones();
                reg.MostrarResultados();
                break;
            case(3):
                ClasePadre rap = new Rap();
                System.out.println("Tu eleccion fue el Rap");
                rap.PedirRegionRap();
                rap.Operaciones();
                rap.MostrarResultados();
                break;
            
            default:
                System.out.println("Opcion no valida");
        }
        
    }
    
}











