//Funcion para derivar , me retorna un array con el objeto de resutlados
function derivada(iteral, exponente, coeficiente) {
  let arrayFuncion = [];
  const objetoFuncion = {
    iteral,
    exponente,
    coeficiente,
  };
  arrayFuncion.push(objetoFuncion);

  let funcionDerivada = arrayFuncion.map((funcion) => {
    if (funcion.exponente === 0) {
      return 0;
    } else {
      funcion.coeficiente *= exponente;
      funcion.exponente -= 1;

      if (funcion.exponente === 0) {
        return funcion.coeficiente;
      }
      return funcion.coeficiente + funcion.iteral + "^" + funcion.exponente;
    }
  });

  return funcionDerivada;
}

//Iteral, exponente, coeficiente
console.log(derivada("x", 4, 2));
