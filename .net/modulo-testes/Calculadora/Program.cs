// See https://aka.ms/new-console-template for more information
using Calculadora.services;

CalculadoraImplementação c = new();

int num1 = 5;
int num2 = 10;

Console.WriteLine($"{num1} + {num2} = {c.Somar(num1,num2)}");