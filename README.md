# AGENDA-SERVICE

Projeto de exemplo pr� configurado

### Pr�-Requisitos

Compilar e executar o projeto **https://github.com/clinicaodontoweb/arquitetura**

### Instala��o

Para compilar o projeto rode o seguinte comando:

`gradle clean build`

Para iniciar o servi�o rode o seguinte comando na raiz do projeto:

`java -jar build\libs\sample-service-1.x.x.jar`

Para iniciar o serviço pela IDE apenas rode a classe **com.odontoweb.microservice.Application.java**

### Lista de serviços:

#### AGENDA

**Metodo:** POST <br />
**Request:** <br/>
http://localhost:3334/agenda-service/recepcionista <br />
**Exemplos POST:** Success <br />
**Request Body:**
```json
{
	"nome":"ANA LUIZA",
	"contatoRequest":{
		"telefones":[
			{
				"numero":34545543,
				"ddd":54,
				"tipoTelefone": "CELULAR"
			}
		],
		"email":"recepcionista.teste@gmail.com"
	},
	"genero":"FEMININO",
	"dentistas":[2]
}
```

**Metodo:** PUT <br />
**Request:** <br/>
http://localhost:3334/agenda-service/recepcionista <br />
**Exemplos PUT:** Success <br />
**Request Body:**
```json
{
	"idRecepcionista":14,
	"nome":"ANA LUIZA COSTA",
	"contatoRequest":{
		"idContato":24,
		"telefones":[
			{
				"idTelefone":27,
				"numero":1111111111,
				"ddd":51,
				"tipoTelefone": "CELULAR"
			}
		],
		"email":"recepcionista.teste@gmail.com"
	},
	"genero":"FEMININO",
	"dentistas":[2]
}
```



#### Autenticação (POST)

```
http://localhost:3333/sample-service/auth
```

**Request**

```
{
  "email": "andre@gmail.com",
  "senha": "123456"
}
```

--------------------------------------------


#### Lista de roles (GET)

```
http://localhost:3333/sample-service/protected
```

**Request Header**

`
X-Auth-Token : {token}
`

--------------------------------------------

