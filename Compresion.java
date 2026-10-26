public class Compresion {
    public static String comprimir(String texto) {

    if (texto=="") {
    return "";
}
    StringBuilder resultado = new StringBuilder();
    int contador = 1;
    for (int i = 1; i < texto.length(); i++) {
    if (texto.charAt(i) == texto.charAt(i - 1)) {
    contador++;
} 
    else {
    resultado.append(texto.charAt(i - 1));
    resultado.append(contador);
    contador = 1;
}
}
    resultado.append(texto.charAt(texto.length() - 1));
    resultado.append(contador);
    return resultado.toString();
}
    public static void main(String[] args) {
    System.out.println(comprimir("aaabbcaaaa"));
    System.out.println(comprimir("xxxxyzz"));
    System.out.println(comprimir("abcd"));
    System.out.println(comprimir(""));
}
}