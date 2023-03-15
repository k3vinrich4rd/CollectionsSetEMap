package br.com.estudos.collectionsetmap.mutable

fun mutableCollection() {

    //Pode ser mutável por conta das suas características
    // de comportamento que a referência da lista obtém, no caso: (Mutable Collection)
    //Tradução: Coleção Mutável

    val names: MutableCollection<String> = mutableListOf(
        "Kevin Richard",
        "Ketelyn Mayara",
        "Vilma Regiane",
        "Carlos Eduardo"
    )
    names.add("Ted")
    names.add("Snoop")
    names.add("Katia")

    names.forEach { name ->
        println(name)
    }
}