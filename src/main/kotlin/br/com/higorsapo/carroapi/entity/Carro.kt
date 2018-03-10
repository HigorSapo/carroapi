package br.com.higorsapo.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Carro(@Id val id: String?,
                 var marca: String,
                 var modela: String,
                 var ano: Int,
                 var placa: String,
                 var urlImagem: String?) {
    /*constructor(): this("", "", "", 0, "")*/
}