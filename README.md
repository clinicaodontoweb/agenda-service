# AGENDA-SERVICE

### Pré-Requisitos

Compilar e executar o projeto **https://github.com/clinicaodontoweb/arquitetura**

### Instalação

Para compilar o projeto rode o seguinte comando:

`gradle clean build`

Para iniciar o serviço rode o seguinte comando na raiz do projeto:

`java -jar build\libs\agenda-service-1.x.x.jar`

Para iniciar o serviço pela IDE apenas rode a classe **com.odontoweb.microservice.Application.java**

### Lista de serviços:

#### RECEPCIONISTA

**Metodo:** GET <br />
####Busca todos os objetos da entidade Recepcionista
**Request:** <br/>
http://localhost:3334/agenda-service/recepcionista <br />


**Metodo:** POST <br />
####Insere uma nova entidade Recepcionista
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
####Atualiza a entidade Recepcionista
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

**Metodo:** DELETE <br />
####Remove a entidade Recepcionista
**Request:** <br/>
http://localhost:3334/agenda-service/recepcionista/16 <br />