
@regressivo
Feature: Validar cep e endereco no site do correios

  Como usuario do correio
  Quero informar um cep ou endereco
  Para validar os dados de retorno

  @positivo
  Scenario: Realizar a busca do cep
    When enviar os dados para busca
    Then validar os dados retornado
 
 @positivo
 Scenario: Realizar a busca do endereco
    When enviar os dados para busca
    Then validar os dados retornado
    
 @negativo
 Scenario: Realizar a busca do cep com caracteres especiais
    But enviar os dados usando caracteres especiais
    Then valido mensagem de dados invalidos
    
 @negativo
 Scenario: Realizar uma busca sem preencher o campo
    When envio o campo sem preencher
    When envio novamente sem prencher no campo que fui direcionado
    Then valido mensagem com a quantidade de caracteres minimos
 
 

