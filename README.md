# AREP-Lab7-Taller-AWS

## Crear la clase y método que implementa el servicio

![Clase MathServices](img/image.png)  
**Clase que contiene la lógica para calcular el cuadrado de un número**

---

## Crear la función Lambda

![Formulario creación función lambda](img/image-1.png)  
**Creación de la función Lambda desde cero**

![Seleccionar el código que vamos a subir](img/image-2.png)  
**Seleccionar el código JAR generado con Maven**

![Selección del JAR](img/image-3.png)  
**Selección del archivo `.jar` empaquetado**

![Confirmación de carga correcta del JAR](img/image-4.png)  
**Confirmación de que el JAR fue subido exitosamente**

![Poner paquete y método](img/image-5.png)  
**Configuración del handler con nombre de paquete y método**

![Confirmación de configuración del método](img/image-6.png)  
**Verificación del método de entrada configurado**

![Creación del test](img/image-7.png)  
**Configuración del evento de prueba**

![Resultado positivo del test](img/image-8.png)  
**Resultado exitoso del test ejecutado**

---

## Configurar el API Gateway para exponer el servicio

![Pantalla de API Gateway](img/image-9.png)  
**Pantalla principal del servicio API Gateway**

![Formulario creación REST API](img/image-10.png)  
**Creación de una nueva API REST**

![Creación de recurso](img/image-11.png)  
**Creación de recurso principal para el API**

![Creación sub-recurso](img/image-12.png)  
**Creación de sub-recurso para el método**

![Creación método](img/image-13.png)  
**Asignación del método HTTP GET**

![Valor](img/image-14.png)  
**Asociación de la función Lambda al método GET**

![Mapeando Integration Request](img/image-15.png)  
**Mapeo del parámetro `value` en Integration Request**

![Probar y mostrar que está correcto](img/image-16.png)  
**Prueba con un valor estático en el mapeo**

![Cambiando el Mapping del Integration Request](img/image-17.png)  
**Cambio del mapeo para que acepte parámetros dinámicos**

![Ya funciona la integración](img/image-18.png)  
**Resultado exitoso con parámetro recibido correctamente**

![Despliegue del API](img/image-19.png)  
**Despliegue del API para hacerlo accesible desde Internet**

![URL del método](img/image-20.png)  
**Obtención de la URL pública del método**

![Probando URL del API y del método (Funciona)](img/image-21.png)  
**Prueba final desde el navegador usando la URL del API**

---

## Parte adicional del taller – Seguridad

![Clase User](img/image-22.png)  
**Clase `User` con atributos y métodos getter/setter**

![Clase Security](img/image-23.png)  
**Clase `SecurityUtils` con lógica de login simple**

![Creación del Lambda](img/image-24.png)  
**Nueva función Lambda para login**

![Se subió el JAR](img/image-25.png)  
**Carga del JAR con clases `User` y `SecurityUtils`**

![Edición del runtime](img/image-26.png)  
**Configuración del runtime para la nueva Lambda**

![Prueba del test](img/image-27.png)  
**Test exitoso para función de login**

![Creación del método](img/image-28.png)  
**Creación de nuevo método HTTP para login**

![Editando Method request](img/image-29.png)  
**Configuración de parámetros del Method Request**

![Editando el Integration Request](img/image-30.png)  
**Configuración del Mapping Template para login**

![Test ejecutado y pasado del API Lambda](img/image-31.png)  
**Resultado exitoso del test desde API Gateway**

![Test del LINK](img/image-32.png)  
**Prueba funcional final desde navegador/postman**

---

## Explicación del taller

En este tutorial presentamos una introducción a microservicios con Java sobre AWS Lambda y API Gateway.  
Implementamos un servicio REST que calcula el cuadrado de un número y un servicio de login básico.

### Tecnologías y herramientas utilizadas:

- Java 8
- Maven
- NetBeans
- AWS Lambda
- AWS API Gateway

### Clases principales:

#### MathServices.java
```java
package co.edu.escuelaing;

public class MathServices {
    public static Integer square(Integer i){
        return i * i;
    }
}
````

#### User.java

```java
package co.edu.escuelaing;

public class User {
    private String name;
    private String password;

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
```

#### SecurityUtils.java

```java
package co.edu.escuelaing;

public class SecurityUtils {
    public static User login(User u){
        System.out.println("Username: " + u.getName());
        System.out.println("Password: " + u.getPassword());
        u.setPassword("");
        return u;
    }
}
```

---

## Autor

**Creado por [@AlejandroPrieto82](https://github.com/AlejandroPrieto82)**
Taller desarrollado como parte del curso AREP - Arquitecturas Empresariales.
