package cuadrado;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        cuadrado  cuad = new cuadrado();
        
        // llenado de la matriz //
        
        int tama = 10;
                
        
        String [][] cuadrado = new String[tama][tama];
        
       // se obtiene los datos de la pieza //
        pieza  figura =new pieza();
       
        figura.inicial();
       
        // llenado //
        
        cuadrado = cuad.llenadoCuadro(tama);
        
        // imprimir //
        
        cuad.imprimir(cuadrado, figura);
        
        try (Scanner scan = new Scanner(System.in)) {
            while(true){
                
                cuadrado = cuad.llenadoCuadro(tama);
                
                System.out.println("escriba la accion a ejecutar");
                        
                String accion = scan.nextLine();
                
                 // acciones //
            
            cuad.moverFicha(figura, accion);
            
            
            cuad.borradopantalla();
            
               // imprimir //
            
            cuad.imprimir(cuadrado, figura);
            
            }
        }
        
        
       
        
        
      
    }
    
}
