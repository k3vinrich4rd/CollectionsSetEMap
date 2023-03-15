package br.com.estudos.collectionsetmap.treino.map

fun main() {
    groupBy2()
}

fun groupBy2() {

    val names = listOf(
        "Kevin Richard",
        "Kátia",
        "Roberto Carlos",
        "Tim Maia",
        "Erasmo Carlos"
    )

    val agenda: Map<Char, List<String>> = names.groupBy { name ->
        name.first()
    }
    println(agenda)
    println(agenda['K'])

}