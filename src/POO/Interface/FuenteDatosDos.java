
package POO.Interface;

import POO.Clases.Herencias.Personas;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class FuenteDatosDos implements Operaciones{

    @Override
    public Boolean agregarRegistro() {
        System.out.println("conexion a base de datos Oracle"); 
       return true;
   
    }

    @Override
    public Boolean modificarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> recuperarRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public List<Personas> recuperarPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
