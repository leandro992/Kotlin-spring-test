package br.com.alura.forum.model

import br.com.alura.forum.dto.TopicoView
import java.time.LocalDate
import java.time.LocalDateTime

object TopicoViewTest {
    fun build() = TopicoView(
        id = 1,
        titulo = "Kotlin basico",
        mensagem = "apredendo kotlin",
        status = StatusTopico.NAO_RESPONDIDO,
        dataCriacao = LocalDateTime.now(),
        dataAlteracao = LocalDate.now()
    )
}