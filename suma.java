public class suma {
public String addBinary(String a, String b) {
    int longitud = Math.max(a.length(), b.length());
    char[] resultado = new char[longitud + 1];
    int i = a.length() - 1;
    int j = b.length() - 1;
    int k = resultado.length - 1;
    int acarreo = 0;

    while (i >= 0 || j >= 0 || acarreo > 0) {
    int suma = acarreo;
    if (i >= 0) {
    suma = suma + a.charAt(i) - '0';
    i--;
}
    if (j >= 0) {
    suma = suma + b.charAt(j) - '0';
    j--;
}
    resultado[k] = (char) ('0' + suma % 2);
    acarreo = suma / 2;
    k--;
}
    return new String(
    resultado, k + 1, resultado.length - k - 1
);
}
}