
package POO.Clases.Herencias;

/**
 *
 * @author Usuario
 */
public class Barrios extends Base{
    
    private Integer cantidadabitantes;

    @Override
    public void setId(Integer id) {
        System.out.println("Id: " + id + " Barrio");        
       // super.setId(id); 
    }

    @Override
    public void setDescripcion(String descripcion) {
        super.setDescripcion(descripcion); 
    }
    
    
    

    public Integer getCantidadabitantes() {
        return cantidadabitantes;
    }

    public void setCantidadabitantes(Integer cantidadabitantes) {
        this.cantidadabitantes = cantidadabitantes;
    }
    
   
    
}
