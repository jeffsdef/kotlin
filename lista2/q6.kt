fun main() {
    var soma = 0
    var contador = 0
    
    println("Digite as idades (digite -1 para encerrar):")
    
    while (true) {
        print("Idade: ")
        val idade = readln().toInt()
        
        if (idade == -1) break
        
        soma += idade
        contador++
    }
    
    if (contador > 0) {
        println("Média: ${soma.toDouble() / contador}")
    } else {
        println("Nenhuma idade inserida")
    }
}