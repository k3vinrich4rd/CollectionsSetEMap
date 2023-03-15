package br.com.estudos.collectionsetmap.test

fun main() {
    testListsWithAddedElements()
}
fun testListsWithAddedElements() {
    val assistiramCursoAndroid = listOf("Kevin", "Katia", "Eric", "Fran")
    val assistiramCursoKotlin = listOf("Kevin", "Paulo", "Maria")
    val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    println(assistiramAmbos)
}