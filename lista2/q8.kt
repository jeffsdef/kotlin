fun main() {
    var quantPares = 0

    println("Digite números inteiros (digite 0 para encerrar):")

    while (true) {
        print("Número: ")
        val numero = readln().toInt()

        if (numero == 0) break

        if (numero % 2 == 0) {
            quantPares++
        }
    }

    println("Quantidade de números pares digitados: $quantPares")
}