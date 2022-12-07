/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fichero.PytyvoClase13_10;

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

public class GestionPytyvo implements BaseFichero {

    private File archivo;
    private FileReader permisoArvhivo;
    private BufferedReader archivoRecorrido;
    private List<Pytyvo> listPytyvo;
    private String datosDepartamentos;
    private List<String> listDepartamento;
    private HashMap<String, List<Pytyvo>> datosPytyvoMap;

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
            listPytyvo = new ArrayList<>();
            datosPytyvoMap = new HashMap<>();
            Pytyvo pytyvo;
            while ((linea = archivoRecorrido.readLine()) != null) {
                //  System.out.println(linea); 
                cadena = linea.split("\\;");
               if (cadena.length == 4) {
                    pytyvo = new Pytyvo();
                    pytyvo.setCi(cadena[0]);
                    pytyvo.setNombreApellido(cadena[1]);
                    pytyvo.setDepartamento(cadena[2]);
                    pytyvo.setDistrito(cadena[3]);
                listPytyvo.add(pytyvo);
                
                  if (datosPytyvoMap.containsKey(cadena[2])) {
                        datosPytyvoMap.get(cadena[2]).add(pytyvo);
                    } else {
                        List<Pytyvo> l = new ArrayList<>();
                        l.add(pytyvo);
                        datosPytyvoMap.put(cadena[2], l);
                    }

                  
               }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionPytyvo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionPytyvo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public List<Pytyvo> obtenerRegistros() {

        if ((listPytyvo == null) || (listPytyvo.isEmpty())) {
            listPytyvo = new ArrayList<>();
            Pytyvo gp = new Pytyvo();
            gp.setCi("0000");
            gp.setNombreApellido("DATO POR DEFECTO");
            gp.setDepartamento("DATO POR DEFECTO");
            gp.setDistrito("DATO POR DEFECTO");
            listPytyvo.add(gp);
        }
        return listPytyvo;
    }
//lista departamento

    public List<String> obtenerListaDepartamento() {
        datosDepartamentos = "";
        listDepartamento = new ArrayList<>();
        listPytyvo.sort(Comparator.comparing(Pytyvo::getDepartamento));
        for (Pytyvo pytyvo : listPytyvo) {
            if ((datosDepartamentos.isEmpty())
                    || (!datosDepartamentos.equals(pytyvo.getDepartamento()))) {
                listDepartamento.add(pytyvo.getDepartamento());
            }
            datosDepartamentos = pytyvo.getDepartamento();
        }
        return listDepartamento;
    }

    public HashMap<String, List<Pytyvo>> getDatosMap() {
        return datosPytyvoMap;
    }

    @Override
    public boolean cerrarFichero(String url) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
