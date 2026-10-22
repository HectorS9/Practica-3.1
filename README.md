# Practica-3.1
Practica 3.1 de laboratorio de ICC
Ejercicio 01- Referencias e Inmutabilidad

.
1- El primer print imprimirà falso, porque al utilizar "==" compara las referencias de un mismo obejeto, y "b" es un objeto diferente a el de "a"
2- El segundo print imprimirà verdadero, porque al momento de declarar "c" como la concatenacion de "ja" y "va" en una sola lìnea de codigo y registrandola en la memoria con la misma referncia de "a"
3- El tercer print imprimirà falso, porque al haber declarado "d" como "ja" inicialmente y despuès concatenarlo con "d += "va" se creò un objeto "java" en la memoria.
4- El cuarto print imprimirà verdadero, porque el mètodo equals compara los objetos declarados "a" y "d" y como ambos son "Java" son iguales.
5- El quinto print imprimirà "Java", porque fue declarado asì y no tuvo ninguna modificaciòn.
6- El sexto print imprimirà "Java 21", porque despuès de declarar "b" como "Java" se concatenò con " 21", haciendo que se modificara el objeto b de "Java" a "Java 21"

Las variables a y c comparten un objeto, y las variables b y d son independientes.

.El String Pool es un mecanismo que usa java para reutilizar cadenas con el objetivo de ahorrar memoria.
 "==" compara las referencias para saber si apuntan al mismo objeto mientras que "equals" compara el contenido de las cadenas.
"concat" sirve para unir cadenas de texto pero sin modificar el objeto, se tendira que agregar uno nuevo para modificarlo realmente.

Ejercicio 02- Operaciones e ìndices en StringBuilder.

.
1 sb= ABCDE 
2 = AE
3 = AxyzE
4 = EzyxA
5 = E-A

Salida : E-A
         3
         21
. El delete (1,4) no elimina los cuatro caràcteres porque elimina desde inicio hasta fin ("inicio", "fin") por lo que deja de eliminar al llegar al 4
length indica cuantos caracteres tiene el objeto en el momento y capacity cuantos caracteres puede almacenar en su espacio actual. 

Ejercicio 03- Referencias compartidas .

Salidas: 
1 mundo
2 mundo
3 Hola
4 True
5 True
6 False

el a.append(" mundo") agrega mundo a la cadena "a" haciendo que sea "Hola mundo"
el b.delete(0, 5) elimina los caracteres de "Hola mundo" 1,2,3,4



