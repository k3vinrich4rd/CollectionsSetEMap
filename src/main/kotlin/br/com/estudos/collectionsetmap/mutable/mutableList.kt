package br.com.estudos.collectionsetmap.mutable

fun mutableList() {

    //Pode ser mutável por conta das suas características
    // de comportamento que a referência da lista obtém no caso (Mutable list)
    //Tradução: Lista Mutável

    val names: MutableList<String> = mutableListOf(
        "Kevin Richard",
        "Ketelyn Mayara",
        "Vilma Regiane",
        "Carlos Eduardo"
    )
    names.add("Ted")
    names.add("Snoop")

    names.forEach { name ->
        println(name)
    }
}
