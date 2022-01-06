package br.com.aurelio.forum.service

import br.com.aurelio.forum.model.Curso
import br.com.aurelio.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioService(
    var usuarios: List<Usuario>
    ) {

        init {
            val usuario = Usuario(
                id = 1,
                nome = "Aurelio",
                email = "email@email.com.br"
            )
            usuarios = Arrays.asList(usuario)
        }

        fun buscarPorId(id: Long): Usuario {
            return usuarios.stream().filter { u ->
                u.id == id
            }.findFirst().get()
        }

}