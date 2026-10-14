# 🚀 PROYECTO INTEGRADOR FINAL – PROGRAMACIÓN ORIENTADA A OBJETOS

---

## 🎯 TÍTULO

Sistema de Gestión de Empleados con Herencia y Polimorfismo

---

## 🧠 DESCRIPCIÓN

Desarrollar un sistema en Java que permita gestionar diferentes tipos de empleados dentro de una empresa, aplicando los principios fundamentales de la Programación Orientada a Objetos.

El sistema debe permitir calcular salarios, mostrar información y trabajar de forma polimórfica con diferentes tipos de empleados.

---

## 📋 REQUERIMIENTOS

---

### 🔹 1. Clase base `Empleado`

Atributos:
- nombre (private)
- salarioBase (private)

Métodos:
- Constructor con parámetros  
- Getters y setters  
- Método `calcularSalario()`  
- Método `mostrarDatos()`  

---

### 🔹 2. Clase `Gerente` (HERENCIA)

Debe heredar de `Empleado`.

Atributos:
- bono (double)

Métodos:
- Constructor  
- Sobrescribir `calcularSalario()` → salarioBase + bono  

---

### 🔹 3. Clase `Desarrollador` (HERENCIA)

Debe heredar de `Empleado`.

Atributos:
- horasExtras (int)
- valorHora (double)

Métodos:
- Constructor  
- Sobrescribir `calcularSalario()`  

---

### 🔹 4. POLIMORFISMO

En la clase principal:

- Crear un arreglo de tipo `Empleado[]`
- Guardar objetos de tipo:
  - Gerente
  - Desarrollador

---

### 🔹 5. RECORRIDO

Recorrer el arreglo y:

- Mostrar datos de cada empleado  
- Mostrar salario calculado  

---

### 🔹 6. USO DE CONCEPTOS

Debe incluir:

- Encapsulamiento (atributos private)  
- Getters y setters  
- Uso de `this`  
- Herencia (`extends`)  
- Uso de `super`  
- Polimorfismo  
- Sobrescritura (`@Override`)  

---

## 🧪 EJEMPLO DE SALIDA ESPERADA

Empleado: Carlos  
Salario: 2500  

Empleado: Ana  
Salario: 1800  

---

## 🎯 OBJETIVOS DE APRENDIZAJE

- Aplicar herencia en un problema real  
- Comprender el polimorfismo en ejecución  
- Diseñar clases reutilizables  
- Implementar buenas prácticas de POO  

---

## ⚠️ RETOS ADICIONALES (BONUS 🔥)

- Validar datos (salarios no negativos)  
- Agregar método para contar empleados  
- Identificar el empleado con mayor salario  
- Crear método estático de bienvenida  

---

## 📊 CRITERIOS DE EVALUACIÓN

| Criterio | Puntos |
|--------|-------|
| Uso correcto de clases | 20 |
| Encapsulamiento | 20 |
| Herencia | 20 |
| Polimorfismo | 20 |
| Funcionalidad | 20 |

---

## 🚀 NIVEL

🔴 Avanzado / Proyecto Integrador

---

## 👨‍🏫 NOTA FINAL

Este proyecto integra los pilares fundamentales de la Programación Orientada a Objetos:

- Encapsulamiento  
- Herencia  
- Polimorfismo  

👉 Su correcta implementación demuestra dominio de la POO a nivel intermedio-avanzado.