/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author DELL
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "Pablo";
        String apellido = "Costa";
        String identificacion = "1150146163";
        int edad = 19;
        EstudiantePresencial esp1 = new EstudiantePresencial(
                nombre, apellido, identificacion, edad);

        esp1.establecerNumeroCreditos(5);
        esp1.establecerCostoCredito(50.5);
        esp1.calcularMatriculaPresencial();
        System.out.println(esp1);
    }

}
