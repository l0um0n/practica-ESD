/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Test {
    private Persona persona;
    private Clientes cliente;
    private Proveedores proveedores;
    private Departamentos departamento;
    private List<Ciudades> ciudad;
    
     public Test() {
         departamento= new Departamentos();
         departamento.setIdDep(1);
         departamento.setDescripcion("Central");
         departamento.setComentario(" comentario");
            ciudad= new ArrayList<>();
            ciudad.add(new Ciudades(1, "Asuncion", ""));
            ciudad.add(new Ciudades(2, "Luque", ""));
            ciudad.add(new Ciudades(3, "San Lorenzo", ""));
         departamento.setListaciudades(ciudad);
         
         System.out.println("Id Dpto: " + departamento.getIdDep());
         System.out.println("Descrip: " + departamento.getDescripcion());
         System.out.println("Comentario: " + departamento.getComentario());
         
         for (Ciudades ciudad : departamento.getListaciudades()) {
             System.out.println("ID ciudad: " + ciudad.getIdCiud());
             System.out.println("Ciudad: " + ciudad.getDesCiud());
             System.out.println("Comentario: " + ciudad.getComCiud());
         }
     
         


       
         
         
         
         
      //test de la clase 'Persona'
      /*  persona= new Persona(4999566,"Montse ", "Gonzalez");
        persona.imprimirSexo("F");
        persona.MasaCorporal(1.77,70.0);
        persona.CalcularEdad("12/10/1999;*/
      //--------------------------------------------------
      //test de la clase 'Clientes'
     /* cliente= new Clientes();
      cliente.setNroCi(4999566);
      cliente.setNombreRazonSocial("Test Cliente");
      cliente.setTel(123);
      cliente.setDireccion("Casa");
      
      System.out.println("Nro C.I:  " + cliente.getNroCi());
      System.out.println("Nombre  " + cliente.getNombreRazonSocial());
      System.out.println("Telefono:  " + cliente.getTel());
      System.out.println("Dirección:  " + cliente.getDireccion());*/
      
      //test de la clase 'Proveedores'
      /*
     proveedores= new Proveedores();
     proveedores.setNroRuc(12345);
     proveedores.setRazonSocial("Columbia");
     proveedores.setCorreo("test@gmail.com");
     proveedores.setRepLegal("Representante Test");
     proveedores.setTel(14789);
      
      System.out.println("Nro RUC:  " + proveedores.getNroRuc());
      System.out.println("Razón Social  " + proveedores.getRazonSocial());
      System.out.println("Correo:  " + proveedores.getCorreo());
      System.out.println("Representante Legal :  " + proveedores.getRepLegal());
      System.out.println("Telefono:  " + proveedores.getTel());*/

      
      
      
    }
    public static void main(String[] args) {
        new Test();
    }
    
    
}
