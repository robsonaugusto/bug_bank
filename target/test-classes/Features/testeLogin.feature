#language: pt
#encoding: UTF-8

@end2End
Funcionalidade: Login

  Contexto:
    Dado que esteja na tela do BugBank
    E faço o registro

  @testeAtual
  Cenario: Login no BugBank
    Quando realizo o login
    Entao devera ser apresentado na tela o texto "bem vindo ao BugBank :)"