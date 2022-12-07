
package POO.Interface;

import POO.Clases.Herencias.Personas;
import java.util.List;


public interface Operaciones {
    
    public Boolean agregarRegistro();
    public Boolean modificarRegistro();
    public Boolean eliminarRegistro();
    
    public List<String> recuperarRegistros();
    public List<Personas> recuperarPersonas();
    
}
