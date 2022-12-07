
package Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GestionTXT implements BaseFichero{
    

    private File archivo;
    private FileReader permisoArvhivo;
    private BufferedReader archivoRecorrido;
    private List<Ruc> listRuc;
    private String variable;
    ///
    private List<Ruc> listActivo;
    private List<Ruc> listCancelado;
    private List<Ruc> listSusTemporal;
    private List<Ruc> listBloqueado;
    private List<Ruc> listCanceladoDefini;
    ///
    private HashMap<String,List<Ruc>> datosRucMap;
    
    @Override
    public boolean verificarFichero(String url) {
     archivo= new File(url);
     return archivo.isFile();
    }

    @Override
    public boolean gestionarFichero(String url) {
   
        try {
               archivo= new File(url);
               permisoArvhivo= new FileReader(archivo);
               archivoRecorrido= new BufferedReader(permisoArvhivo);
               String linea;
               String cadena[];
               listRuc= new ArrayList<>();
               datosRucMap= new HashMap<>();
               //
               listActivo= new ArrayList<>();
               listBloqueado= new ArrayList<>();
               listCancelado=new ArrayList<>();
               listSusTemporal= new ArrayList<>();
               listCanceladoDefini= new ArrayList<>();
               //
               Ruc ruc;
               while((linea= archivoRecorrido.readLine()) !=null){
                 //  System.out.println(linea); 
                   cadena= linea.split("\\|");
                   ruc= new Ruc();
                   ruc.setNroRuc(cadena[0]);
                   ruc.setRazonSocial(cadena[1]);
                   ruc.setDv(cadena[2]);
                   ruc.setRucAnterior(cadena[3]);
                   ruc.setEstado(cadena[4]);
                  variable=cadena[4].trim();
                 
                   switch (variable) {
                       case "ACTIVO":
                            listActivo.add(ruc);
                           break;
                         case "CANCELADO":
                            listCancelado.add(ruc);
                           break;
                           
                         case "SUSPENSION TEMPORAL":
                           listSusTemporal.add(ruc);
                           break;
                           
                         case "BLOQUEADO":
                           listBloqueado.add(ruc);
                           break;   
                          case "CANCELADO DEFINITIVO":
                           listCanceladoDefini.add(ruc);
                           break;   
                   }
              
                   listRuc.add(ruc);
                   
                 
                   
               }
         datosRucMap.put("ACTIVO", listActivo);
         datosRucMap.put("CANCELADO", listCancelado);
         datosRucMap.put("SUSPENSION TEMPORAL", listSusTemporal);
         datosRucMap.put("BLOQUEADO", listBloqueado);
         datosRucMap.put("CANCELADO DEFINITIVO", listCanceladoDefini);


        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionTXT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
        
        
        
        
        
    }
    
    
    public List<Ruc>  obtenerRegistros(){
        
       if ((listRuc==null) || (listRuc.isEmpty()) ){
            listRuc= new ArrayList<>();
            Ruc r= new Ruc();
            r.setNroRuc("0000");
            r.setRazonSocial("DATO POR DEFECTO");
            r.setDv("0");
            r.setRucAnterior("0000");
            r.setEstado("DATO POR DEFECTO");
            listRuc.add(r);
        }
        return listRuc;
        
        
    };
    
    
     public List<Ruc>  obtenerRegistrosActivos(){
          if ((listActivo==null) || (listActivo.isEmpty()) ){
            listActivo= new ArrayList<>();
            Ruc r= new Ruc();
            r.setNroRuc("0000");
            r.setRazonSocial("DATO POR DEFECTO");
            r.setDv("0");
            r.setRucAnterior("0000");
            r.setEstado("DATO POR DEFECTO");
            listActivo.add(r);
        }
        return listActivo;
     }
     
       public List<Ruc>  obtenerRegistrosCancelado(){
          if ((listCancelado==null) || (listCancelado.isEmpty()) ){
            listActivo= new ArrayList<>();
            Ruc r= new Ruc();
            r.setNroRuc("0000");
            r.setRazonSocial("DATO POR DEFECTO");
            r.setDv("0");
            r.setRucAnterior("0000");
            r.setEstado("DATO POR DEFECTO");
            listCancelado.add(r);
        }
        return listCancelado;
     }

       
       public List<Ruc>  obtenerRegistrosSuspendidos(){
          if ((listSusTemporal==null) || (listSusTemporal.isEmpty()) ){
            listSusTemporal= new ArrayList<>();
            Ruc r= new Ruc();
            r.setNroRuc("0000");
            r.setRazonSocial("DATO POR DEFECTO");
            r.setDv("0");
            r.setRucAnterior("0000");
            r.setEstado("DATO POR DEFECTO");
            listSusTemporal.add(r);
        }
        return listSusTemporal;
     }  
       
       
       public List<Ruc>  obtenerRegistrosBloqueados(){
          if ((listBloqueado==null) || (listBloqueado.isEmpty()) ){
            listBloqueado= new ArrayList<>();
            Ruc r= new Ruc();
            r.setNroRuc("0000");
            r.setRazonSocial("DATO POR DEFECTO");
            r.setDv("0");
            r.setRucAnterior("0000");
            r.setEstado("DATO POR DEFECTO");
            listBloqueado.add(r);
        }
        return listBloqueado;
     }  
       
        public List<Ruc>  obtenerRegistrosCanceladosDefinitivos(){
          if ((listCanceladoDefini==null) || (listCanceladoDefini.isEmpty()) ){
            listCanceladoDefini= new ArrayList<>();
            Ruc r= new Ruc();
            r.setNroRuc("0000");
            r.setRazonSocial("DATO POR DEFECTO");
            r.setDv("0");
            r.setRucAnterior("0000");
            r.setEstado("DATO POR DEFECTO");
            listCanceladoDefini.add(r);
        }
        return listCanceladoDefini;
     }
        
        
        public HashMap<String,List<Ruc>>  obtenerRegistrosMap(){
       
        return datosRucMap;
     }   
        
        
        
    @Override
    public boolean cerrarFichero(String url) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
