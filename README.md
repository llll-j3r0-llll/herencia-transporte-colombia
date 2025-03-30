🚍 Herencia en Transporte Público de Colombia

Este proyecto implementa una jerarquía de clases en Java para modelar diferentes tipos de transporte público en Colombia utilizando herencia.

🌟 Objetivos

Comprender el concepto de herencia en POO.
Implementar superclases y subclases.
Aplicar modificadores de acceso (public, protected, private).
Utilizar super para invocar atributos y métodos de la superclase.

⚙ Tecnologías Utilizadas

Lenguaje: Java ☕
Entorno: Cualquier IDE compatible con Java (IntelliJ, Eclipse, VS Code, NetBeans)
GitHub para control de versiones

🗂 Estructura del Proyecto

herencia-transporte-colombia/
│── src/
│   ├── TransportePublico.java   # Superclase
│   ├── Bus.java                 # Subclase de TransportePublico
│   ├── Metro.java               # Subclase de TransportePublico
│   ├── Transmilenio.java        # Subclase de TransportePublico
│   ├── Main.java                # Clase para probar el proyecto
│── README.md                    # Documentación del proyecto

🔍 Descripción de Clases

1. TransportePublico (Superclase)
Contiene atributos comunes: tipo, ruta, tarifa, distanciaRecorrida, tiempoRecorrido.
Define los métodos calcularTarifa(), calcularDistanciaRecorrida(), calcularTiempoRecorrido().

2. Bus (Subclase de TransportePublico)
Agrega capacidad como atributo.
Define el método calcularTarifaBus().
Muestra información con mostrarInformacion().

3. Metro (Subclase de TransportePublico)
Agrega numeroEstaciones como atributo.
Implementa calcularTarifaMetro().
Agrega mostrarMapa().

4. Transmilenio (Subclase de TransportePublico)

Agrega numeroParadas como atributo.
Implementa calcularTarifaTransmilenio().
Agrega mostrarRuta().
