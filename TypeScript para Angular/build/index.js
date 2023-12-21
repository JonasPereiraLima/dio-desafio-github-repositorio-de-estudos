const contaBancaria = {
  nomeCliente: "João",
  saldo: 1000.0,
};

function realizarOperacao() {
  const opcao = parseInt("1");

  switch (opcao) {
    case 1:
      const valorDeposito = parseFloat("500.58");
      contaBancaria.saldo += valorDeposito;
      console.log("Operação de depósito concluída.");
      console.log(`Saldo atual: R$ ${contaBancaria.saldo.toFixed(2)}`);
      break;
    case 2:
      const valorSaque = 200.6;
      if (contaBancaria.saldo >= valorSaque) {
        contaBancaria.saldo -= valorSaque;
      } else {
        console.log("Saldo insuficiente. Operação de saque cancelada.");
        console.log(`Saldo atual: R$ ${contaBancaria.saldo.toFixed(2)}`);
      }
  }
}

realizarOperacao();
