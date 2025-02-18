$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/completar_compra.feature");
formatter.feature({
  "name": "Proceso para completar compra",
  "description": "",
  "keyword": "Característica"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que el usuario ingresa a la opción login",
  "keyword": "Dado "
});
formatter.match({
  "location": "FormularioRegistroSteps.queElUsuarioIngresaAlFormularioDeRegistro(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa las credenciales",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password"
      ]
    },
    {
      "cells": [
        "andres_f0818@hotmail.com",
        "123456"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "LoginSteps.ingresaLasCredenciales(TestData\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "el usuario completa la compra exitosamente",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@completarCompra"
    }
  ]
});
formatter.step({
  "name": "que el usuario ingresa a la opción Laptops \u0026 Notebooks",
  "keyword": "Dado "
});
formatter.match({
  "location": "FormularioRegistroSteps.queElUsuarioIngresaAlFormularioDeRegistro(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ingresa a la opción Show All Laptops \u0026 Notebooks",
  "keyword": "Y "
});
formatter.match({
  "location": "FormularioRegistroSteps.queElUsuarioIngresaAlFormularioDeRegistro(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrega el producto MacBook Pro al carrito",
  "keyword": "Cuando "
});
formatter.match({
  "location": "CompletarCompraSteps.agregarProductoDesdedListadoDeProductos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el producto se agrega exitosamente al carrito Success: You have added",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CompletarCompraSteps.puedeVerElTexto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario busca el producto Samsung Galaxy Tab 10.1",
  "keyword": "Y "
});
formatter.match({
  "location": "CompletarCompraSteps.buscarAgragarProductoAlCarrito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrega el producto Samsung Galaxy Tab 10.1 al carrito",
  "keyword": "Cuando "
});
formatter.match({
  "location": "CompletarCompraSteps.agregarProductoDesdedListadoDeProductos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el producto se agrega exitosamente al carrito Success: You have added",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CompletarCompraSteps.puedeVerElTexto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "que el usuario ingresa a la opción Shopping Cart",
  "keyword": "Dado "
});
formatter.match({
  "location": "FormularioRegistroSteps.queElUsuarioIngresaAlFormularioDeRegistro(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario elimina del carrito el producto MacBook Pro",
  "keyword": "Y "
});
formatter.match({
  "location": "CompletarCompraSteps.eliminarProductoDelCarrito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrega 1 unidad del producto Samsung Galaxy Tab 10.1",
  "keyword": "Y "
});
formatter.match({
  "location": "CompletarCompraSteps.modificarCantidadProducto(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario completa la compra",
  "keyword": "Cuando "
});
formatter.match({
  "location": "CompletarCompraSteps.completarCompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "la compra es completada con exito Your order has been successfully processed!",
  "keyword": "Entonces "
});
formatter.match({
  "location": "CompletarCompraSteps.mensajeCompraExitosa(String)"
});
formatter.result({
  "status": "passed"
});
});