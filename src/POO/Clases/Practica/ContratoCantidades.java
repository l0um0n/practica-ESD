
package POO.Clases.Practica;

import java.util.Date;


public class ContratoCantidades extends ContratosPrac{
    private Integer idcantidades, cantMinima, cantMaxima;
    private Date fechaFin;

    public Integer getIdcantidades() {
        return idcantidades;
    }

    public void setIdcantidades(Integer idcantidades) {
        this.idcantidades = idcantidades;
    }
    

    public Integer getCantMinima() {
        return cantMinima;
    }

    public void setCantMinima(Integer cantMinima) {
        this.cantMinima = cantMinima;
    }

    public Integer getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Integer cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
