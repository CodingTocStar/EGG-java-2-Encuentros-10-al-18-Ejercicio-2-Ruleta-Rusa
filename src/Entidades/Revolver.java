/*
Clase Revolver de agua: esta clase posee los siguientes atributos: 
    posición actual (posición del tambor que se dispara, puede que esté el agua o no) y 
    posición agua (la posición del tambor donde se encuentra el agua). 
    Estas dos posiciones, se generarán aleatoriamente.

    Métodos:
    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    deben ser aleatorios.
    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    • siguienteChorro(): cambia a la siguiente posición del tambor
    • toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author MiriamNahuel
 */
public class Revolver {

    //ATRIBUTOS 
    private int posicionActual;
    private int posicionAgua;

    //CONSTRUCTORES
    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    //GETTER & SETTER
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //METODOS
    
    //herramientas
        Random random = new Random();
        
        
//    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//    deben ser aleatorios.
    public Revolver llenarRevolver(Revolver revolver) {

        int aleatorio = random.nextInt(6) + 1;

        revolver.setPosicionActual(aleatorio);

        revolver.setPosicionAgua(aleatorio);

        return new Revolver(posicionActual, posicionAgua);
    }

////    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(Revolver revolver) {
        boolean mojar = false;

        int posicionActual = revolver.getPosicionActual();
        int posicionAgua = revolver.getPosicionAgua();

        if (posicionActual == posicionAgua) {
            mojar = true;
            return mojar;
        }
        return mojar;
    }

//    • siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(Revolver revolver){
    
        if (revolver.getPosicionActual() != revolver.getPosicionAgua()) {
            int aleatorio = random.nextInt(6);
        }
    }
    
//    • toString(): muestra información del revolver (posición actual y donde está el agua)
}
