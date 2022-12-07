
package POO.Interface;

import POO.Clases.Herencias.Personas;
import java.util.List;

public class Test {
private Operaciones op;
    
    public Test(Integer bandera) {
        switch (bandera) {
            case 1:
                op= new FuenteDatoUno();
                break;
            case 2:
                op= new FuenteDatosDos();
                break;
            default:
                System.out.println("Valor no reconocido");
        }
         List<Personas> lista = op.recuperarPersonas();
         for (Personas p : lista) {
             System.out.println("C.I: " + p.getNroCedula());
             System.out.println("Nombre: "+ p.getNombres());
            
        }
                 
    }
    
    
    public static void main(String[] args) {
        new Test(1);
        
        
    }
    
}
