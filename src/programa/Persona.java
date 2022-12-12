/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author VANIA
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private int altura;
    
    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }     
    public int getAltura() { return altura; } //Omitimos otros métodos get y set para simplificar 

        @Override
    public String toString(){ 
        return "Persona-> ID: "+idPersona+"Nombre:"+nombre+"Altura:"+altura+"\n";
    }
    
    
}
