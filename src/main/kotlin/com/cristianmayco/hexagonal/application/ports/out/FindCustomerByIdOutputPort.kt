package com.cristianmayco.hexagonal.application.ports.out

import com.cristianmayco.hexagonal.application.core.domain.Customer

interface FindCustomerByIdOutputPort {
    fun find(id: String): Customer?
}