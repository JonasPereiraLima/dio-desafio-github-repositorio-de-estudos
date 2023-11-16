function somar(x) {
  return function (y) {
    return x + y;
  };
}

const valorX = somar(10);

console.log(valorX(20));
console.log(valorX(30));
console.log(valorX(40));

// Formas de chamar uma função usando um objeto

const pessoa = {
  nome: "Jonas",
  idade: 21,
};

function gritar(prefixo) {
  console.log(prefixo, this.nome);
}

gritar.apply(pessoa, ["Olaaaaa"]);
gritar.call(pessoa, "Olaaaaaaaaaaaa");

// Usar uma função como parâmetro

function adicao(x, y) {
  return x + y;
}

function multiplicacao(x, y) {
  return x * y;
}

function calcular(x, operacao, y) {
  return operacao(x, y);
}

console.log(calcular(10, multiplicacao, 20));
