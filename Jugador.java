/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseaccess;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Jugador implements Comparable<Jugador> {
    
    private final int id;
    private Posicion posicion;
    private List<Posicion> otras_posiciones;
    private final String nombre;
    private int edad;
    private int media;
    private final int max_media = 100;
    private final int min_media = 1;
    private Equipo equipo;
    
    public Jugador (int id, Posicion posicion, String nombre, int edad, int media, Equipo equipo)
    {
        this.id = id;
        this.posicion = posicion;
        this.nombre = nombre;
        this.edad = edad;
        this.media = media;
        this.equipo = equipo;
    }
    
    public Equipo getEquipo()
    {
        return this.equipo;
    }
    
    public void cambiaEquipo(Equipo equipo)
    {
        this.equipo = equipo;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setPosicion(Posicion posicion)
    {
        this.posicion = posicion;
    }
    
    public Posicion getPosicion()
    {
        return posicion;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void incrementaEdad()
    {
        this.edad++;
    }
    
    public int cambiaMedia(int cambio)
    {
        this.media = this.media + cambio;
        if (this.media > max_media)
            return max_media;
        if (this.media < min_media)
            return min_media;
        return this.media;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    
    public int getMedia()
    {
        return this.media;
    }
    
    @Override
    public int compareTo(Jugador jugador) {
        int compareQuantity = ((Jugador) jugador).getMedia(); 
	//ascending order
	return compareQuantity - this.media;
		
	//descending order
	//return compareQuantity - this.quantity;
    }	
}
