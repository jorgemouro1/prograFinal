1. Crear unha interface chamada Entregable cos métodos:
- entregar()
- devolver()
- isEntregado()
- compareTo(Object a)

2. Crear a clase Serie:

Atributos:
- titulo
- numeroTempadas (por defecto 3)
- prestado (por defecto false)
- xenero
- creador

Métodos:
- construtor por defecto
- getters e setters (excepto de prestado)
- toString()
- entregar()
- devolver()
- isEntregado()
- compareTo() → compara o número de tempadas

3. Crear a clase Videoxogo:

Atributos:
- titulo
- horasEstimadas (por defecto 10)
- prestado (por defecto false)
- xenero
- compania

Métodos:
- construtor por defecto
- getters e setters (excepto de prestado)
- toString()
- entregar()
- devolver()
- isEntregado()
- compareTo() → compara as horas estimadas

4. Crear o programa principal:

- Crear un array de Series de 5 posicións
- Crear un array de Videoxogos de 5 posicións
- Crear obxectos nas posicións dos arrays
- Entregar algunhas series e videoxogos
- Contar cantos están entregados e devolvelos
- Mostrar:
- a serie con máis tempadas
- o videoxogo con máis horas estimadas
- toda a información usando toString() 