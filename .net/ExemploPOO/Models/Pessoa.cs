using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Metadata.Ecma335;
using System.Threading.Tasks;

namespace ExemploPOO.Models
{
    public class Pessoa
    {
        public Pessoa(string name, int idade)
        {
            this.Name = name;
            this.Idade = idade;
        }
        public string Name { get; set; }
        public int Idade { get; set; }
        

        public virtual void Apresentar()
        {
            Console.WriteLine($"Hello! My name's {Name} and i'm {Idade} years.");
        }
    }
}