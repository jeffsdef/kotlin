fun main() {
    val numeros = IntArray(10)

    println("Digite 10 números inteiros:")

    for (i in 0 until 10) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readln().toInt()
    }

    var soma = 0
    for (i in 0 until 10) {
        soma += numeros[i]
    }

    println("\nA soma dos números digitados é: $soma")
}