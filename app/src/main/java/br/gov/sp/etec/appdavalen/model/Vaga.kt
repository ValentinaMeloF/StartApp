package br.gov.sp.etec.appdavalen.model

data class Vaga(
    val numero : Int,
    val status: Boolean,
    val placa : String,
    val tipoVaga : TipoVaga
    )