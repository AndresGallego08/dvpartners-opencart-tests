# Documentación del Proyecto de Automatización

## Descripción
Este proyecto de automatización de pruebas fue desarrollado para validar diversas funcionalidades de la tienda en línea OpenCart. Se implementó utilizando el patrón de diseño Screenplay con SerenityBDD, Cucumber y Java 17, estructurando el código de manera modular y reutilizable.

## Funcionalidades Automatizadas
1. Completa el formulario de registro.
2. Valida el inicio de sesión.
3. Prueba el restablecimiento de contraseña.
4. Navega a la sección de Laptops & Notebooks y selecciona la opción "Show all laptops & notebooks".
5. Agrega al carrito de compras un MacBook Pro.
6. Utiliza la barra de búsqueda para encontrar una tablet Samsung Galaxy y agregarla al carrito de compras.
7. Elimina la MacBook Pro del carrito.
8. Agrega otra unidad de la tablet Samsung Galaxy.
9. Completa el proceso de compra hasta la confirmación de la orden.

## Tecnologías Utilizadas
- **Lenguaje:** Java 17
- **Framework de automatización:** SerenityBDD con Cucumber
- **Gestor de dependencias:** Gradle 7.5
- **Patrón de diseño:** Screenplay

## Estructura del Proyecto
```
automatizacion-web/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.doublevpartners.opencart.automation/
│   │   │   │   ├── exceptions/
│   │   │   │   ├── models/
│   │   │   │   ├── questions/
│   │   │   │   ├── tasks/
│   │   │   │   ├── userinterfaces/
│   │   │   │   ├── utils/
│   ├── test/
│   │   ├── java/
│   │   │   ├── com.doublevpartners.opencart.automation/
│   │   │   │   ├── runners/
│   │   │   │   ├── stepdefinitions/
│   │   ├── resources/
│   │   │   ├── features/
│   │   │   │   ├── login.feature
│   │   │   │   ├── formulario_de_registro.feature
│   │   │   │   ├── completar_compra.feature
│   │   │   ├── Data_es_ES.properties
```

## Explicación de las Capas en Screenplay
- **Tasks:** Contiene las acciones que un usuario puede realizar, como agregar productos al carrito.
- **Questions:** Permite validar el estado de la aplicación mediante consultas a la UI.
- **UserInterfaces:** Define los localizadores de los elementos de la página web.
- **Models:** Representa los datos utilizados en la automatización.
- **Utils:** Contiene clases auxiliares para configuraciones o manipulaciones de datos.
- **Exceptions:** Maneja errores y excepciones personalizadas dentro del framework.

## Configuración del Entorno de Pruebas
La clase `TestSetup` dentro de `stepdefinitions` se encarga de:
- Configurar WebDriver con Chrome.
- Abrir la URL de prueba.
- Configurar el actor principal que interactuará con la aplicación.

## Ejecución de las Pruebas
Para ejecutar las pruebas desde la consola, utilizar:
```sh
./gradlew test --tests "com.doublevpartners.opencart.automation.runners.TestRunner"
```

## Escenarios de Prueba
### `login.feature`
Automatiza el inicio de sesión y la recuperación de contraseña.

### `formulario_de_registro.feature`
Automatiza el proceso de registro de un nuevo usuario.

### `completar_compra.feature`
Automatiza el proceso de compra, incluyendo la selección y eliminación de productos.

## Dependencias en `build.gradle`
```gradle
apply plugin: 'java-library'
apply plugin: 'eclipse'
apply plugin: 'idea'
apply plugin: 'net.serenity-bdd.aggregator'

repositories {
    jcenter()
    mavenLocal()
}

dependencies {
    implementation 'net.serenity-bdd:serenity-core:2.0.82'
    implementation 'net.serenity-bdd:serenity-junit:2.0.33'
    implementation 'net.serenity-bdd:serenity-screenplay:2.0.82'
    implementation 'net.serenity-bdd:serenity-cucumber:1.9.45'
    implementation 'org.slf4j:slf4j-api:2.0.9'
    implementation 'org.slf4j:slf4j-simple:2.0.9'
    testImplementation 'io.github.bonigarcia:webdrivermanager:5.8.0'
    implementation 'com.github.javafaker:javafaker:1.0.2'
}
```