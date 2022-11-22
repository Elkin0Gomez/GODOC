package com.mycompany.proyectgodoc.Modelo;


public class Contratista {
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String lugarExpedicion;
    private String valorContrato;
    private String fechaInicio;
    private String fechaFin;
    private String fechaContrato;

    public Contratista() {
    }

    public Contratista(int id, String nombre, String apellido, String cedula, String lugarExpedicion, String valorContrato, String fechaInicio, String fechaFin, String fechaContrato) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.lugarExpedicion = lugarExpedicion;
        this.valorContrato = valorContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaContrato = fechaContrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(String valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
}
