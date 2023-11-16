const lista = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100];

lista.forEach((v, i, a) => console.log(v, i));

const filtro = lista.filter((v, i, a) => v > 50);
console.log(filtro);

const novaLista = lista.map((v, i) => (v > 50 ? v * i : v));
console.log(novaLista);

const somaLista = lista.reduce((x, y) => x + y, 0);
console.log(somaLista);

console.log(lista.join("/"));
