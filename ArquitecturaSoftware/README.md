# Arquitectura de Software - Sistema de Recepción de Demandas

Este proyecto fue desarrollado como parte del curso de **Arquitectura de Software** y representa un sistema judicial básico para la **recepción de demandas de familia**.

## 📌 Objetivo del Proyecto

Simular la recepción y registro de demandas en un entorno judicial, aplicando principios de diseño como **SOLID**, uso de patrones de diseño y organización modular del código.

## 🛠️ Tecnologías

- **Lenguaje:** Java SE
- **Entorno:** BlueJ
- **Interfaz:** Consola (terminal)

## 🧱 Estructura principal

- `Main.java` - Clase principal
- `GestorDeDemandas.java` - Controlador general del sistema
- `Demanda.java`, `Demandante.java`, `Demandado.java`, `ReceptorJudicial.java` - Clases del modelo
- `RegistroCompletoPorFormulario.java` - Simulación de entrada por formulario
- `NotificadorCorreoDemand.java` - Notificador por correo (patrón estrategia)
- Uso de `Builder`, `Observer`, `Strategy`, entre otros patrones

## 📁 Organización del Proyecto

Este proyecto está ubicado dentro de la carpeta `/ArquitecturaSoftware` para mantener el código agrupado y claro.

## 👤 Autor

Juan Carlos Llanos Vega
