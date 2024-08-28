//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // CONCATENANDO DADOS

    print("Digite seu nome: ")
    val nome = readLine()
    print("Digite seu sobrenome: ")
    val sobrenome = readLine()
    val concatenar = nome + sobrenome
    println("Olá, $nome $sobrenome")

    // REPETINDO TEXTOS

    println("Digite uma palavra ")
    val palavra = readLine()
    print("Digite quantas vezes quer repeitir a palavra: ")
    val repetir = readLine()?.toInt()?: 0
    repeat(repetir){
        print("$palavra ")
    }

    // OPERAÇÕES MATEMÁTICAS SIMPLES

    println("Digite um número: ")
    val n1 = readLine()?.toIntOrNull() ?: 0
    print("Digite outro número: ")
    val n2 = readLine()?.toIntOrNull() ?: 0
    print("Digite um operador '+' '-' '*' ou '/' ")
    var operador = readLine().toString()
    if (operador == "+"){
        val soma = n1+n2
        println("resultado de $n1 $operador $n2 = $soma")
    }else if (operador == "-"){
        val subtracao = n1-n2
        println("resultado de $n1 $operador $n2 = $subtracao")
    }else if (operador == "*"){
        val multiplicacao = n1*n2
        println("resultado de $n1 $operador $n2 = $multiplicacao")
    }else if (operador == "/"){
        val divisao = n1/n2
        println("resultado de $n1 $operador $n2 = $divisao")
    }else{
        print("Operação inválida")
    }

    //VERIFICANDO NUMERO PAR OU ÍMPAR
    println("Digite um número ")
    val numero = readLine()?.toInt()
    if (numero != null) {
        if(numero % 2 == 0){
            println("$numero é par")
        }else if (numero % 2 == 1){
            println("$numero é ímpar")
        }else{
            println("dado inválido")
        }
    }

    // CALCULO MÉDIA

    println("Digite a primeira nota: ")
    val nota1 = readLine()?.toFloatOrNull()
    println("Digite a segunda nota: ")
    val nota2 = readLine()?.toFloatOrNull()
    println("Digite a terceira nota: ")
    val nota3 = readLine()?.toFloatOrNull()
    if (nota1 != null && nota2 != null && nota3 != null) {
        val media = (nota1 + nota2 + nota3)/3
        print("Sua média é $media")
    }else{
        print("Entrada inválida")
    }

    // PALÍNDROMO

    print("Digite uma palavra: ")
    val entrada = readLine()?.replace(" ", "")?.lowercase()

    if (entrada != null) {
        val inverso = entrada.reversed()
        if (entrada == inverso) {
            println("A palavra \"$entrada\" é um palíndromo.")
        } else {
            println("A palavra \"$entrada\" não é um palíndromo.")
        }
    } else {
        println("Entrada inválida.")
    }
}