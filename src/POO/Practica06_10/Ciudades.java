
package POO.Practica06_10;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Ciudades extends Datos{
    private List<Barrios> barrios;

    public Ciudades(List<Barrios> barrios, Integer id, String descrip) {
        super(id, descrip);
        this.barrios = barrios;
    }


    public List<Barrios> getBarrios() {
        return barrios;
    }

    public void setBarrios(List<Barrios> barrios) {
        this.barrios = barrios;
    }

    public Ciudades() {
    }

    public Ciudades(List<Barrios> barrios) {
        this.barrios = barrios;
    }

  
    
    
    
    
    
}
