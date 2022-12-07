
package POO.Clases.Herencias;


public class Clientes  extends Personas{
    private Integer nroRUC;
    private Integer DV;
    private String razonSocial;

    public Integer getNroRUC() {
        return nroRUC;
    }

    public void setNroRUC(Integer nroRUC) {
        this.nroRUC = nroRUC;
    }

    public Integer getDV() {
        return DV;
    }

    public void setDV(Integer DV) {
        this.DV = DV;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public void setNroTelefono(Integer nroTelefono) {
       if (nroTelefono.toString().isEmpty()) {
            nroTelefono=000;
        }  else {
            super.setNroTelefono(nroTelefono);
        }
           
}

    @Override
    public void setDireccion(String direccion) {
        if (direccion.isEmpty()) {
            direccion="-";
        } else {
            super.setDireccion(direccion);
        }
    }
    
    
            
    
    
            
            
    
    
    
    
}
