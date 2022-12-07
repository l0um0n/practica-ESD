
package POO.Clases;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Clientes {
    private Integer nroCi, tel;
    private String nombreRazonSocial, direccion;
    private Ciudades ciudad;
    private List<Nacionalidades> nacionalidad;

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public List<Nacionalidades> getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(List<Nacionalidades> nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    public Clientes(){
        
        System.out.println("C1");
        
    }
    public Clientes(Integer nroCi){
        System.out.println("C2");

        
    }
    public Clientes(String nombreRazonSocial){
        System.out.println("C3");

    }
    public Clientes(Integer nroCi, String nombreRazonSocial){
         System.out.println("C4");

    }
    
    public void setNroCi(Integer nroCi){
        this.nroCi= nroCi;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }
    
    public Integer getNroCi(){
        return nroCi;
    }

    public Integer getTel() {
        return tel;
    }

    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
    
    
}
