fun main(){
    
    println("Digite um número: ")
    val n1 = readln().toInt()
    
    println("Digite outro número: ")
    val n2 = readln().toInt()
    
    if(n1 > n2){
        println("O número $n1 é maior que $n2.")
    }else if(n2 > n1){
        println("O número $n2 é maior que $n1")
    }else{
        println("Os números digitados são iguais.")
    }
}
