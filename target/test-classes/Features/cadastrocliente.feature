#Author: tainapadalino@outlook.com

@all
Feature: Cadastrar um novo usuario
  Como usuario quero realizar o cadastro para comprar
  
  Background: Acessar sistema
  Given que entre no site "http://advantageonlineshopping.com/#/"
  And acesso o formulario de abertura de conta
  
  @ctpositivocadastro
  Scenario: Cadastrar novo usuario
    When preencho dados validos de cadastro
    Then cadastro realizado
    
     @ctnegativocadastro
  Scenario: Cadastrar usuario invalido
    When preencho dados invalidos
    Then nao realiza cadastro
    
    