const sortearNumero = new Promise((resolve, reject) => {
  setTimeout(() => {
    const numero = parseInt(Math.random() * 100);
    resolve(numero);
  }, 2000);
});

sortearNumero
  .then((value) => {
    console.log(value);
  })
  .catch((err) => {
    console.log(err);
  })
  .finally(() => {
    console.log("Finalizou!");
  });
