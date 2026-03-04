Aquí tienes el enunciado adaptado al universo de *BoJack Horseman*. Mantiene exactamente la misma estructura técnica, exigencias de encapsulación y lógica de arrays fijos que el ejercicio original, pero ambientado en Hollywoo.

---

# 🎬 Sistema de Gestión – Agencia de Talentos VIM (Hollywoo)

## 🎯 Objetivo

Aplicar de forma autónoma el patrón trabajado en clase utilizando:

* Clases y objetos
* Composición
* Arrays unidimensionales de tamaño fijo
* Métodos bien estructurados
* Javadoc correcto
* Código limpio y ordenado

> Este ejercicio tiene exactamente la misma estructura técnica que el examen.

---

## 📖 Escenario

Princess Carolyn ha fundado su nueva agencia de talentos, **VIM**, en Hollywoo. Para no saturarse de trabajo, la agencia gestiona un máximo de **15 clientes activos**.

Cada cliente está identificado mediante un **id único** y dispone de la siguiente información:

* `id` (int)
* `nombre` (String) - *Ej: BoJack Horseman, Mr. Peanutbutter, Sarah Lynn*
* `profesion` (String) - *Ej: Actor, Director, Escritor*
* `escandalosPublicos` (int) - *Número de polémicas en las que ha estado involucrado*

El sistema debe permitir registrar clientes, buscarlos, mostrarlos y contar cuántos están actualmente almacenados en la cartera de la agencia.

Recuerda crear los commits adecuados según vas desarrollando la solución.

---

## 🧩 Requisitos técnicos

### 1️⃣ Clase `Cliente`

Debe incluir:

* Atributos privados.
* Constructor completo.
* Métodos getters.
* Método `toString()`.
* Javadoc en:
* Clase
* Constructor
* Métodos públicos



---

### 2️⃣ Clase `AgenciaTalentos`

Debe incluir:

#### Atributos

```java
private Cliente[] clientes;
private final int NUM_MAX_CLIENTES;

```

#### Constructor

* Asegúrate de que el número de clientes recibido por parámetro sea positivo.

---

### Métodos obligatorios

```java
public Cliente buscarCliente(int id)
private int buscarPrimerHuecoLibre()
public boolean registrarCliente(Cliente cliente)
public String mostrarClientes()
public int contarClientes()

```

---

## 🔍 Comportamiento esperado

### `buscarCliente(int id)`

* Devuelve el cliente con ese id.
* Devuelve `null` si no existe.

### `buscarPrimerHuecoLibre()`

* Devuelve la primera posición `null` dentro del array.
* Devuelve `-1` si la cartera de clientes de la agencia está llena.

### `registrarCliente(Cliente cliente)`

* Solo añade si no existe otro cliente con el mismo id.
* Solo añade si hay un hueco disponible en la agencia.
* Devuelve `true` si se añade correctamente a la agencia.
* Devuelve `false` si no puede añadirse.

### `mostrarClientes()`

* Devuelve un `String` con el listado de clientes y su información (ideal para que Princess Carolyn lo revise).

### `contarClientes()`

* Devuelve el número real de clientes actualmente almacenados (no la capacidad máxima).

---

## 🖥 Clase `Main`

Debe:

* Crear una `AgenciaTalentos` con capacidad para 15 clientes.
* Registrar al menos 3 clientes (¡échale imaginación con los personajes!).
* Mostrar todos los clientes registrados.
* Mostrar el total de clientes almacenados.
* Probar una búsqueda de un cliente que exista y otra de uno que no exista.

---

## 📊 Criterios de evaluación

| Criterio | Peso |
| --- | --- |
| Diseño correcto de clases | 20% |
| Encapsulación adecuada | 10% |
| Uso correcto del array fijo | 20% |
| Método registrarCliente correcto | 15% |
| Recorrido y visualización correctos | 10% |
| Conteo correcto | 10% |
| Javadoc adecuado | 10% |
| Orden y claridad del código | 5% |

---

## ⚠️ Errores frecuentes a evitar

* No inicializar el array en el constructor.
* Usar `ArrayList` en lugar de un array nativo.
* No comprobar `null` antes de acceder a un objeto dentro del array.
* Sobrescribir posiciones ocupadas de otros clientes.
* No devolver `false` cuando la agencia está llena.
* No documentar correctamente con Javadoc.
* Hacer atributos públicos en lugar de privados.

---

## 📌 Entrega

* Proyecto completo.
* Código funcional.
* Compila sin errores.
* Nombres de variables/métodos claros y coherentes.

---

## 💬 Importante

Si eres capaz de resolver correctamente este ejercicio, estás preparado para el examen.

---

## 🚀 Ampliación de ejercicio

* Implementa un método que elimine un cliente recibiendo el objeto completo:
  `public Cliente deleteCliente(Cliente cliente)`
* Implementa un método que elimine un cliente recibiendo su id:
  `public Cliente deleteCliente(int id)`
* Implementa un método que ordene a los clientes según su id de mayor a menor, **sin dejar huecos libres** entre las posiciones ocupadas del array:
  `public void ordenarClientes()`

---

¿Te gustaría que te ayude a programar la solución en Java paso a paso para que puedas compararla con tu propio código?