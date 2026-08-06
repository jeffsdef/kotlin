fun main() {
    val numeros = IntArray(10)

    println("Digite 10 números inteiros:")

    for (i in 0 until 10) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readln().toInt()
    }

    var menor = numeros[0]
    var maior = numeros[0]
    var soma = 0

    for (i in 0 until 10) {
        val valor = numeros[i]

        if (valor < menor) {
            menor = valor
        }

        if (valor > maior) {
            maior = valor
        }

        soma += valor
    }

    val media = soma / 10
    println("Menor valor digitado: $menor")
    println("Maior valor digitado: $maior")
    println("Média dos valores digitados: $media")
}