package br.com.estudos.collectionsetmap.set

fun setUnion() {
    //Impossibilita a repetição de elementos 
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.add("Kleber")
    assistiramAmbos.add("Kleber")

    //Para fazer a mesma coisa:
    println(assistiramCursoKotlin + assistiramCursoAndroid)
    //union (União) -> uni os elementos de lista diferentes na mesma lista
    // (é um in fix) o ponto '.' e nem os parênteses para implementar o método é opcional
    println(assistiramCursoAndroid.union(assistiramCursoKotlin)) //Forma casual
    println(assistiramCursoKotlin union assistiramCursoAndroid)
}