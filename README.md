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
**Response Body:**
```json
[
	{
		"idRecepcionista": 1,
		"usuarioClinicaResponse": {
			"idUsuarioClinica": 1,
			"email": "recepcionista@gmail.com",
			"tipoProfissionalResponse": {
				"tipoProfissional": "Recepcionista"
			}
		},
		"nome": "Recepcionista",
		"contatoResponse": {
			"idContato": 6,
			"telefones": [
				{
					"idTelefone": 7,
					"numero": 975544633,
					"ddd": 21,
					"tipoTelefoneResponse": {
						"tipoTelefone": "Celular"
					}
				}
			],
			"email": "nena.moreira@example.com"
		},
		"generoResponse": {
			"genero": "Feminino"
		},
		"dentistasResponse": [
			{
				"idDentista": 1,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 2,
					"email": "aline@gmail.com",
					"tipoProfissionalResponse": {
						"tipoProfissional": "Dentista"
					}
				},
				"nome": "ALINE CASTRO E SOUZA",
				"contatoResponse": {
					"idContato": 10,
					"telefones": [
						{
							"idTelefone": 11,
							"numero": 996654321,
							"ddd": 51,
							"tipoTelefoneResponse": {
								"tipoTelefone": "Residencial"
							}
						}
					],
					"email": "novaes@example.com"
				},
				"generoResponse": {
					"genero": "Feminino"
				},
				"conselho": "CRO/SC",
				"registro": "1557",
				"codigoBrasileiroOcupacao": "132"
			},
			{
				"idDentista": 2,
				"usuarioClinicaResponse": {
					"idUsuarioClinica": 3,
					"email": "livia@gmail.com",
					"tipoProfissionalResponse": {
						"tipoProfissional": "Dentista"
					}
				},
				"nome": "LIVIA DOS SANTOS",
				"contatoResponse": {
					"idContato": 7,
					"telefones": [
						{
							"idTelefone": 8,
							"numero": 915459800,
							"ddd": 61,
							"tipoTelefoneResponse": {
								"tipoTelefone": "Celular"
							}
						}
					],
					"email": "herculano.dacosta@example.com"
				},
				"generoResponse": {
					"genero": "Feminino"
				},
				"conselho": "CRO/SC",
				"registro": "2334",
				"codigoBrasileiroOcupacao": "132"
			}
		]
	}
]
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
        "tipoProfissionalResponse": {
            "tipoProfissional": "Recepcionista"
        }
    },
    "nome": "Recepcionista",
    "contatoResponse": {
        "idContato": 6,
        "telefones": [
            {
                "idTelefone": 7,
                "numero": 975544633,
                "ddd": 21,
                "tipoTelefoneResponse": {
                    "tipoTelefone": "Celular"
                }
            }
        ],
        "email": "nena.moreira@example.com"
    },
    "generoResponse": {
        "genero": "Feminino"
    },
    "dentistasResponse": [
        {
            "idDentista": 1,
            "usuarioClinicaResponse": {
                "idUsuarioClinica": 2,
                "email": "aline@gmail.com",
                "tipoProfissionalResponse": {
                    "tipoProfissional": "Dentista"
                }
            },
            "nome": "ALINE CASTRO E SOUZA",
            "contatoResponse": {
                "idContato": 10,
                "telefones": [
                    {
                        "idTelefone": 11,
                        "numero": 996654321,
                        "ddd": 51,
                        "tipoTelefoneResponse": {
                            "tipoTelefone": "Residencial"
                        }
                    }
                ],
                "email": "novaes@example.com"
            },
            "generoResponse": {
                "genero": "Feminino"
            },
            "conselho": "CRO/SC",
            "registro": "1557",
            "codigoBrasileiroOcupacao": "132"
        }
    ]
}
```
