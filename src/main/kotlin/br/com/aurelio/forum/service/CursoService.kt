package br.com.aurelio.forum.service

import br.com.aurelio.forum.model.Curso
import br.com.aurelio.forum.repository.CursoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CursoService(
    private val repository: CursoRepository
) {

    fun buscarPorId(id: Long): Curso {
        return repository.getOne(id)
    }

}
