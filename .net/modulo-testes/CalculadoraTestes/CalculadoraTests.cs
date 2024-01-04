using Calculadora.services;

namespace CalculadoraTestes;

public class CalculadoraTests
{
    private CalculadoraImplementação _calc;
    

    public CalculadoraTests()
    {
        _calc = new CalculadoraImplementação();
    }
    [Fact]
    public void DeveSomar5Com10ERetornar15()
    {
        //* arrange
        int num1 = 5;
        int num2 = 10;
        //* act
        int resultado = _calc.Somar(num1, num2);
        //* assert
        Assert.Equal(15, resultado);
    }

    [Fact]
    public void DeveSubtrair20De50ERetornar30()
    {
        int num1 = 50;
        int num2 = 20;

        int resultado = _calc.Subtrair(num1,num2);

        Assert.Equal(30, resultado);

    }

    [Fact]
    public void DeveVerificarSeONumero10EParERetornarVerdadeiro()
    {
        int num = 10;

        bool resultado = _calc.EhPar(num);

        Assert.True(resultado);
    }

    [Theory]
    [InlineData(2)]
    [InlineData(4)]
    [InlineData(6)]
    [InlineData(8)]
    [InlineData(10)]
    public void DeveVerificarSeOsNumerosSaoParesERetornarVerdadeiro(int num)
    {
        bool resultado = _calc.EhPar(num);

        Assert.True(resultado);
    }

    [Theory]
    [InlineData(new int[] {1, 3})]
    [InlineData(new int[] {5, 7, 9})]
    public void DeveVerificarSeOsNumerosSaoParesERetornarFalso(int[] numeros)
    {
        // Act / Assert
        Assert.All(numeros, num => Assert.False(_calc.EhPar(num)));
    }
}