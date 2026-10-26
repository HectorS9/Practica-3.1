public class esPalindromo {
    public static char Normalizar(char c) {
    c = Character.toLowerCase(c);
        switch (c) {
            
        case 'á': 
        return 'a';
            
        case 'é': 
        return 'e';
            
        case 'í': 
        return 'i';
            
        case 'ó': 
        return 'o';
            
        case 'ú': 
        return 'u';
            
        default: 
        return c;
}
    }    
    public static boolean Palindromo(String texto) {
    texto = texto.replace(" ", "");

    StringBuilder textoNormalizado = new StringBuilder();     
    for (int i = 0; i < texto.length(); i++) {
    textoNormalizado.append(Normalizar(texto.charAt(i)));
}
    String finalTexto = textoNormalizado.toString();
    int i = 0;
    int j = finalTexto.length() - 1;
    while (i < j) {
    if (finalTexto.charAt(i) != finalTexto.charAt(j)) {
        return false;
}
        i++;
        j--;
}
        return true;
 }
}