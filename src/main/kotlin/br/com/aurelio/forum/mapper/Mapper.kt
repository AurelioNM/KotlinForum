package br.com.aurelio.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}
