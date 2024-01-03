using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploPOO.Models
{
    public class ContaCorrente
    {
        public ContaCorrente(int numeroConta, decimal saldo)
        {
            this.NumeroConta = numeroConta;
            this.saldo = saldo;
        }
        public int NumeroConta { get; set; }
        private decimal saldo;

        public void Sacar(decimal valor)
        {
            if(saldo >= valor)
            {
                saldo -= valor;
                Console.WriteLine("Saque realizado!");
            }
            else
            {
                Console.WriteLine($"Saldo insuficiente para realizar o saque! saldo disponivel: {saldo}");
            }
        }
    }
}