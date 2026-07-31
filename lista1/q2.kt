fun main(){
    
    println("Digite um número: ")
    val numero = readln().toInt()
    
    if(numero % 2 == 0){
        println("O número $numero é par")
    }else{
        println("O número $numero é ímpar")
    }
}
