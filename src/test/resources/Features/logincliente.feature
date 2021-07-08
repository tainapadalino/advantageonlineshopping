#Author: tainapadalino@outlook.com

@all
Feature: Login
  Como usuario quero fazer login na pagina
  
  Background: Acessar sistema
  Given que entre no site "http://advantageonlineshopping.com/#/"
  And acesso o login
  
  @ctpositivo
  Scenario: Login valido
  When preencho os dados validos
  Then cadastro realizado
    
    @ctnegativo
  Scenario: Login invalido
  When preencho os dados invalidos
  Then usuario ou senha invalidos
    
    
    
    