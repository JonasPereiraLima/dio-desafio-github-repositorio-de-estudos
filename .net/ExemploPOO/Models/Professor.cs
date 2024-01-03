using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploPOO.Models
{
    public class Professor : Pessoa
    {
        public Professor(string name, int idade) : base(name, idade)
        {
        }

        public decimal Salario { get; set; }

        public sealed override void Apresentar()
        {
            Console.WriteLine($"Olá, meu nome é {Name}, tenho {Idade} anos, e o meu salário é: {Salario}.");
        }
    }
}