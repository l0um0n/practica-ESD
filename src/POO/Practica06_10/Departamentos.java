
package POO.Practica06_10;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Departamentos extends Datos{
    
    private List<Ciudades> listCiudades;

    public Departamentos() {
    }

    public Departamentos(List<Ciudades> listCiudades, Integer id, String descrip) {
        super(id, descrip);
        this.listCiudades = listCiudades;
    }

    public List<Ciudades> getListCiudades() {
        return listCiudades;
    }

    public void setListCiudades(List<Ciudades> listCiudades) {
        this.listCiudades = listCiudades;
    }

   

    
     
}
