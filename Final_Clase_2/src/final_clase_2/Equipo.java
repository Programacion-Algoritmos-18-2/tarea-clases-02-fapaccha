/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_clase_2;

/**
 *
 * @author user
 */
public class Equipo {
	private String nombre;
	private int jug;
	private String ciudad;
        //  Metodo para obtener nombre de equipo
        public String obtenerNombre() {
            return nombre;
        }
        //  Metodo para agregar nombre de equipo
        public void agregarNombre(String n) {
            nombre=n;
        }
        //  Metodo para obtener numero de jugadores
        public int obtenerJug() {
            return jug ;
        }
        //  Metodo para agregar numero de jugadores
        public void agregarJug(int j) {
            jug=j;
        }
        //  Metodo para obtener nombre de ciudad
        public String obtenerCiudad() {
            return ciudad;
        }
        //  Metodo para agrgar nombre de ciudad
        public void agregarCiudad(String c) {
            ciudad= c;
        }
        // Metodo constructor 1
        public Equipo() {
        }
        // Metodo constructor 2
        public Equipo(String n) {
            nombre=n;
        }
        // Metodo constructor 3
        public Equipo(String n, int j) {
            nombre=n;
            jug=j;
            
        }
        // Metodo constructor 4
        public Equipo(String n, int j, String c) {
            nombre=n;
            jug=j;
            ciudad=c;
        }




}
