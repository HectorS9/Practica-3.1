public class reemplazar {
public static String reemplazar(String texto, String buscar, String reemplazo) {
    if (buscar.length() == 0) {
    return texto;
}
    StringBuilder resultado = new StringBuilder();
    int i = 0;
    while (i < texto.length()) {
    boolean coincide = true;
    if (i + buscar.length() <= texto.length()) {
    for (int j = 0; j < buscar.length(); j++) {
    if (texto.charAt(i + j) != buscar.charAt(j)) {
    coincide = false;
    break;
}
}
} 
    else {
    coincide = false;
}
    if (coincide) {
    resultado.append(reemplazo);
    i += buscar.length();
} 
    else {
    resultado.append(texto.charAt(i));
    i++;
}
}
    return resultado.toString();
}
}
