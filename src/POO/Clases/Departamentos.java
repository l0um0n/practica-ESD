
package POO.Clases;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Departamentos {
    private Integer idDep;
    private String descripcion, comentario;
    private List<Ciudades> listaciudades;

    public List<Ciudades> getListaciudades() {
        return listaciudades;
    }

    public void setListaciudades(List<Ciudades> listaciudades) {
        this.listaciudades = listaciudades;
    }


    
    

    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

  
    
}
