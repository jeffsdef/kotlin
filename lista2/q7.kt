fun main() {
    var maior: Int? = null
    var menor: Int? = null

    println("Digite números inteiros (digite -1 para encerrar):")

    while (true) {
        print("Número: ")
        val numero = readln().toInt()

        if (numero == -1) break

        if (maior == null || numero > maior) {
            maior = numero
        }
        if (menor == null || numero < menor) {
            menor = numero
        }
    }

    if (maior != null && menor != null) {
        println("Maior número digitado: $maior")
        println("Menor número digitado: $menor")
    } else {
        println("Nenhum número válido foi digitado.")
    }
}