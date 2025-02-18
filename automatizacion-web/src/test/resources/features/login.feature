#language:es
Característica: Inicio de sesión y restablecimiento de contraseña

  @LoginExitoso
  Escenario: Iniciar sesión exitosamente
    Dado que el usuario ingresa a la opción login
    Cuando ingresa las credenciales
      | emailAddress             | password |
      | andres_f0818@hotmail.com | 123456   |
    Entonces puede ver el texto My Orders

  @recuperarPassword
  Escenario: Recuperar contraseña
    Dado que el usuario ingresa a la opción recuperar contraseña
    Cuando ingresa el correo
      | emailAddress             |
      | andres_f0818@hotmail.com |
    Entonces se envia el correo de reestablecimiento An email with a confirmation link has been sent your email address.




