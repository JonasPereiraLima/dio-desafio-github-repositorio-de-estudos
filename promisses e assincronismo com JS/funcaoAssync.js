const fs = require("fs");

const path = require("path");
const filePath = path.resolve(__dirname, "tarefas.csv");

async function buscarArquivo() {
  try {
    const arquivo = await fs.promises.readFile(filePath);
    const conteudoDoArquivo = arquivo.toString("utf-8").split("\n").slice(1);
    const listaDeTarefas = conteudoDoArquivo.map((linha) => {
      const [nome, feito] = linha.split(";");
      return {
        nome,
        feito: feito.trim() === "true",
      };
    });
    console.log(listaDeTarefas);
  } catch (err) {
    console.log("error: " + err);
  } finally {
    console.log("Finalizando!");
  }
}

buscarArquivo();
