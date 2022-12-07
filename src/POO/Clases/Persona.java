/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Clases;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private Integer cedula, tel;
    private String nombre,apellido,sexo="F";
    private Date fechaNa;
    private Double peso,altu, IMC;
    private Ciudades ciudad;
    private List<Nacionalidades> nacionalidad;
    
    
    public Persona(){
    
    }   

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    public List<Nacionalidades> getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(List<Nacionalidades> nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    public Persona(Integer cedula, String nombre, String apellido ){
        System.out.println("Nombre: "+ nombre + "Apellido:  " + apellido +" " +"Cedula: " +cedula );

    
    }   

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNa() {
        return fechaNa;
    }

    public void setFechaNa(Date fechaNa) {
        this.fechaNa = fechaNa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltu() {
        return altu;
    }

    public void setAltu(Double altu) {
        this.altu = altu;
    }
    
    public Double getIMC() {
        return IMC;
    }

    public void setIMC(Double IMC) {
        this.IMC = IMC;
    }

   public void imprimirSexo(String sexo){
       
        if (sexo=="F") {
            System.out.println("Su sexo es Femenino");
           
       } else {
            System.out.println("Su sexo es Masculino");

       }

    }
   public void CalcularEdad(String fechaNa){
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate fechaNac = LocalDate.parse(fechaNa, fmt);
       LocalDate ahora = LocalDate.now();
       
       Period periodo = Period.between(fechaNac, ahora);
       System.out.printf("Tu edad es: %s años, %s meses y %s días",
       periodo.getYears(), periodo.getMonths(), periodo.getDays());
   }
   
    public void MasaCorporal(Double altu, Double peso){
        IMC=(peso/(altu*altu));
        System.out.println("Su IMC es: " + IMC);
        if (IMC>30){
            System.out.println("Usted es obeso");
        }
         else if (IMC>25 && IMC<30){
           System.out.println("Usted tiene Sobrepeso");

           }
          else if (IMC>18.5 && IMC<25){
           System.out.println("IMC Normal");

           }
            else {
             System.out.println("Bajo Peso");

         }
    }

 
    
}
