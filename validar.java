public class validar {
    private static boolean esApertura(char c) {
    return c == '(' || c == '[' || c == '{';
}   
    private static boolean esCierre(char c) {
    return c == ')' || c == ']' || c == '}';
}
    private static boolean corresponden(char apertura, char cierre) {
    return 
    (apertura == '(' && cierre == ')')
    || (apertura == '[' && cierre == ']')
    || (apertura == '{' && cierre == '}');
}
    public static boolean validar(String expresion) {
    StringBuilder delimitadores = new StringBuilder();

    for (int i = 0; i < expresion.length(); i++) {
    char c = expresion.charAt(i);
    if (esApertura(c)) {
    delimitadores.append(c);        
}       
    else if (esCierre(c)) {
    if (delimitadores.length() == 0) return false;        
    int ultimo = delimitadores.length() - 1;
    if (!corresponden(delimitadores.charAt(ultimo), c)) return false;        
    delimitadores.deleteCharAt(ultimo);
}
}
    return delimitadores.length() == 0;
}
}