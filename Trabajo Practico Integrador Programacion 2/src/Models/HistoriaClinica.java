/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class HistoriaClinica {
     // Atributos
    private Long id;
    private boolean eliminado;
    private String nroHistoria;
    private String grupoSanguineo;
    private String antecedentes;
    private String medicacionActual;
    private String observaciones;

    // Constructores

    // Constructor vacío (requerido por frameworks y DAO)
    public HistoriaClinica() {
    }

    // Constructor completo
    public HistoriaClinica(Long id, boolean eliminado, String nroHistoria, String grupoSanguineo,
                           String antecedentes, String medicacionActual, String observaciones) {
        this.id = id;
        this.eliminado = eliminado;
        this.nroHistoria = nroHistoria;
        this.grupoSanguineo = grupoSanguineo;
        this.antecedentes = antecedentes;
        this.medicacionActual = medicacionActual;
        this.observaciones = observaciones;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(String nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getMedicacionActual() {
        return medicacionActual;
    }

    public void setMedicacionActual(String medicacionActual) {
        this.medicacionActual = medicacionActual;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // toString() legible

    @Override
    public String toString() {
        return "HistoriaClinica {" +
                "id=" + id +
                ", eliminado=" + eliminado +
                ", nroHistoria='" + nroHistoria + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", antecedentes='" + antecedentes + '\'' +
                ", medicacionActual='" + medicacionActual + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    // equals() y hashCode() (opcional pero recomendable)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoriaClinica)) return false;
        HistoriaClinica that = (HistoriaClinica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
