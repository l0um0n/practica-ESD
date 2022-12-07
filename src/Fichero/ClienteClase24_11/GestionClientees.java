/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichero.ClienteClase24_11;

import Fichero.BaseFichero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GestionClientees implements BaseFichero{
    
    private File archivo;
    private FileReader permisoArvhivo;
    private BufferedReader archivoRecorrido;
    private List<Clientees> listClientees;
    private String datosClientees;
    private List<String> listReg;
    private HashMap<String, List<Clientees>> datosMapClientees;

    @Override
    public boolean verificarFichero(String url) {
       archivo = new File(url);
        return archivo.isFile();
    }

    @Override
    public boolean gestionarFichero(String url) {
        try {
            archivo = new File(url);
            permisoArvhivo = new FileReader(archivo);
            archivoRecorrido = new BufferedReader(permisoArvhivo);
            String linea;
            String cadena[];
            listClientees = new ArrayList<>();
            datosMapClientees = new HashMap<>();
            Clientees clientees;
            while ((linea = archivoRecorrido.readLine()) != null) {
                 //System.out.println(linea); 
                cadena = linea.split("\\|");
               if (cadena.length ==4) {
                    clientees = new Clientees();
                    clientees.setRegion(cadena[0]);
                    clientees.setCtactral(cadena[1]);
                    clientees.setDescrip(cadena[2]);
                    clientees.setRegion(cadena[3]);
                    
                listClientees.add(clientees);
                
                
                  if (datosMapClientees.containsKey(cadena[0])) {
                        datosMapClientees.get(cadena[0]).add(clientees);
                    } else {
                        List<Clientees> l = new ArrayList<>();
                        l.add(clientees);
                        datosMapClientees.put(cadena[0], l);
                    }
                  
                  

                  
               }

            }
            
            
            System.out.println(datosMapClientees.size());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clientees.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Clientees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
    @Override
    public boolean cerrarFichero(String url) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public List<Clientees> obtenerRegistros() {

        if ((listClientees == null) || (listClientees.isEmpty())) {
            listClientees = new ArrayList<>();
            Clientees gp = new Clientees();
            gp.setRegion("DATO POR DEFECTO");
            gp.setCtactral("DATO POR DEFECTO");
            gp.setDescrip("DATO POR DEFECTO");
            gp.setCod("DATO POR DEFECTO");
            listClientees.add(gp);
        }
        return listClientees;
    }
   public List<String> obtenerListaRegion() {
        datosClientees = "";
        listReg= new ArrayList<>();
        listClientees.sort(Comparator.comparing(Clientees::getRegion));
        for (Clientees clientees : listClientees) {
            if ((datosClientees.isEmpty())
                    || (!datosClientees.equals(clientees.getRegion()))) {
                listReg.add(clientees.getRegion());
            }
            datosClientees= clientees.getRegion();
        }
        return listReg;
    }

    public HashMap<String, List<Clientees>> getDatosMap() {
        return datosMapClientees;
    }
    
    
    
}
