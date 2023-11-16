// Orientação a protótipo

const pessoa = {
  genero: "Masculino",
};

// pessoa.__proto__

//const jonas = Object.create(pessoa); // ! Faz a mesma coisa que usar o "__proto__" logo a baixo

const jonas = {
  nome: "Jonas",
  idade: 21,
  __proto__: pessoa, // faz o objeto "jonas" herdar os atributos do objeto "pessoa"
};

console.log(jonas.genero);

// Funções construtoras.

function Pessoa(nome, idade) {
  this.nome = nome;
  this.idade = idade;
}

Pessoa.prototype.falar = function () {
  console.log(`Meu nome é ${this.nome}`);
};

const jonass = new Pessoa("Jonas", 21);
jonass.falar();
console.log(jonass);

// Usando o método "call".

const neto = {
  genero: "Masculino",
};

Pessoa.call(neto, "Francisco", 20);

console.log(neto);
