package br.com.estudos.collectionsetmap.iterable

//Referencia genérica (read only)
fun iterable() {
    val names: Iterable<String> = listOf(
        "Kevin Richard",
        "Ketelyn Mayara",
        "Vilma Regiane",
        "Carlos Eduardo"
    )


    names.forEach { name ->
        println(name)
    }

    println("Tem o nome Kevin Richard? ${names.contains("Kevin Richard")}")
}