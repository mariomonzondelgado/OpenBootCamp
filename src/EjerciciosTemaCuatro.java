public class EjerciciosTemaCuatro {

    /*

    En este ejercicio practicarás las estructuras de control, para ello deberás crear:

      Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
      Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

      Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
      Incrementar el valor de la variable en uno cada vez que se ejecute.
      Mostrarlo por pantalla cada vez que se ejecute.

      Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

      Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

      Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
     */

    public static void main(String[] args) {

        positivoNegativo(12);
        positivoNegativo(0);
        positivoNegativo(-78);

        bucleWhile(1);
        bucleDoWhile(1);
        bucleFor();
        estacionesAnnio(3);
        estacionesAnnio(7);

    }

    public static void positivoNegativo(int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

    public static void bucleWhile(int numeroWhile){
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;

        }
    }
    public static void bucleDoWhile(int numeroDoWhile){
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }

    public static void bucleFor(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void estacionesAnnio(int estacion){
        switch (estacion) {
            case 1 -> System.out.println("Estamos en verano");
            case 2 -> System.out.println("Estamos en otoño");
            case 3 -> System.out.println("Estamos en invierno");
            case 4 -> System.out.println("Estamos en primavera");
            default -> System.out.println("No es una estacion");
        }
    }
}

