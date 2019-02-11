Feature: Yo como Usuario del reto
Quiero buscar en Facebok la palabra Mauricio
Pare ingresar a la pagina de Mauricio
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Busqueda Mauricio facebook
    Given Que el usuario estar logueado en Facebook
    |mau@vinpeca.com|elian2014|
    When El busque <nombre> en la barra de busqueda
    And Ingrese al perfil seleccionado
    Then El podra ver el <nombre> en perfil que ingreso
    
    Examples:
    |nombre|
    |mauricio nieto|
    
   
    
