//Funcion para derivar , me retorna un array con el objeto de resutlados
function integrar(iteral, exponente, coeficiente) {
  let arrayFuncion = [];
  const objetoFuncion = {
    iteral,
    exponente,
    coeficiente,
  };
  arrayFuncion.push(objetoFuncion);

  let funcionIntegrar = arrayFuncion.map((funcion) => {
    if (funcion.exponente === 0) {
      return "(" + funcion.coeficiente + funcion.iteral + ")" + "+ C";
    }

    if (funcion.exponente < 0) {
      return (
        "(" +
        (funcion.coeficiente = -funcion.coeficiente) +
        "/" +
        funcion.iteral +
        ") " +
        "+ C"
      );
    }

    if (funcion.exponente > 0) {
      funcion.exponente = funcion.exponente + 1;
      return (
        "(" +
        funcion.coeficiente +
        funcion.iteral +
        "^" +
        funcion.exponente +
        "/" +
        (funcion.denominador = funcion.exponente) +
        ") " +
        "+ C"
      );
    }
  });

  return funcionIntegrar;
}

//Iteral, exponente, coeficiente
console.log(integrar("x", 0, 4));
