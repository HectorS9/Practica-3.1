public class invertirpalabras {
public static String invertirPalabras(String texto) {
    StringBuilder resultado = new StringBuilder();
    int i = texto.length() - 1;

    while (i >= 0) {
    if (texto.charAt(i) != ' ') {
    int fin = i;
    while (i >= 0 && texto.charAt(i) != ' ') {
    i--;
}
    resultado.append(texto.substring(i + 1, fin + 1));
} 
    else {
    resultado.append(texto.charAt(i));
    i--;  
}
}
    return resultado.toString();
}
}