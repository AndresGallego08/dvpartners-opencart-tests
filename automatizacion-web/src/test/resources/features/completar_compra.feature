#language:es
Característica: Proceso para completar compra

  Antecedentes:
    Dado que el usuario ingresa a la opción login
    Cuando ingresa las credenciales
      | emailAddress             | password |
      | andres_f0818@hotmail.com | 123456   |

  @completarCompra
  Escenario: el usuario completa la compra exitosamente
    Dado que el usuario ingresa a la opción Laptops & Notebooks
    Y el usuario ingresa a la opción Show All Laptops & Notebooks
    Cuando agrega el producto MacBook Pro al carrito
    Entonces el producto se agrega exitosamente al carrito Success: You have added
    Y el usuario busca el producto Samsung Galaxy Tab 10.1
    Cuando agrega el producto Samsung Galaxy Tab 10.1 al carrito
    Entonces el producto se agrega exitosamente al carrito Success: You have added
    Dado que el usuario ingresa a la opción Shopping Cart
    Y el usuario elimina del carrito el producto MacBook Pro
    Y agrega 1 unidad del producto Samsung Galaxy Tab 10.1
    Cuando el usuario completa la compra
    Entonces la compra es completada con exito Your order has been successfully processed!





