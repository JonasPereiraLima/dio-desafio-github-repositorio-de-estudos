/*
  Uma sala contém 5 alunos e para cada aluno foi sorteado um número de 1 - 100.
  Faça um programa que receba os 5 números sorteados para os alunos e mostre o maior número sorteado.

  Dados de entrada:
  5
  50
  10
  98
  23

  saída:
  98

*/

const { get, print } = require("./funcoes");

let maior;

for (let i = 0; i < 5; i++) {
  const numero = get();
  if (i === 0) maior = numero;
  else if (numero > maior) maior = numero;
}

print(maior);
