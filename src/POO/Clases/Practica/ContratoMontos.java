
package POO.Clases.Practica;

import java.util.Date;

public class ContratoMontos extends ContratosPrac{
    private Integer idmontos, montoMinimo, montoMaximo;
    private Date fechaFin;

    public Integer getIdmontos() {
        return idmontos;
    }

    public void setIdmontos(Integer idmontos) {
        this.idmontos = idmontos;
    }


    public Integer getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(Integer montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public Integer getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(Integer montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
