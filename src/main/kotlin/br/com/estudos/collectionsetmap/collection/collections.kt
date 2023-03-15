package br.com.estudos.collectionsetmap.collection

//Referencia genérica (read only)
fun collections() {
    val names: Collection<String> = mutableListOf(
        "Kevin",
        "Ketelyn",
        "Vilma",
        "Eduardo",
        "Eduardo"
    )

    for (name in names) {
        println(name)
    }
    println("\nSize the list: ${names.size}")
}