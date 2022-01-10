package br.com.aurelio.forum.repository

import br.com.aurelio.forum.model.Curso
import org.springframework.data.jpa.repository.JpaRepository

interface CursoRepository: JpaRepository<Curso, Long> {
}