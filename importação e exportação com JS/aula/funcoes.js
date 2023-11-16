const numerosSorteados = [5, 50, 10, 98, 23];

let i = 0;

function get() {
  const valor = numerosSorteados[i];
  i++;
  return valor;
}

function print(texto) {
  console.log(texto);
}

module.exports = { get, print };
