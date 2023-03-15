package br.com.estudos.collectionsetmap.templates

fun testCopyReferenceCollection() {
    val banco = DataName()
    //shallow copy - > Cópia rasa (apontar para a mesma referência
    //Então mudamos a variável a mesma modificação é refletida para quem estamos pegando a referência
    val saveNames: Collection<String> = banco.names
    //Recebe uma cópia por conta da falta de proteção de invasão
    banco.saveInList("Kevin")
    println(saveNames)
    println(DataName().names)
}