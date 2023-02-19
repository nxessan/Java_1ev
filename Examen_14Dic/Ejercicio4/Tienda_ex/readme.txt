Implementación de la clase Producto. Un producto tiene una descripción (String),
código (int) y un precio (float). Los precios siempre deben de ser, por pequeños 
que sean, positivos, y los códigos de producto, también. La descripción no debe ser 
nunca una cadena de texto vacía.

Un producto puede aumentar su precio o disminuirlo. Pero para aumentarlo 
el usuario nos debe de dar un porcentaje que nos dirá el incremento a aplicar con 
respecto al precio originalmente almacenado. Lo mismo para rebajar el precio. Es decir, si un 
precio es 20,50€, y nos dicen “aumentar” y nos dan un 10, significa que el precio 
debe de subir un 10 por ciento (es decir, precio + precio * porcentaje/100 sería el resultado 
a aplicar). En las rebajas, sería equivalente pero restando.

Realiza la clase Producto en Java, y pruébala con un main (interno o 
externo, como prefieras) que tenga de manera repetitiva el siguiente menú de opciones:
1. Crear producto 1.
2. Crear producto 2.
3. Aumentar precio producto 1
4. Aumentar precio producto 2
5. Rebajar precio producto 1
6. Rebajar precio producto 2
7. Mostrar datos de los productos (de los dos)
8. Salir
