package br.com.aurelio.forum.service

import br.com.aurelio.forum.model.Curso
import br.com.aurelio.forum.model.Usuario
import br.com.aurelio.forum.repository.UsuarioRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(
    private val repository: UsuarioRepository
    ) {

        fun buscarPorId(id: Long): Usuario {
            return repository.getOne(id)
        }

}