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
Busca todos os objetos da entidade Recepcionista <br />
**Request:** <br/>
http://localhost:3334/agenda-service/recepcionista <br />
**Exemplos GET:** Success <br />
**Response Body:**
```json
[
	{
		"idRecepcionista": 1,
		"usuarioClinicaResponse": {
			"idUsuarioClinica": 1,
			"email": "recepcionista@gmail.com",
			"tipoProfissional": "RECEPCIONISTA"
		},
		"nome": "Recepcionista",
		"contatoResponse": {
			"idContato": 6,
			"telefones": [
				{
					"idTelefone": 7,
					"numero": 975544633,
					"ddd": 21,
					"tipoTelefone": "CELULAR"
				}
			],
			"email": "nena.moreira@example.com"
		},
		"genero": "FEMININO",
		"dentistasResponse": [
			{
				"idDentista": 1,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 2,
					"email": "aline@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "ALINE CASTRO E SOUZA",
				"contatoResponse": {
					"idContato": 10,
					"telefones": [
						{
							"idTelefone": 11,
							"numero": 996654321,
							"ddd": 51,
							"tipoTelefone": "RESIDENCIAL"
						}
					],
					"email": "novaes@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "1557",
				"codigoBrasileiroOcupacao": "132"
			},
			{
				"idDentista": 2,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 3,
					"email": "livia@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "LIVIA DOS SANTOS",
				"contatoResponse": {
					"idContato": 7,
					"telefones": [
						{
							"idTelefone": 8,
							"numero": 915459800,
							"ddd": 61,
							"tipoTelefone": "CELULAR"
						}
					],
					"email": "herculano.dacosta@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "2334",
				"codigoBrasileiroOcupacao": "132"
			}
		]
	},
	{
		"idRecepcionista": 10,
		"usuarioClinicaResponse": {
			"idUsuarioClinica": 1,
			"email": "recepcionista@gmail.com",
			"tipoProfissional": "RECEPCIONISTA"
		},
		"nome": "Recepcionista Teste",
		"contatoResponse": {
			"idContato": 17,
			"telefones": [
				{
					"idTelefone": 19,
					"numero": 34545543,
					"ddd": 54,
					"tipoTelefone": "CELULAR"
				}
			],
			"email": "recepcionista.teste@gmail.com"
		},
		"genero": "FEMININO",
		"dentistasResponse": []
	},
	{
		"idRecepcionista": 11,
		"usuarioClinicaResponse": {
			"idUsuarioClinica": 1,
			"email": "recepcionista@gmail.com",
			"tipoProfissional": "RECEPCIONISTA"
		},
		"nome": "Recepcionista Teste",
		"contatoResponse": {
			"idContato": 18,
			"telefones": [
				{
					"idTelefone": 21,
					"numero": 34545543,
					"ddd": 54,
					"tipoTelefone": "CELULAR"
				}
			],
			"email": "recepcionista.teste@gmail.com"
		},
		"genero": "FEMININO",
		"dentistasResponse": [
			{
				"idDentista": 1,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 2,
					"email": "aline@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "ALINE CASTRO E SOUZA",
				"contatoResponse": {
					"idContato": 10,
					"telefones": [
						{
							"idTelefone": 11,
							"numero": 996654321,
							"ddd": 51,
							"tipoTelefone": "RESIDENCIAL"
						}
					],
					"email": "novaes@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "1557",
				"codigoBrasileiroOcupacao": "132"
			},
			{
				"idDentista": 2,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 3,
					"email": "livia@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "LIVIA DOS SANTOS",
				"contatoResponse": {
					"idContato": 7,
					"telefones": [
						{
							"idTelefone": 8,
							"numero": 915459800,
							"ddd": 61,
							"tipoTelefone": "CELULAR"
						}
					],
					"email": "herculano.dacosta@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "2334",
				"codigoBrasileiroOcupacao": "132"
			}
		]
	},
	{
		"idRecepcionista": 12,
		"usuarioClinicaResponse": {
			"idUsuarioClinica": 1,
			"email": "recepcionista@gmail.com",
			"tipoProfissional": "RECEPCIONISTA"
		},
		"nome": "Recepcionista Teste",
		"contatoResponse": {
			"idContato": 19,
			"telefones": [
				{
					"idTelefone": 22,
					"numero": 34545543,
					"ddd": 54,
					"tipoTelefone": "CELULAR"
				}
			],
			"email": "recepcionista.teste@gmail.com"
		},
		"genero": "FEMININO",
		"dentistasResponse": [
			{
				"idDentista": 1,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 2,
					"email": "aline@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "ALINE CASTRO E SOUZA",
				"contatoResponse": {
					"idContato": 10,
					"telefones": [
						{
							"idTelefone": 11,
							"numero": 996654321,
							"ddd": 51,
							"tipoTelefone": "RESIDENCIAL"
						}
					],
					"email": "novaes@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "1557",
				"codigoBrasileiroOcupacao": "132"
			},
			{
				"idDentista": 2,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 3,
					"email": "livia@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "LIVIA DOS SANTOS",
				"contatoResponse": {
					"idContato": 7,
					"telefones": [
						{
							"idTelefone": 8,
							"numero": 915459800,
							"ddd": 61,
							"tipoTelefone": "CELULAR"
						}
					],
					"email": "herculano.dacosta@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "2334",
				"codigoBrasileiroOcupacao": "132"
			}
		]
	},
	{
		"idRecepcionista": 13,
		"usuarioClinicaResponse": {
			"idUsuarioClinica": 1,
			"email": "recepcionista@gmail.com",
			"tipoProfissional": "RECEPCIONISTA"
		},
		"nome": "Recepcionista Teste 2",
		"contatoResponse": {
			"idContato": 20,
			"telefones": [
				{
					"idTelefone": 23,
					"numero": 34545543,
					"ddd": 54,
					"tipoTelefone": "CELULAR"
				}
			],
			"email": "recepcionista.teste@gmail.com"
		},
		"genero": "FEMININO",
		"dentistasResponse": [
			{
				"idDentista": 2,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 3,
					"email": "livia@gmail.com",
					"tipoProfissional": "DENTISTA"
				},
				"nome": "LIVIA DOS SANTOS",
				"contatoResponse": {
					"idContato": 7,
					"telefones": [
						{
							"idTelefone": 8,
							"numero": 915459800,
							"ddd": 61,
							"tipoTelefone": "CELULAR"
						}
					],
					"email": "herculano.dacosta@example.com"
				},
				"genero": "FEMININO",
				"conselho": "CRO/SC",
				"registro": "2334",
				"codigoBrasileiroOcupacao": "132"
			}
		]
	}
]
```


