public class eliminarDuplicados {
    public static String eliminarDuplicados(String texto) {
    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < texto.length(); i++) {
    char actual = texto.charAt(i);
    boolean encontrado = false;

    for (int j = 0; j < resultado.length(); j++) {
    if (actual == resultado.charAt(j)) {
    encontrado = true;
    break;
}
}
    if (!encontrado) {
    resultado.append(actual);
}
}
    return resultado.toString(); 
} 
}
//* Para revisar si un caracter ya fue agregado al resultado, se recorre el StringBuilder resultado con el for de entero j
//  y se compara cada caracter con el caracter actual si se encuentra una coincidencia, se marca como encontrado 
//  y no se agrega al resultado. 
//  Si no se encuentra ninguna coincidencia, se agrega al resultado.