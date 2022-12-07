/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fichero.PytyvoClase13_10;

/**
 *
 * @author Usuario
 */
public class TestPytyvo {

       private GestionPytyvo gestionptv;
    
    public TestPytyvo() {
        gestionptv= new GestionPytyvo();
        String url="C:\\ESD\\pytyvo_lista.csv";
        if (gestionptv.verificarFichero(url)) {
            gestionptv.gestionarFichero(url);
            for (Pytyvo gp : gestionptv.obtenerRegistros()) {
               System.out.println("CI:: " + gp.getCi()+ " Nombre: "  +gp.getNombreApellido() + " Departamento:" + gp.getDepartamento());
            }
        }
    }
    
    public static void main(String[] args) {
        new TestPytyvo();
    }
    
}
