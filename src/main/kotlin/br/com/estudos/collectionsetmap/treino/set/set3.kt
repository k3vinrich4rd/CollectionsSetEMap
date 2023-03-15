package br.com.estudos.collectionsetmap.treino.set

fun set3() {
    //Impossibilita a repetição de elementos
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()
    //Outra forma de se fazer a mesma coisa:
    assistiramAmbos.addAll(assistiramCursoAndroid.plus(assistiramCursoKotlin))
    assistiramAmbos.add("Kleber")
    assistiramAmbos.add("Kleber")
    println(assistiramAmbos)
}
