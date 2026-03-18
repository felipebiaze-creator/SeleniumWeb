# language: pt

  Funcionalidade: Receber o cupom de desconto da qazando
    Eu como usuario da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

  @gerar-cupom
  Cenário: Visualizar código de desconto
    Dado que estou no site da qazando
    Quando eu preencho meus dados
    E clico no botão de login2
    Então  eu vejo o código de desconto

  @gerar-falha
  Cenario: Cupom invalido
    Dado que tenho um cupom gerado
    Quando eu falho
