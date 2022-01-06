package br.com.aurelio.forum.mapper

import br.com.aurelio.forum.dto.NovoTopicoForm
import br.com.aurelio.forum.model.Topico
import br.com.aurelio.forum.service.CursoService
import br.com.aurelio.forum.service.UsuarioService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val autorService: UsuarioService,
): Mapper<NovoTopicoForm, Topico>{

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = autorService.buscarPorId(t.idAutor)
        )
    }

}
