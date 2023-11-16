const fs = require("fs");

// Forma alternativa para encontrar o caminho de um arquivo:
//const path = require("path");
//const filePath = path.resolve(__dirname, "tarefas.csv");
//const promessaDaLeituraArquivo = fs.promises.readFile("filePath");

const promessaDaLeituraArquivo = fs.promises.readFile("tarefas.csv");

promessaDaLeituraArquivo
  .then((arquivo) => arquivo.toString("utf-8"))
  .then((textoDoArquivo) => textoDoArquivo.split("\n").slice(1))
  .then((linhasSemCabecalho) => {
    return linhasSemCabecalho.map((linha) => {
      const [nome, feito] = linha.split(";");
      return {
        nome,
        feito: feito.trim() === "true",
      };
    });
  })
  .then((listaDeTarefas) => console.log(listaDeTarefas))
  .catch((err) => {
    console.log(err);
  })
  .finally(() => {
    console.log("Leitura finalizada!");
  });
