/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichero.ProcesoHashMap_03_11_2022;

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
public class GestionCuentasLibros implements BaseFichero{
    private File archivo;
    private FileReader permisoArvhivo;
    private BufferedReader archivoRecorrido;
    private List<CuentasLibros> listCuentasLibros;
    private String datoslibros;
    private List<String> listLibros;
    private HashMap<String, List<CuentasLibros>> datosCuentasLibrosMap;
    
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
            listCuentasLibros = new ArrayList<>();
            datosCuentasLibrosMap = new HashMap<>();
            CuentasLibros cuentaLibros;
            while ((linea = archivoRecorrido.readLine()) != null) {
                // System.out.println(linea); 
                cadena = linea.split("\\;");
               if (cadena.length ==7) {
                    cuentaLibros = new CuentasLibros();
                    cuentaLibros.setId(cadena[0]);
                    cuentaLibros.setCtactectral(cadena[1]);
                    cuentaLibros.setMedidor_nro(cadena[2]);
                    cuentaLibros.setDireccion(cadena[3]);
                    cuentaLibros.setLibro(cadena[4]);
                    cuentaLibros.setFecha(cadena[5]);
                    cuentaLibros.setDeuda(cadena[6]);
                    
                listCuentasLibros.add(cuentaLibros);
                
                  if (datosCuentasLibrosMap.containsKey(cadena[4])) {
                        datosCuentasLibrosMap.get(cadena[4]).add(cuentaLibros);
                    } else {
                        List<CuentasLibros> l = new ArrayList<>();
                        l.add(cuentaLibros);
                        datosCuentasLibrosMap.put(cadena[4], l);
                    }

                  
               }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CuentasLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CuentasLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
      public List<CuentasLibros> obtenerRegistros() {

        if ((listCuentasLibros == null) || (listCuentasLibros.isEmpty())) {
            listCuentasLibros = new ArrayList<>();
            CuentasLibros gp = new CuentasLibros();
            gp.setId("0000");
            gp.setCtactectral("DATO POR DEFECTO");
            gp.setMedidor_nro("DATO POR DEFECTO");
            gp.setDireccion("DATO POR DEFECTO");
            gp.setLibro("DATO POR DEFECTO");
            gp.setFecha("DATO POR DEFECTO");
            gp.setDeuda("DATO POR DEFECTO");
            listCuentasLibros.add(gp);
        }
        return listCuentasLibros;
    }
   public List<String> obtenerListaDepartamento() {
        datoslibros = "";
        listLibros= new ArrayList<>();
        listCuentasLibros.sort(Comparator.comparing(CuentasLibros::getLibro));
        for (CuentasLibros cuentasLibros : listCuentasLibros) {
            if ((datoslibros.isEmpty())
                    || (!datoslibros.equals(cuentasLibros.getLibro()))) {
                listLibros.add(cuentasLibros.getLibro());
            }
            datoslibros= cuentasLibros.getLibro();
        }
        return listLibros;
    }

    public HashMap<String, List<CuentasLibros>> getDatosMap() {
        return datosCuentasLibrosMap;
    }
    @Override
    public boolean cerrarFichero(String url) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
