package com.cristianmayco.hexagonal.adapters.`in`.controller.request

import jakarta.validation.constraints.NotBlank

data class CustomerRequest(

    @field:NotBlank(message = "Name must not be blank")
    val name: String,
    @field:NotBlank(message = "CPF must not be blank")
    val cpf: String,
    @field:NotBlank(message = "zipCode must not be blank")
    val zipCode: String
)
