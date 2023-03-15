package br.com.estudos.collectionsetmap.treino.map


fun main() {
    map2()
}

fun map2() {

    //Fazendo a adição de valores com to (Menos performático)
    val names: Map<Int, String> = mapOf<Int, String>(
        1 to "Kevin Richard",
        2 to "Luana",
        3 to "José"
    )

    //Formas de percorrer (forEach):
    names.forEach { name ->
        println(name)
    }

    println()

    //Formas de percorrer (for):
    for (name in names) {
        println(name)
    }


}