package br.com.estudos.collectionsetmap.set

//Não repete os mesmos valores dentro de uma lista
fun set() {
    val names = setOf(
        "Kevin Richard",
        "Kevin Richard",
        "Ketelyn Mayara",
        "Carlos Eduardo"
    )

    names.forEach { name ->
        println(name)
    }

    println()
    for (name in names){
        println(name)
    }

    println("Tamanho da lista: ${names.size}")
}