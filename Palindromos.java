public class Palindromos {
    public static char Normalizar (char c) {
        char c = Character.toLowerCase(c);

        switch (c) {
            case 'á' :
            return 'a';
            
            case 'é':
            return 'e';

            case 'í':
            return 'i';

            case 'ó':
            return 'o';

            case 'ú':
            return 'u';

        }
    }    
    
     public static boolean Palindromo (String texto) {
     texto= texto.replace (" ","");
          
      for (int i=0; i> texto.length();i++){

      for (int j= texto.length()-1; j>=0;j--){
      
      if (texto.charAt(i)!= texto.charAt(j)){
      return false;
    }
      break;
    }
}
      return true;
     }
  }
