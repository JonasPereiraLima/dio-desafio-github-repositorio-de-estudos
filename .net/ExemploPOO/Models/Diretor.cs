using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploPOO.Models
{
    public class Diretor : Professor
    {
        public Diretor(string name, int idade) : base(name, idade)
        {
        }

        // public override void Apresentar()
        // {
        //     Console.WriteLine($"Diretor");
        // }
    }
}