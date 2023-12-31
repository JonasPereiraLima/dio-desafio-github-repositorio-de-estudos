// See https://aka.ms/new-console-template for more information

using exemploFundamentos.models;




List<string> listaString = new List<string>();
listaString.Add("Jonas");
listaString.Add("Pereira");
listaString.Add("Lima");

foreach(string nome in listaString)
{
  Console.Write(nome + " ");
}





// int[] arrayInteiros = new int[3];
// arrayInteiros[0] = 25;
// Array.Resize(ref arrayInteiros, arrayInteiros.Length*2);
// int[] arrayInteirosDobrado = new int[arrayInteiros.Length*2];
// Array.Copy(arrayInteiros, arrayInteirosDobrado, arrayInteiros.Length);

// foreach(int valor in arrayInteiros)
// {
//   Console.WriteLine(valor);
// }





// string opcao;
// bool showMenu = true;
// while(showMenu)
// {
//   opcao = Console.ReadLine();

//   switch(opcao)
//   {
//     case "1":
//       Console.WriteLine("digitou 1");
//       break;
//     case "0":
//       Console.WriteLine("Encerrar");
//       showMenu = false;
      // Environment.Exit(0); // PARA ENCERRAR O PROGRAMA
//       break;
//     default:
//       Console.WriteLine("Opção inválida");
//       break;
//   }
// }






// int soma = 0, numero = 0;
// do
// {
//   Console.WriteLine("Digite um nº: ");
//   numero = Convert.ToInt32(Console.ReadLine());
//   soma+=numero;
// }while(numero != 0);
// Console.WriteLine(soma);

// int c = 0;
// while(c < 10)
// {
//   Console.WriteLine($"{c} x 9 = {c*9}");
//   c++;
// }

// for(int i = 0; i < 10; i++)
// {
//   Console.WriteLine($"{i} x 10 = {i * 10}");
// }





// Calculadora calculadora = new Calculadora();
// calculadora.Somar(1, 2);
// calculadora.Subtrair(10, 5);
// calculadora.Multiplicar(2,5);
// calculadora.Dividir(10,5);
// calculadora.Potencia(3, 3);
// calculadora.Seno(80);
// calculadora.Coseno(80);
// calculadora.Tangente(30);
// calculadora.RaizQuadrada(4);

// int numero = 10;
// Console.WriteLine(numero);
// numero++;
// Console.WriteLine(numero);
// numero--;
// Console.WriteLine(numero);





// bool rained = false;
// bool isAfternoon = false;
// if(!rained && !isAfternoon)
// {
//   Console.WriteLine("Vou pedalar.");
// }
// else
// {
//   Console.Write("Vou pedalar outro dia.");
// }




// double media = 8.0;
// bool possuiPresencaMinima = true;
// if(media >= 7  && possuiPresencaMinima)
// {
//   Console.WriteLine("Aprovado!");
// }
// else
// {
//   Console.WriteLine("Reprovado!");
// }




// bool ehMaiorDeIdade = false;
// bool possuiAutorizacaoDoResponsavel = true;
// if(ehMaiorDeIdade || possuiAutorizacaoDoResponsavel)
// {
//   Console.WriteLine("Entrada autorizada.");
// }
// else
// {
//   Console.WriteLine("Entrada negada.");
// }




// string letra = Console.ReadLine();
// bool isVowel = false;
// switch(letra)
// {
//   case "a":
//   case "e":
//   case "i":
//   case "o":
//   case "u":
//     Console.WriteLine("Vogal");
//     break;
//   default:
//     Console.WriteLine("Não é vogal");
//     break;
// }





// int quantidadeEmEstoque = 10;
// int quantidadeCompra = 4;
// if(quantidadeEmEstoque >= quantidadeCompra)
// {
//   Console.WriteLine("Venda realizada!");
// }
// else
// {
//   Console.WriteLine("Não temos a quantidade desejada em estoque!");
// }




// Pessoa p = new Pessoa();
// p.Nome = "Jonas";
// p.Idade = 21;
// p.Apresentar();




// double altura = 1.80;
// decimal preco = 3.80M;
// Console.WriteLine(altura.ToString("0.00"));
// Console.WriteLine(preco);




// DateTime dataAtual = DateTime.Now;
// Console.WriteLine(dataAtual.ToString("dd/MM/yyyy HH:mm"));




// string n0 = "5";
// int n1 = Convert.ToInt32("5");
// int n2 = int.Parse("5");
// int n3 = 0;
// int.TryParse(n0, out int n3); // tenta converter o valor de n3
// Console.WriteLine(n3);