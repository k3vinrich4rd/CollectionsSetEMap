package br.com.estudos.collectionsetmap.mutable

fun mutableIterable() {

    //Não pode ser mutável por conta das suas características
    // de comportamento que a referência da lista obtém, no caso: (Mutable Iterable)
    //Serem muito genéricas e não possuir o método necessário para efetuar essa ação
    //Tradução: Mutável iterável

    val names: MutableIterable<String> = mutableListOf(
        "Kevin Richard",
        "Ketelyn Mayara",
        "Vilma Regiane",
        "Carlos Eduardo"
    )

   // names.add("Ted") - impossivel efetuar essa ação
   // names.add("Snoop") - impossivel efetuar essa ação

    names.forEach { name ->
        println(name)
    }
}