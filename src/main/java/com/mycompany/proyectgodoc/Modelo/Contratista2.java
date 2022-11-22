/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectgodoc.Modelo;

/**
 *
 * @author USUARIO
 */
public class Contratista2 {
    private int  id;
    private String nombre2;
    private String apellido2;
    private String cedula2;
    private String direccion2;
    private String nacionalidad2;
    private String fechaNacimiento2;
    private String cargo2;
    private String salario;
    private String escalafon;
    private String fechaInicio;
    private String fechaFin;
    private String periodoPago;
    private String horarioLaboral;

    public Contratista2() {
    }

    public Contratista2(int id, String nombre2, String apellido2, String cedula2, String direccion2, String nacionalidad2, String fechaNacimiento2, String cargo2, String salario, String escalafon, String fechaInicio, String fechaFin, String periodoPago, String horarioLaboral) {
        this.id = id;
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.cedula2 = cedula2;
        this.direccion2 = direccion2;
        this.nacionalidad2 = nacionalidad2;
        this.fechaNacimiento2 = fechaNacimiento2;
        this.cargo2 = cargo2;
        this.salario = salario;
        this.escalafon = escalafon;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.periodoPago = periodoPago;
        this.horarioLaboral = horarioLaboral;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula2() {
        return cedula2;
    }

    public void setCedula2(String cedula2) {
        this.cedula2 = cedula2;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getNacionalidad2() {
        return nacionalidad2;
    }

    public void setNacionalidad2(String nacionalidad2) {
        this.nacionalidad2 = nacionalidad2;
    }

    public String getFechaNacimiento2() {
        return fechaNacimiento2;
    }

    public void setFechaNacimiento2(String fechaNacimiento2) {
        this.fechaNacimiento2 = fechaNacimiento2;
    }

    public String getCargo2() {
        return cargo2;
    }

    public void setCargo2(String cargo2) {
        this.cargo2 = cargo2;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
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

    public String getPeriodoPago() {
        return periodoPago;
    }

    public void setPeriodoPago(String periodoPago) {
        this.periodoPago = periodoPago;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }
}
