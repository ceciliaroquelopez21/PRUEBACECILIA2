#language: es
@web
Característica: Demo Form (#1)
  Demo Form es un formulario WEB UI ejemplo para fines de entrenamiento
  Por favor ver (https://demoqa.com/automation-practice-form)

  -- DESCRIPCION --
  Para este ejercicio, es nesario ingresar a la página 'demoqa' para conocer el comportamiento esperado por el escenario.
  - Navega, analiza e inspecciona los elementos (localizadores) si hace falta.
  - Tomar en cuenta las indicaciones numeradas.
  - Resolver los errores de compilación y ejecución hasta completar correctamente el escensario.
  - Analiza el código actual y valida si puedes reutilizarlo, de lo contratio,
    sientete libre de programar y agregar código si lo consideras necesario

  1) Es necesario completar el escenario para verificar el envio del formulario con los campos minimos
  2) Refactorizar el siguiente escenario para soportar más de un caso
  3) Refactorizar el comportamiento del escenario de imperativo a declarativo

  @caso1
  Escenario: enviar el formulario con lo minimo requerido
    Dado el usuario DefaultUser
    Cuando visita la pagina PracticeFormPage
    # How you would refactor next steps in order to get a declarative step
    Y completa "First Name" con "juan"
    Y completa "Last Name" con "perez"
    Y completa "Mobile Number" con "1234567890"
    Y hace clic en "submit"
    Entonces en la pagina debería mostrarse
    """
    Thanks for submitting the form
    """