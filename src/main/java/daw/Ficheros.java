/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Paciente;

/**
 *
 * @author aiman
 */
public class Ficheros {
    public static ArrayList<Paciente> leerJSON() throws IOException {         
        ObjectMapper mapeador = new ObjectMapper();        
        mapeador.registerModule(new JavaTimeModule());
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes = mapeador.readValue(new File("./donantes.json"), 
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Paciente.class));     
        return pacientes;
    }
}
