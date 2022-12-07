
package POO.Clases.Herencias;


public class Base {
    private Integer id;
    private String descripcion, comentario;
    
    public Base(){

    }
    public Base(Integer id, String descripcion){
        this.id= id;
        this.descripcion= descripcion;
    }

    
    
    
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
       System.out.println("Imprime desde la Base: " +  id );
        this.id = id;
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

