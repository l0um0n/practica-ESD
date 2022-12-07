/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Practica06_10;

/**
 *
 * @author Usuario
 */
public class Datos {
    private Integer id;
     private String descrip, comen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getComen() {
        return comen;
    }

    public void setComen(String comen) {
        this.comen = comen;
    }

    public Datos() {
    }

    public Datos(Integer id, String descrip) {
        this.id = id;
        this.descrip = descrip;
    }
     
     
}
