
package POO.Clases;

/**
 *
 * @author Usuario
 */
public class Proveedores {
    private Integer nroRuc, tel;
    private String razonSocial, correo, repLegal;

    public Integer getNroRuc() {
        return nroRuc;
    }

    public void setNroRuc(Integer nroRuc) {
        this.nroRuc = nroRuc;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRepLegal() {
        return repLegal;
    }

    public void setRepLegal(String repLegal) {
        this.repLegal = repLegal;
    }

   public Proveedores(){
        
        System.out.println("Contructor 1");
        
    }
   
      public Proveedores(String razonSocial,Integer nroRuc,Integer tel){
        
        System.out.println("Contructor 1");
        
    }
    
    
    
    
    
    
}
