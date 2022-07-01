#language: es

Característica: Calculadora
  Yo , como usuario
  Quiero,  realizar  ingresar números  y realizara operaciones matematicas
  Para ver todos los resultados
  @test
  Escenario: Suma de números
    Dado que me encuentro en la pagina de Basic Calculator
    Cuando ingreso First number "5", Second number "6", selecciono el operation "Add"
    Entonces valido que debería aparecer el resultado
