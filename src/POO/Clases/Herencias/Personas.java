/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Clases.Herencias;


public class Personas {
    private Integer nroCedula;
    private String nombres;
    private String apellidos;
    private Integer nroTelefono;
    private String direccion;

   
   

    public Personas() {
    }
   
    
     public Integer getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(Integer nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
 

  
    public Integer getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(Integer nroCedula) {
        this.nroCedula = nroCedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

  

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Personas(Integer nroCedula, String nombres, String apellidos) {
        this.nroCedula = nroCedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        
    }
    
    
    
    
}