**Metodo:** POST <br />
Insere uma nova entidade Recepcionista <br />
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
Atualiza a entidade Recepcionista <br />
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
Remove a entidade Recepcionista <br />
**Request:** <br/>
http://localhost:3334/agenda-service/recepcionista/{id} <br />

**Metodo:** GET <br />
Busca o objeto Recepcionista pelo token de autenticação <br />
**Request:** <br/>
http://localhost:3334/agenda-service/profissional/recepcionista <br />
**Exemplos GET:** Success <br />
**Response Body:**
```json
{
	"idRecepcionista": 1,
	"usuarioClinicaResponse": {
		"idUsuarioClinica": 1,
		"email": "recepcionista@gmail.com",
		"tipoProfissional": "RECEPCIONISTA"
	},
	"nome": "Recepcionista",
	"contatoResponse": {
		"idContato": 6,
		"telefones": [
			{
				"idTelefone": 7,
				"numero": 975544633,
				"ddd": 21,
				"tipoTelefone": "CELULAR"
			}
		],
		"email": "nena.moreira@example.com"
	},
	"genero": "FEMININO",
	"dentistasResponse": [
		{
			"idDentista": 1,
			"usuarioClinicaResponse": {
				"idUsuarioClinica": 2,
				"email": "aline@gmail.com",
				"tipoProfissional": "DENTISTA"
			},
			"nome": "ALINE CASTRO E SOUZA",
			"contatoResponse": {
				"idContato": 10,
				"telefones": [
					{
						"idTelefone": 11,
						"numero": 996654321,
						"ddd": 51,
						"tipoTelefone": "RESIDENCIAL"
					}
				],
				"email": "novaes@example.com"
			},
			"genero": "FEMININO",
			"conselho": "CRO/SC",
			"registro": "1557",
			"codigoBrasileiroOcupacao": "132"
		}
	]
}
```
