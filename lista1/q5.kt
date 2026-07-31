fun main(){
    
    println("Digite a base do retângulo: ")
    val b = readln().toInt()
    
    println("Digite a altura do retângulo: ")
    val h = readln().toInt()
    
    val a = b * h
    val p = (2 * b) + (2  * h)
    
    println("Altura: $a, Perímetro: $p")
}
