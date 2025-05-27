# EXAMEN DE RECUPERACIÓN 1ª EVALUACIÓN

## Duración:
   2,5 horas

## RA evaluados: 
   RA1, RA3, RA6

## Indicaciones: 
   Escribe código claro, modular, documentado, y con control de errores. Puedes usar funciones top-level y estructuras de datos avanzadas.

---

## Introducción

Este proyecto contiene el examen de recuperación correspondiente a la primera evaluación del módulo de Programación.

A través de la resolución de las actividades propuestas demostrarás tus competencias en:

* Declaración y uso de colecciones.
* Diseño de funciones reutilizables.
* Validación de datos.
* Control de errores.
* Aplicación de buenas prácticas de documentación y estilo.

> 📝 **Importante:** El enunciado de las actividades se encuentra **comentado dentro de la función `main()` del proyecto**. Léelo detenidamente para saber qué debes hacer en cada apartado.

---

## 🎯 Resultados de Aprendizaje Evaluados

| RA  | Criterios Evaluados | Apartados cubiertos      |
| --- | ------------------- | ------------------------ |
| RA1 | a–i                 | 1, 2, 3, 4, 5, 6         |
| RA3 | a–i                 | 3, 4, 6, 7, 8            |
| RA6 | a–g, j              | 1, 4, 5, 6, 8            |

---

## Rúbrica de Autocorrección

| Nº | Descripción breve            | RA/CE       | 0 - Incorrecto o no hecho                                 | 1 - Intenta pero falla en lo esencial                                        | 2 - Funciona parcialmente con errores de lógica o estilo                            | 3 - Funciona correctamente pero con mejoras posibles en claridad o estructura               | 4 - Funciona bien, con buena estructura y estilo                                 | 5 - Excelente y completo                                                          |
| -- | ---------------------------- | ----------- | --------------------------------------------------------- | ---------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| 1  | Crear colección de meses     | RA1-a,d,e,f | No crea la colección o elige un tipo no válido o mutable  | Crea la colección pero permite cambio de tamaño o contenido no en minúsculas | Colección válida pero con errores de estilo o nomenclatura                          | Colección bien declarada, tipo adecuado, uso correcto pero sin comentario explicativo       | Colección clara, bien nombrada y con explicación clara del tipo y su elección    | Uso semántico, nombre expresivo, comentario o documentación clara y concisa       |
| 2  | Función capitalizar          | RA1-g,h     | No compila o no transforma correctamente ninguna palabra  | Capitaliza solo la primera palabra o tiene errores de formato                | Capitaliza varias palabras pero falla en casos con múltiples espacios o mayúsculas  | Funciona correctamente con frases simples pero falta documentación                          | Funciona correctamente con buena estructura y estilo                             | Función completa, robusta, bien comentada y válida para todo tipo de entrada      |
| 3  | Función mostrarMeses         | RA3-a,b,e   | No se define la función o falla al mostrar datos          | Muestra incorrectamente las posiciones o nombres, sin orden ni validación    | Muestra parcialmente correcto pero sin control de errores o sin formateo            | Muestra correctamente los meses, incluye parámetros pero falta estilo o modularidad         | Buena modularidad, formato correcto, uso adecuado de bucles y control de errores | Uso avanzado de formato, comentarios, funciones auxiliares y claridad total       |
| 4  | Resumen con joinToString     | RA6-c,d,j   | No se genera el resumen o lo muestra completamente mal    | Muestra los meses sin aplicar transformación ni separar correctamente        | Muestra los meses con separación parcial, sin transformar el último a mayúsculas    | Muestra todos los meses correctamente pero el último mes no sigue el formato deseado        | Muestra correctamente el formato y usa bien funciones auxiliares                 | Código elegante, uso claro de joinToString y concatenación bien pensada           |
| 5  | Traducción meses español-ing | RA6-b,e     | No crea ninguna estructura válida                         | Usa lista o tipo no adecuado para traducir                                   | Mapa incompleto o con claves incorrectas (con tildes, mayúsculas, etc.)             | Mapa completo pero falta claridad en las claves o estructura poco eficiente                 | Mapa bien estructurado, clave clara y traducción válida                          | Solución semánticamente óptima, uso correcto del mapa y uso futuro previsible     |
| 6  | Función traducirMes          | RA3-d,h,i   | No solicita entrada o lanza errores incorrectos           | Lanza excepciones fuera de lugar o no usa `require`                          | Solicita entrada pero no valida tipo o rango correctamente                          | Función correcta pero sin modularizar la solicitud o sin capturar correctamente excepciones | Función robusta con `require`, control de errores y mensajes claros              | Implementación clara, validación elegante, captura controlada y bien documentada  |
| 7  | Función mesesRestantes       | RA3-c,f     | No se implementa la función o no funciona con ningún caso | Pide entrada pero no repite ante error                                       | Repite entrada pero mensaje incorrecto o mal cálculo de meses restantes             | Funciona correctamente pero sin modularizar o con salida poco clara                         | Funciona bien, valida correctamente y presenta bien la salida                    | Función completa, bucle claro, mensajes bien redactados y manejo de bordes        |
| 8  | Validación con regex         | RA6-g       | No usa regex o patrón inválido                            | Usa regex incompleta, no distingue mayúsculas o no prueba                    | Usa regex válida pero no explica su funcionamiento o tiene casos límite incorrectos | Regex clara y funcional pero sin prueba alternativa sin regex                               | Regex funcional, prueba complementaria sin regex, explicación clara              | Validación sólida con varias opciones y análisis de expresividad del patrón regex |

> Marca en cada celda tu nivel del 0 al 5 al completar cada apartado.

---
