package br.com.aurelio.forum.controller

import br.com.aurelio.forum.dto.NovoTopicoForm
import br.com.aurelio.forum.model.Topico
import br.com.aurelio.forum.service.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(
    private val service: TopicoService
) {

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView {
        return service.buscarPorId(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoForm) {
        service.cadastrar(dto)
    }
}