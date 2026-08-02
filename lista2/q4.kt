fun main() {
    print("Digite o 1º número: ")
    val primeiro = readln().toDouble()
    
    var maior = primeiro

    for (i in 2..10) {
        print("Digite o ${i}º número: ")
        val numero = readln().toDouble()
        
        if (numero > maior) {
            maior = numero
        }
    }

    println("O maior número digitado foi: $maior")
}