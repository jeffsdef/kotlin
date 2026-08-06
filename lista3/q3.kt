fun main() {
    val notas = DoubleArray(10)

    println("Digite a nota de 10 alunos:")

    for (i in 0 until 10) {
        print("Nota do ${i + 1}º aluno: ")
        notas[i] = readln().toDouble()
    }

    var aprovados = 0
    var reprovados = 0
    var somaNotas = 0.0

    for (i in 0 until 10) {
        val nota = notas[i]

        if (nota >= 6.0) {
            aprovados++
        } else {
            reprovados++
        }

        somaNotas += nota
    }

    val mediaTurma = somaNotas / 10

    println("Estudantes aprovados: $aprovados")
    println("Estudantes reprovados: $reprovados")
    println("Média geral da turma: $mediaTurma")
}