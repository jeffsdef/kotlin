fun main(){
    println("Digite a altura 1: ")
    val altura1 = readln().toFloat()
    
    println("Digite a altura 2: ")
    val altura2 = readln().toFloat()
    
    println("Digite a altura 3: ")
    val altura3 = readln().toFloat()
    
    val media = (altura1 + altura2 + altura3) / 3
    println("A média de altura é: $media")
}
