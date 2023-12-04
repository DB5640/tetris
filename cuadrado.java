/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrado;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public  class  cuadrado {
    
    public static String blanco  = "⬜";
    public static String negro = "⬛";
    
    
    //public String [][] cuadrado;
    
    public  String [][] llenadoCuadro(int tama){
        
        
        String [][] cuadrado = new String[tama][tama];
         // filas //
        for (int i=0; i < tama; i++) {
            
            // columnas //
            for (int j=0; j < tama; j++){
                
                cuadrado[i][j] = blanco;
                
            }
        }
        
        return cuadrado;
        
    }
    
    
    public void imprimir (String [][] cuadrado, pieza  figura ) {
        
        //impriumir la matriz //
        
        int dimension = cuadrado.length;
        
        int dimensionFigura = figura.columnPieza.size();
        
        // filas //
        for (int i=0; i < dimension; i++) {
            
            // columnas //
            for (int j=0; j < dimension; j++){
                
                
                for (int k=0; k<dimensionFigura; k++ ) {
                    
                    
                    if( (figura.filasPieza.get(k) == i) && (figura.columnPieza.get(k) == j)) {
                        
                        cuadrado[i][j] = negro;
                        
                    }
                    
                }
                
                System.out.print(cuadrado[i][j]);
            }
            
            System.out.println("");
        }        
    }
    
    
    public void moverFicha (pieza  figura, String movimiento) {
        
        
        if(movimiento.equals("arriba")) {
            
            accionesMover (-1,   figura, movimiento);
       
        }
        else if (movimiento.equals("abajo")) {
            
            accionesMover (1,   figura, movimiento);
       
        }
        
    }
    
    
    public void accionesMover (int valorSubir, pieza  figura, String accion) {
        
        String arriba = "arriba";
        String abajo = "abajo";
        
              int dimensionFigura = figura.filasPieza.size(); 
             
            
             ArrayList <Integer> filasPiezaTemp =  new  ArrayList <Integer>();
             
             boolean salir = false;
             
             for (int k=0; k<dimensionFigura; k++ ) { 
                 
                 int valorFila = figura.filasPieza.get(k);
                 
                if(((figura.filasPieza.get(k) == 0) && (accion.equals(arriba))) || ((figura.filasPieza.get(k) == 9) && (accion.equals(abajo)))) {
                    
                    salir = true;
                    
                    System.out.println("pos fallo: "+ k);
                    
                    k = dimensionFigura;
                    
                    
                            
                            
                }
                else {
                  
         
                    valorFila = valorFila + valorSubir;
                    
                    
                }
                 
                filasPiezaTemp.add(valorFila);              
             }
             
              System.out.println("valor de fallo "+ salir);
             
             if(salir == false) {
                 
                 figura.filasPieza = filasPiezaTemp;
             }
             
              
             
    }
    
    public void borradopantalla() {
        
        for(int i=0; i<2; i++) {
            
            System.out.println("");
        }
    }
    
    
}
