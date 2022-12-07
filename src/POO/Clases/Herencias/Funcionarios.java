
package POO.Clases.Herencias;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Funcionarios extends Personas{
    private Integer nroLegajo;
    private Date fechaIngreso;
    private String cargo;

    public Integer getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(Integer nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void setNroCedula(Integer nroCedula) {
        if (nroCedula.toString().isEmpty()) {
              nroCedula=0; 
        }else {
    super.setNroCedula(nroCedula);
        }
    }

    @Override
    public void setNombres(String nombres) {
        if (nombres.isEmpty()) {
             nombres="";
        }    else { 
        super.setNombres(nombres);
        }
    }   
    

    @Override
    public void setApellidos(String apellidos) {
        if (apellidos.isEmpty()) {
             apellidos="";
        } else {
        super.setApellidos(apellidos);
    }}
    
    


}
    
    
    
    
    

