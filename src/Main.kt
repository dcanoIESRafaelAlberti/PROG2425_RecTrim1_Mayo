fun main() {
    // INTRODUCCIÓN
    // ------------
    //
    // Este examen de recuperación es una oportunidad para demostrar que has comprendido y sabes aplicar los conceptos
    // fundamentales de la programación en Kotlin. A través de los distintos ejercicios propuestos, pondrás en práctica
    // la creación y manipulación de colecciones, el diseño de funciones reutilizables, la validación de entradas y el
    // tratamiento de errores.
    //
    // Recuerda que lo más importante no es solo que el programa funcione, sino que esté bien estructurado, sea legible
    // y esté documentado. Piensa en cada función como una herramienta que podrías volver a usar en otro proyecto.
    // Tu objetivo es escribir código claro, mantenible y elegante.
    //
    // Confía en lo que has aprendido, organiza tu trabajo paso a paso y demuestra tu capacidad para resolver problemas
    // con lógica y creatividad.


    // (RA1-a, d, e, f; RA6-a)
    // 1. Crea una colección, meses, de 12 elementos que contendrá el nombre de los meses del año en minúsculas.
    // Debes utilizar un tipo de datos adecuado y lo más eficiente para trabajar con dicha colección, que
    // siempre tendrá estos 12 elementos, aunque será posible modificar el contenido de cada posición.


    // (RA1-g, h)
    // 2. Crea una función top level para capitalizar palabras. Deberá recibir una cadena de tipo String y retornar la
    // misma cadena pero capitalizada, es decir, el primer carácter mayúscula y el resto en minúsculas. Si hay
    // más de una palabra, deberá capitalizar cada una de las palabras, no solo la primera.


    // (RA3-a, b, e, f, g; RA1-i; RA6-a)
    // 3. Crea una función top level, mostrarMeses, para recorrer la colección anterior con un bucle adecuado
    // para acceder al contenido de los elementos por "posición".
    // Dicha función recibirá la colección del apartado 1, un número total de meses a mostrar (por defecto 12) y
    // un parámetro de tipo booleano que indicará si el orden es ascendente o no (por defecto false) y mostrará
    // los meses, precedidos por el número del orden del mes en el año.
    //
    // Por ejemplo si se piden todos los meses en orden descendente se mostrará lo siguiente:
    // MESES DEL AÑO
    // -------------
    // 12 -> Dic
    // 11 -> Nov
    // 10 -> Oct
    // 09 -> Sep
    // 08 -> Ago
    // 07 -> Jul
    // 06 -> Jun
    // 05 -> May
    // 04 -> Abr
    // 03 -> Mar
    // 02 -> Feb
    // 01 -> Ene
    //
    // * Realiza la llamada adecuada a la función para mostrar los 6 primeros meses en orden ascendente y después otra
    // llamada para mostrar todos los meses de forma descencente (como en el ejemplo anterior).
    //
    // * Consejos para una buena programación:
    // Crea las funciones top level capitalizar y recortar... te paso la documentación que tendría cada una como ayuda.
    // Úsala en la ubicación correcta para documentar la función también.
    /**
     * Convierte la primera letra de cada palabra de la cadena a mayúscula y el resto a minúsculas.
     *
     * Esta función es útil para capitalizar frases o nombres compuestos, asegurando que cada palabra
     * comience por una letra mayúscula y el resto de sus caracteres estén en minúscula, sin importar
     * el formato original de la cadena.
     *
     * Los espacios múltiples se eliminan y las palabras se separan por un único espacio.
     *
     * @param cadena La cadena de texto que se desea capitalizar.
     * @return Una nueva cadena con cada palabra capitalizada.
     *
     * @see String.lowercase
     * @see String.replaceFirstChar
     * @see String.split
     * @see String.joinToString
     */

    /**
     * Devuelve un segmento de la cadena comprendido entre las posiciones [inicio] (inclusive)
     * y [fin] (exclusiva).
     *
     * Esta función es útil para extraer subcadenas de forma segura. Si no se especifica
     * el valor de [inicio], se asume que es 0.
     *
     * @param cadena La cadena de la cual se quiere obtener una subcadena.
     * @param inicio La posición inicial desde donde se empieza a extraer. Por defecto es 0.
     * @param fin La posición final (exclusiva) hasta donde se extrae.
     * @return La subcadena comprendida entre [inicio] y [fin].
     *
     * @see String.substring
     */


    // (RA6-c, d, j)
    // 4. Ahora muestra un resumen en el mismo main, pero usando joinToString. El mensaje deberá mostrarse en una
    // única línea, exáctamente como el siguiente:
    //
    // RESUMEN MESES => Ene - Feb - Mar - Abr - May - Jun - Jul - Ago - Sep - Oct - Nov y DICIEMBRE
    //
    // * Ojo con el separador del último mes y su formato, que es diferente al resto (puedes usar joinToString para
    // los 11 primeros meses y después concatenar el último con su separador que también es diferente)
    //
    // Te vendrá muy bien utilizar métodos cómo dropLast, substring, last, replaceFirstChar, lowercase, uppercase.
    // O si has creado correctamente las funciones aconsejadas del apartado anterior, podrás usar dropLast, last,
    // uppercase, recortar, capitalizar.


    // (RA6-b, e)
    // 5. Crea una estructura de datos compleja, traducciones, adecuada para traducir a inglés el nombre de cada mes.
    // Deberemos ser capaces de acceder directamente a la traducción de cada mes por su nombre en español
    // en minúsculas.


    // (RA3-d, h, i; RA1-g)
    // 6. Crea una función, traducirMes, que reciba las dos estructuras de datos: meses y traducciones. Esta función
    // debe solicitar al usuario un número de un mes (controla los posibles errores) y retornar el nombre en español y
    // su traducción o "lanzar" una excepción de tipo IllegalArgumentException con el mensaje correspondiente:
    //   - Debe introducir un número entero válido.
    //   - Debe introducir un valor entre 1 y 12.
    // Utiliza un "Pair" para retornar los valores.
    // Realiza la llamada a esta función, controlando las posibles excepciones que lanza y muestra el resultado o el
    // mensaje de error adecuado que debe venir en la excepción.
    //
    // * Consejos para una buena programación:
    // Crea también una función pedirNumero que retorne el número introducido.
    //
    // * Ejemplos de ejecución:
    //
    // > Introduce un número del 1 al 12: 5
    // > Traducción de Mayo: May
    //
    // > Introduce un número del 1 al 12: 33
    // > Error: Debe introducir un valor entre 1 y 12
    //
    // > Introduce un número del 1 al 12: enero
    // > Error: Debe introducir un número entero válido


    // (RA3-c, f)
    // 7. Crea una función llamada mesesRestantes que reciba la colección meses. La función debe:
    // - Solicitar al usuario el nombre de un mes en minúsculas.
    // - Repetir la solicitud hasta que se introduzca un nombre válido (uno que esté en la colección).
    // - Una vez validado:
    //   * Si el mes es "diciembre", mostrar "Este es el último mes del año!".
    //   * Si es cualquier otro, mostrar cuántos meses faltan para acabar el año y cuáles son.
    //
    // Realiza la llamada a esta función desde el main.


    // (RA6-g)
    // 8. Crea una función que reciba una cadena y verifique si se trata de un nombre válido de mes
    // (en español, sin tildes), usando una expresión regular.
    // Utilízala en el main, preguntando al usuario un mes por consola, como en el ejemplo siguiente:
    //
    // > Dime un nombre de un mes: Enero
    // > Muy bien! Se trata de un nombre de mes válido.
    //
    // > Dime un nombre de un mes: Domingo
    // > Lo siento, pero ese mes no existe.
    //
    // ¿Se te ocurre alguna forma de hacer lo mismo sin expresiones regulares?


}