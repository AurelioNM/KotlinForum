package br.com.aurelio.forum.service

import br.com.aurelio.forum.model.Curso
import br.com.aurelio.forum.model.Topico
import br.com.aurelio.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private var topicos: List<Topico>
    ) {

    init {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin 1",
            mensagem = "Variaveis no Kotlin 1",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            ),
        )
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin 2",
            mensagem = "Variaveis no Kotlin 2",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            ),
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Kotlin 3",
            mensagem = "Variaveis no Kotlin 3",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao"
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana da Silva",
                email = "ana@email.com"
            ),
        )
        this.topicos = listOf(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }

}