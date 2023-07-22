# The Library-Service Code
Ejemplo de manejo de librería desarrollada con Api First, Spring Boot y Open API 3

<br>
<br>


## Como ejecutar
1. En el directorio raíz ejecutar `mvn clean install`
2. Ejecutar la clase OpenApiGeneratedApplication.java class 
3. Enviar la siguiente petición POST a http://localhost:8080/book
```json
{
    "id": "1",
    "author": "J. R. R. Tolkien",
    "title": "The Lord of the Rings"
}
```


## Tecnología usada
Esta es una lista de las tecnologías usadas: <br>
* OpenApi 3.0
* Swagger Code gen
* Spring Boot 2.7
* Maven 3.8
* Java 8
