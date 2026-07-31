fun main(){
    println("Digite seu peso: ")
    val p = readln().toFloat()

    println("Digite sua altura: ")
    val a = readln().toFloat()

    val imc = p / (a * a)
    println("Seu IMC é: $imc")
}