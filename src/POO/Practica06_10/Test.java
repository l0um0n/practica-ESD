/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Practica06_10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Test {
    private Departamentos departamento;
    private List<Ciudades> ciudades;
    private List<Barrios> barrios;
    
    
    
    public Test() {
        departamento = new Departamentos();
        departamento.setId(1);
        departamento.setDescrip("Central");
            ciudades= new ArrayList<>();
                barrios= new ArrayList<>();
                barrios.add(new Barrios(1, "San Roque"));
                barrios.add(new Barrios(2, "Trinidad"));
                barrios.add(new Barrios(3, "Obrero"));
            ciudades.add(new Ciudades (barrios,1, "Asuncion"));
                barrios.clear();
                barrios.add(new Barrios(1, "1er Barrio"));
                barrios.add(new Barrios(2, "2do Barrio"));
                barrios.add(new Barrios(3, "3er Barrio"));
            ciudades.add(new Ciudades (barrios,2, "Luque"));
        departamento.setListCiudades(ciudades);
   
        System.out.println("Id Departamento: " + departamento.getId());
        System.out.println("Descrip Departamento: " + departamento.getDescrip());
        
        for (Ciudades ciudade : departamento.getListCiudades()) {
            System.out.println("Id ciudad: "+ ciudade.getId() );
            System.out.println("Descripcion: " + ciudade.getDescrip());
            for (Barrios b : ciudade.getBarrios()) {
                System.out.println("Id barrio: "+ b.getId() );
                System.out.println("Descripcion: " + b.getDescrip());
                
            }
            
            
        }
 
}
        
     
    
    
    public static void main(String[] args) {
        new Test();
    }
}
