public class recorrer {
    public static void main(String[] args) {
    int[] numeros = {8, 3, 10, 5, 4};
    
    int suma = 0;
    int mayor = numeros[0];

    for (int i = 0; i < numeros.length; i++) {
    suma = suma + numeros[i];
    if (numeros[i] > mayor) {
    mayor = numeros[i];
}
}
    double promedio = (double) suma / numeros.length;

    System.out.println("Suma: " + suma);
    System.out.println("Promedio: " + promedio);
    System.out.println("Mayor: " + mayor);
}
}
