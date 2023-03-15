
package br.com.estudos.collectionsetmap.templates

class DataName {


    //Snap shot -> (Tiro certo) cria uma cópia exata da coleção de uma maneira que
    //Não estamos devolvendo a coleção, mas sim a sua cópia
    val names: Collection<String> get() = dados.toList()

    fun saveInList(name: String) {
        dados.add(name)
    }

    //Object declaration que ajuda os dados a serem mantidos
    //E assim não criar listas diferentes a cada instancia de objeto

    companion object {
        private val dados = mutableListOf<String>()
    }
}


/*
  private val dados = mutableListOf<String>()
    val names: Collection<String> get() = dados

    fun saveInList(name: String) {
        dados.add(name)
    }
 */
