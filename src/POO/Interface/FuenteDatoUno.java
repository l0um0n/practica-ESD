
package POO.Interface;

import POO.Clases.Herencias.Personas;
import java.util.ArrayList;
import java.util.List;


public class FuenteDatoUno  implements Operaciones{

    @Override
    public Boolean agregarRegistro() {
        System.out.println("conexion a base de datos MySql");  
    return true;
    }

    @Override
    public Boolean modificarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<String> recuperarRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    @Override
    public List<Personas> recuperarPersonas() {
      List<Personas> lista = new ArrayList<>();
      Personas p = new Personas();
      p.setNroCedula(4999566);
      p.setNombres("Montserrat");
      p.setApellidos("Gonzalez");
      lista.add(p);
      lista.add(new Personas(6555, "Personas 2", "Apellido2"));
      lista.add(new Personas(56564, "Personas 3", "Apellido3"));
      lista.add(new Personas(87744, "Personas 4", "Apellido4"));
      
      return lista;
    }
    
    
}
