fun main(){
    var soma = 0.0

    for (i in 1..10){
        println("Digite a altura da ${i}ª pessoa em metros: ")
        var altura = readln().toDouble()
        soma += altura
    }

    var media = soma / 10
    println("A média das alturas é: $media metros")
}