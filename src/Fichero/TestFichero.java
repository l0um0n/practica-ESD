/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fichero;

/**
 *
 * @author Usuario
 */
public class TestFichero {
    
    private GestionTXT gestion;
    
    public TestFichero() {
        gestion= new GestionTXT();
        String url="C:\\ESD\\ruc0.txt";
        if (gestion.verificarFichero(url)) {
            gestion.gestionarFichero(url);
            for (Ruc r : gestion.obtenerRegistros()) {
                System.out.println("Estado: "  +r.getEstado());
            }
        }
    }

    
    
    public static void main(String[] args) {
        new TestFichero();
    }
    
}
