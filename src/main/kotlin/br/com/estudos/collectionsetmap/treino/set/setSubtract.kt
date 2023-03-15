package br.com.estudos.collectionsetmap.treino.set

fun setSubtract() {
    //Impossibilita a repetição de elementos 
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.add("Kleber")
    assistiramAmbos.add("Kleber")

    //Para fazer a mesma coisa:
    println(assistiramCursoKotlin - assistiramCursoAndroid)
    //subtract (Subtração) -> Retira os elementos compatíveis (nomes iguais) na lista que está fazendo a subtração
    // (é um in fix) o ponto '.' e nem os parênteses para implementar o método é opcional
    println(assistiramCursoAndroid.subtract(assistiramCursoKotlin)) //Forma casual
    println(assistiramCursoKotlin subtract assistiramCursoAndroid) //Forma distinta
}