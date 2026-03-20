#language: pt


@cadastro
Funcionalidade: Cadastro de usuario

  Contexto: Acessar tela de login
    Dado que estou na tela de Cadastro

  @Cadastro1
  Cenario:Registrar novo usuario com sucesso

    Quando eu preencho o formulario
    E clico em registrar
    Entao vejo a mensagem de cadastro realizado com sucesso

  @Cadastro2
  Cenario:Registrar novo usuario sem Email
    Quando eu preencho o formulario nome "Felipe" e email "felipebiaze" e senha "1234"
    E clico em registrar
    Entao vejo a mensagem de "O campo e-mail deve ser prenchido corretamente"

  @Cadastro3
  Cenario:Registrar novo usuario sem nome
    Quando eu preencho o formulario nome "" e email "felipebiaze@teste.com.br" e senha "1234"
    E clico em registrar
    Entao vejo a mensagem de "O campo nome deve ser prenchido"

  @Cadastro4
  Cenario:Registrar novo usuario senha invalida
    Quando eu preencho o formulario nome "Felipe" e email "felipebiaze@teste.com.br" e senha "123"
    E clico em registrar
    Entao vejo a mensagem de "O campo senha deve ter pelo menos 6 dígitos"

  @Cadastro6
  Cenario:Registrar novo usuario senha invalida
    Quando eu preencho o formulario nome "Felipe" e email "felipebiaze@gmail.com.br" e senha "123"
    E clico em registrar
    Entao vejo a mensagem de "O campo senha deve ter pelo menos 6 dígitos"



  @Cadastro5
  Esquema do Cenario: Validar <teste>
    Quando eu preencho o formulario nome "<user>" e email "<email>" e senha "<password>"
    E clico em registrar
    Entao vejo a mensagem de "<message>"

    Exemplos:
      | teste          | user   | email               | password  | message                                        |
      | Email invalido | Felipe | felipeteste         | 456789123 | O campo e-mail deve ser prenchido corretamente |
      | Nome vazio     |        | felipe@teste.com.br | 456789123 | O campo nome deve ser prenchidos                |
      | Senha invalida | Felipe | felipe@teste.com.br | 456       | O campo senha deve ter pelo menos 6 dígitos    |



