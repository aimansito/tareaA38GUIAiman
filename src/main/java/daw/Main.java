/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.IOException;
import java.util.ArrayList;
import modelos.Paciente;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Paciente> pacientes = Ficheros.leerJSON();
        System.out.println(pacientes);
    }
}
