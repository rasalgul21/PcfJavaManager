/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseaccess;

/**
 *
 * @author Administrador
 */
public class Posicion {
    
    /* 0 -> portero, 1 -> defensa, 2 -> centrocampista, 3 -> delantero*/
    private int demarcacion;
    /* 0 -> centro, 1 -> derecha, 2 -> izquierda */
    private int lado;
    /* 0 -> equilibrado, 1 -> defensivo. 2 -> ofensivo */
    private int rol;
    
    
    public Posicion (int demarcacion, int lado, int rol)
    {
        this.demarcacion = demarcacion;
        this.lado = lado;
        this.rol = rol;
    }
    
    public boolean cambiaDemarcacion(int demarcacion)
    {
        if (demarcacion < 0 || demarcacion > 3)
        {
            return false;
        }
        
        this.demarcacion = demarcacion;
        return true;
    }
    
    /**
     * 
     * @param simplificado: 0 > demarcacion completa; 1 -> la abreviatura
     * @return 
     */
    public String getDemarcacionNombre(int simplificado)
    {
        if (simplificado == 0) {
            if (this.demarcacion == 0) {
                return "Portero";
            }

            if (this.demarcacion == 1) {
                return "Defensa";
            }

            if (this.demarcacion == 2) {
                return "Centrocampista";
            }

            if (this.demarcacion == 3) {
                return "Delantero";
            }
        }
        
        if (simplificado == 1) {
            if (this.demarcacion == 0) {
                return "POR";
            }

            if (this.demarcacion == 1) {
                return "DEF";
            }

            if (this.demarcacion == 2) {
                return "MED";
            }

            if (this.demarcacion == 3) {
                return "DEL";
            }
        }
        return null;
    }
    
    public int getDemarcacion()
    {
        return this.demarcacion;
    }
    
}
