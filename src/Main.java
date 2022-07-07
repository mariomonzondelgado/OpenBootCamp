public class Main {

    /*
        Primera parte:
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.

        Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto
    */


    public static void main(String[] args) {

        int result = suma(5, 10, 15);
        System.out.println("El resultado es: " + result);

        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas");
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}

