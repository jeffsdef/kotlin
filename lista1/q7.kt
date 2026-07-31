fun main() {
    println("Digite um número: ")
    val n1 = readln().toInt()

    println("Digite outro número: ")
    val n2 = readln().toInt()

    println("""
    Escolha uma operação:
    1 - SOMA
    2 - SUBTRAÇÃO
    3 - MULTIPLICAÇÃO
    4 - DIVISÃO
    """)

    val opc = readln().toInt()

    val r = when (opc) {
        1 -> n1 + n2
        2 -> n1 - n2
        3 -> n1 * n2
        4 -> {
            if (n2 == 0) {
                println("Erro: divisão por zero")
                return
            }
            n1 / n2
        }
        else -> {
            println("Opção inválida")
            return
        }
    }

    println("Resultado: $r")
}