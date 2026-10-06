## Sistema de biblioteca
### Pair Programing
# Alumnos:
> Jorge Otilio Salazar Díaz  
> Alan Yahir Tejeda Jiménez

## Preguntas
>¿Para qué sirve package?

Sirve para agrupar y organizar clases, interfaces y enumeraciones afines bajo un mismo espacio de nombres (namespace). Previene conflictos de nombres entre clases con la misma denominación y gestiona los niveles de acceso entre ellas.
> ¿Para qué sirve import?

Permite utilizar clases, interfaces o paquetes dentro del código sin necesidad de escribir su nombre completo cada vez que se mencionen.
> ¿Qué relación existe entre paquete y directorio?

La estructura de un paquete define la jerarquía física de carpetas donde deben guardarse los archivos .java y .class. Por ejemplo, la declaración package biblioteca.modelo; exige que el archivo se ubique dentro de la ruta de directorios biblioteca/modelo/.
> ¿Qué es Javadoc?

Es la herramienta estándar de Java que genera documentación técnica en formato HTML de manera automatizada a partir del código fuente. Extrae la información de las estructuras del código y de los comentarios de documentación especiales.
> ¿Qué diferencia hay entre // y /** ... */?

// (Comentario de una sola línea): Se utiliza para notas rápidas, explicaciones breves dentro del flujo del código o para desactivar temporalmente una línea. El compilador lo ignora y no forma parte de la documentación.

/** ... */ (Comentario Javadoc o de Documentación): Se ubica justo encima de clases, interfaces, métodos o atributos para describir su función. La herramienta Javadoc lo procesa para generar la documentación oficial y permite el uso de etiquetas especiales como @param, @return o @throws.