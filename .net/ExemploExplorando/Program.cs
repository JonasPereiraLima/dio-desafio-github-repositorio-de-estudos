// See https://aka.ms/new-console-template for more information
using ExemploClasses.models;
using System.Globalization;

// ---------------------  Dicionário(Dictionary)  ---------------------
Dictionary<string, string> estados = new Dictionary<string, string>();
estados.Add("SP","São Paulo");
estados.Add("PE","Pernambuco");
estados.Add("BA","Bahia");
foreach(KeyValuePair<string,string> estado in estados)  // "KeyValuePair" no lugar disto, pode usar "var" para o programa reconhecer de forma automática.
{
  Console.WriteLine($"{estado.Key} - {estado.Value}");
}
// estados.Remove("BA");
estados["sp"] = "São Paulo - valor alterado";

string chave = "BA";
if(estados.ContainsKey(chave))
{
  Console.WriteLine($"Valor existente: {estados[chave]}");
}
else
{
  Console.WriteLine($"Valor não existe. É seguro adicionar a chave: {chave}");
}
// --------------------------------------------------------------------






// --------------------  Pilha(Stack)  ------------------------
// Stack<int> pilha = new();
// pilha.Push(1);
// pilha.Push(2);
// pilha.Push(3);
// pilha.Push(4);

// foreach(int item in pilha)
// {
//   Console.WriteLine(item);
// }

// Console.WriteLine($"Removendo o elemento do topo: {pilha.Pop()}");
// ------------------------------------------------------------





// -----------------------  Fila(Queue)  ---------------------
// Queue<int> fila = new();
// fila.Enqueue(2);
// fila.Enqueue(4);
// fila.Enqueue(6);
// fila.Enqueue(8);

// foreach(int item in fila)
// {
//   Console.WriteLine(item);
// }

// Console.WriteLine($"Removendo o elemento: {fila.Dequeue()}");
// ----------------------------------------------------






// --------------  Exceção  ----------------------------
// new ExemploExcecao().Metodo1();


// try
// {  
//   string[] linhas = File.ReadAllLines("arquivos/arquivoLeitura.txt");
//   foreach(string linha in linhas)
//   {
//     Console.WriteLine(linha);
//   }
// }
// catch(FileNotFoundException err)
// {

//   Console.WriteLine($"Ocorreu um erro na leitura do arquivo. Arquivo não encontrado. {err.Message}");
// }
// catch(DirectoryNotFoundException err)
// {
//   Console.WriteLine($"Ocorreu um erro na leitura do arquivo. Caminho da pasta não encontrado. {err.Message}");
// }
// catch (System.Exception err)
// {
//   Console.WriteLine($"Ocorreu uma exceção genérica: {err.Message}");
// }
// finally
// {
//   Console.WriteLine("Execução finalizada!");
// }
// ---------------------------------------------------






// ----------------  DateTime  ---------------------------
// DateTime data = DateTime.Now;
// Console.WriteLine(data.ToString("MM/dd/yyyy  HH:mm"));
// Console.WriteLine(data.ToShortDateString());
// Console.WriteLine(data.ToShortTimeString());

// DateTime data2 = DateTime.Parse("17/12/2023 18:00");
// Console.WriteLine(data2);

// string dataString = "2022-04-22 20:00";
// bool sucesso = DateTime.TryParseExact(dataString, "yyyy-MM-dd HH:mm", CultureInfo.InvariantCulture, DateTimeStyles.None, out DateTime data);
// DateTime data3 = DateTime.Parse(dataString);
// if(sucesso)
// {
//   Console.WriteLine(data);
// }
// else
// {
//   Console.WriteLine(dataString + " Não é uma data válida");
// }

// --------------------------------------------------------




// ----------------------  Formatações  -----------------------------------------
// CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("pt-BR");
// decimal valorMonetario = 82.40M;
// Console.WriteLine($"{valorMonetario:C}");
// Console.WriteLine($"{valorMonetario.ToString("N2")}");
// Console.WriteLine($"{valorMonetario.ToString("C", CultureInfo.CreateSpecificCulture("en-US"))}");
// double porcentagem = .3421;
// Console.WriteLine(porcentagem.ToString("P"));

// ------------------------------------------------------------------------------





// Pessoa p1 = new(name:"Jonas", lastName:"Pereira Lima", age:21);
// Pessoa p2 = new("Jonas^2", "Pereira Lima", 22);
// Curso cursoDeIngles = new();
// cursoDeIngles.Name = "Inglês";
// cursoDeIngles.Alunos = new List<Pessoa>();
// cursoDeIngles.AdicionarAluno(p1);
// cursoDeIngles.AdicionarAluno(p2);
// cursoDeIngles.ListarAlunos();









// Pessoa jonas = new Pessoa();
// jonas.Name = "Jonas";
// jonas.LastName = "Pereira Lima";
// jonas.Idade = 21;
// jonas.Apresentar();
