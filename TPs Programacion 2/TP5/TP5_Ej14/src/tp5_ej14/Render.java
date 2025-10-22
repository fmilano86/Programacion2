/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej14;

/**
 *
 * @author Usuario
 */
public class Render {
     private String formato;
    private Proyecto proyecto; 

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public String getFormato() {
        return formato;
    }
}
