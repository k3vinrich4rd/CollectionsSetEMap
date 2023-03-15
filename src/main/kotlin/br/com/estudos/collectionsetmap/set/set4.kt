package br.com.estudos.collectionsetmap.set

fun set4() {
    //Impossibilita a repetição de elementos
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()
    //Outra forma de se fazer a mesma coisa:
    assistiramAmbos.addAll(assistiramCursoAndroid.plus(assistiramCursoKotlin))
    println(assistiramAmbos)

    //Também é possível fazer cópias com o ‘set’:
    val toMutableList = assistiramAmbos.toMutableList()
    toMutableList.add("Alex")
    println(toMutableList)
    println(toMutableList.toSet())
}
