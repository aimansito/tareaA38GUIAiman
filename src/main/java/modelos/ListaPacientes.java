/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author aiman
 */
public class ListaPacientes {
    private ArrayList<Paciente> pacientes ;

    public ListaPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = new ArrayList<>();
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    public Paciente getPaciente(String id){
        System.out.println("id buscado " + id);
        // Habría que controlar que si el id no es valido, hay excepción
        return pacientes.stream().filter(p -> p.getId_paciente().equalsIgnoreCase(id)).findFirst().get();
    }
}
