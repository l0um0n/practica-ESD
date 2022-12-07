
package POO.Clases.Herencias;

/**
 *
 * @author Usuario
 */
public class TestHerencias {
    private Barrios barrio;
    private ClaseDos dos;
    private ClaseTres tres;
    
    
    public TestHerencias(){
        barrio= new Barrios();
        barrio.setId(12);
        barrio.setDescripcion("San Roque");
        barrio.setComentario("San Roque Comentario");
        barrio.setCantidadabitantes(212);
        
       dos= new ClaseDos();
       dos.setId(2);
       
       tres= new ClaseTres();
       tres.setId(3);
        
        
        
      // System.out.println("Id: " + barrio.getId());
      //System.out.println("Descripcion: " + barrio.getDescripcion());
      // System.out.println("Comentario: " + barrio.getComentario());
      //  System.out.println("Habitantes: " + barrio.getCantidadabitantes() );
       
    }
    public static void main(String[] args) {
        new TestHerencias();
    }
    
}
