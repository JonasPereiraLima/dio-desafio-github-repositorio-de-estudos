/*
  1 - Crie uma classe para representar carros.
  Os carros possuem uma marca, uma cor e um gasto médio de combustível por kilômetro rodado.
  Crie um método que dado a quantidade de kilômetros e o preço do combustível nos dê o valor gasto em reais para realizar este percurso.

*/

class Carro {
  marca;
  cor;
  kmPorLitro;
  gastoMedioPorKm;
  constructor(marca, cor, kmPorLitro) {
    this.marca = marca;
    this.cor = cor;
    this.kmPorLitro = kmPorLitro;
    this.gastoMedioPorKm = 1 / kmPorLitro;
  }

  gastoViagem(distanciaKm, precoCombustivel) {
    return this.gastoMedioPorKm * distanciaKm * precoCombustivel;
  }
}

const meuCarro = new Carro("Gol", "Black", 10);
console.log(
  `Vou gastar R$ ${meuCarro.gastoViagem(100, 5.87).toFixed(2)} nesta viagem`
);
