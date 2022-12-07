
package POO.Clases;

/**
 *
 * @author Usuario
 */
public class Ciudades {
    private Integer idCiud;
    private String desCiud, comCiud;
  

    public Ciudades(){
        
    }

    public Ciudades(Integer idCiud, String desCiud, String comCiud) {
        this.idCiud = idCiud;
        this.desCiud = desCiud;
        this.comCiud = comCiud;
    
    }

    

    public Integer getIdCiud() {
        return idCiud;
    }

    public void setIdCiud(Integer idCiud) {
        this.idCiud = idCiud;
    }

    public String getDesCiud() {
        return desCiud;
    }

    public void setDesCiud(String desCiud) {
        this.desCiud = desCiud;
    }

    public String getComCiud() {
        return comCiud;
    }

    public void setComCiud(String comCiud) {
        this.comCiud = comCiud;
    }
    
    
}
