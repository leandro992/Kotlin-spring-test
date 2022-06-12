package br.com.alura.forum.model

object TopicoTest {

    fun build() = Topico(
        id = 1,
        titulo = "Kotlin basico",
        mensagem = "apredendo kotlin",
        curso = Curso(id = 1, nome = "João", "Esducação"),
        autor = Usuario(
            id = 1,
            nome = "santos",
            email = "santos@outlook.com",
            password = "12234",
            listOf(Role(id = 0, nome = "santos"))
        )
    )
}