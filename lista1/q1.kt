fun main(){
    println("Digite seu ano de nascimento:")
    val anoNasc = readln().toInt()
    
    println("Digite o ano atual:")
    val anoAtual = readln().toInt()
    
    val idade = anoAtual - anoNasc
    println("Sua idade é: $idade")
}
