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
public class pieza {
    
   // public Map<Integer, Integer> pos = new HashMap<Integer, Integer>();
    
    public ArrayList <Integer> filasPieza = new ArrayList <Integer>();
     public ArrayList <Integer> columnPieza = new ArrayList <Integer>();
    
    public void inicial () {
       
        
        // llenado de las filas //
         filasPieza.add(1);
         filasPieza.add(2);
         filasPieza.add(2);
         filasPieza.add(2);
         
         // llenado de las columnas //
         columnPieza.add(0);
         columnPieza.add(0);
         columnPieza.add(1);
         columnPieza.add(2);
         
    }
    
}
