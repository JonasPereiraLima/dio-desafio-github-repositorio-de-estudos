using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExemploClasses.models
{
    public class Pessoa
    {
        public Pessoa(string name, string lastName, int age)
        {
            this.Name = name;
            this.LastName = lastName;
            this.Age = age;
        }

        private string _name;
        private int _age;
        public string Name 
        {
            get => _name.ToUpper();
            
            set
            {
                if(value == "")
                {
                    throw new ArgumentException("O nome não pode ser vazio.");
                }
                _name = value;
            } 
        }

        public string LastName { get; set; }
        public string FullName => $"{Name} {LastName}".ToUpper();
        public int Age 
        { 
            get => _age;
            set
            {
                if(value < 0)
                {
                    throw new ArgumentException("A idade não pode ser menor que zero.");
                }

                _age = value;
            } 
        
        }

        public void Apresentar()
        {
            Console.WriteLine($"Nome: {FullName}, Idade: {Age}");
            
        }
    }
}