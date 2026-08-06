fun main() {
    print("Digite o 1º número: ")
    val primeiro = readln().toDouble()
    
    var menor = primeiro

    for (i in 2..10) {
        print("Digite o ${i}º número: ")
        val numero = readln().toDouble()
        
        if (numero < menor) {
            menor = numero
        }
    }

    println("O menor número digitado foi: $menor")
}