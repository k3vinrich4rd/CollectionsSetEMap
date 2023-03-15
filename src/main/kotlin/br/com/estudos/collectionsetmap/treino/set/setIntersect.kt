package br.com.estudos.collectionsetmap.treino.set

fun setIntersect() {
    //Impossibilita a repetição de elementos 
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.add("Kleber")
    assistiramAmbos.add("Kleber")

    //intersect (Intersecção) -> Pega os membros que fazem parte de um conjunto e também do outro
    // (é um infix) o ponto '.' e nem os parênteses para implementar o método é opcional
    println(assistiramCursoAndroid.intersect(assistiramCursoKotlin)) //Forma casual
    println(assistiramCursoKotlin intersect assistiramCursoAndroid) //Forma distinta
}