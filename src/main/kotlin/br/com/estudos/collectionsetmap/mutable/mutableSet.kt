package br.com.estudos.collectionsetmap.mutable

//Não repete os mesmos valores dentro de uma lista
fun mutableSet() {
    val names: MutableSet<String> = mutableSetOf(
        "Richard",
        "Richard",
        "Richard",
        "Mayara",
        "Mayara",
        "Mayara",
        "Regiane",
        "Regiane",
        "Regiane",
    )

    names.add("Candido")
    names.add("Candido")
    names.add("Candido")

    names.forEach { name ->
        println(name)
    }
}