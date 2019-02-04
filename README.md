## Spring-custom-validation
### Implementado validaciones en RESTful Services

* ##### ¿Qué es "validación"? 

Que deberias hacer cuando una "request" es no válida.
Es una buena idea devolver un mensaje genérico que diga: "Algo está mal".

Deberías devolver una respuesta en la que se indique:
        - Mensaje claro que diga que está mal.
	    - Que campo es erróneo y que valores se aceptan para ese campo.
		- Un apropiado “response status”. El “response status” recomendado para validación es:
	            **400 - BAD REQUEST**
		- No incluir información sensible en la respuesta.
		

##### Json válido

> POST http://localhost:8080/users
>Empty Request Content
>{  
>}
>201 Created

> POST http://localhost:8080/users
>Empty Request Content
>{  
>    "name1": null,
>    "passportNumber": "A12345678"
>}
>201 Created

>GET to http://localhost:8080/users
>[ {
>    "id": 1,
>    "name": null,
>    "passportNumber": null
>  },
>  {
>    "id": 2,
>    "name": null,
>    "passportNumber": "A12345678"
>  },
>  {
>    "id": 10001,
>    "name": "Ranga",
>    "passportNumber": "E1234567"
>  }]

Podremos implementar validaciones con Bean Validation API:

* Max
* Min
* NotEmpty
* NotNull
* Size
* .....
* 
Personalización de la respuesta de validación 
**MethodArgumentNotValidException**

	




