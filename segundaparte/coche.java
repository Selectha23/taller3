package coche;
/*
Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto. */


public class coche {
    
int canpuertas = 0;

public int addpuertas(){
    return canpuertas++;
}



public void mpuerta(){
    System.out.println("la cantidad de puertas es: "+canpuertas);

}

public static void main(String[] args) {
    
    coche miCoche= new coche();
    miCoche.addpuertas();
    miCoche.mpuerta();



}



}
