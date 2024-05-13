/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author aiman
 */
public class Paciente {
    private String id_paciente;
    private String nombre;
    private String fechaNacimiento;
    private String grupoSanguineo ; 
    private String rh; 
    private String numeroDonaciones; 

    public Paciente(String id_paciente, String nombre, String fechaNacimiento, String grupoSanguineo, String rh, String numeroDonaciones) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.grupoSanguineo = grupoSanguineo;
        this.rh = rh;
        this.numeroDonaciones = numeroDonaciones;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    
    public Paciente() {
    }

    
    public String getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(String id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getNumeroDonaciones() {
        return numeroDonaciones;
    }

    public void setNumeroDonaciones(String numeroDonaciones) {
        this.numeroDonaciones = numeroDonaciones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("id_paciente=").append(id_paciente);
        sb.append(", nombre=").append(nombre);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", grupoSanguineo=").append(grupoSanguineo);
        sb.append(", rh=").append(rh);
        sb.append(", numeroDonaciones=").append(numeroDonaciones);
        sb.append('}');
        return sb.toString();
    }


    
    
}
