
package POO.Clases.Practica;

import java.util.Date; /// se importó para que podamos utilizar la variable tipo Date


public class Personas {
    private Integer id, nroCedula; // Cambié a de public a private para que de esta forma no cualquiera tenga acceso a los datos. Cambié de int a Integer
    private String nombre, apellido,nroTelefono; //cambié el tipo de variable de char a String. 
    private Date fechaNac;

    public Personas() {
    }

    public Personas(Integer id, Integer nroCedula, String nroTelefono, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        this.nroCedula = nroCedula;
        this.nroTelefono = nroTelefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public Integer getId() { //Se agregó
        return id;
    }

    public void setId(Integer id) { 
        this.id = id;
    }

    public Integer getNroCedula() { 
        return nroCedula;
    }

    public void setNroCedula(Integer nroCedula) { 
        this.nroCedula = nroCedula;
    }

    public String getNroTelefono() { //Se agregó
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) { //Se agregó
        this.nroTelefono = nroTelefono;
    }


    public String getNombre() {   //Se agregó
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {   //Se agregó
        this.apellido = apellido;
    }

    public Date getFechaNac() {    //Se agregó
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) { 
        this.fechaNac = fechaNac;
    }
    
    
    
}
