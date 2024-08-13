package com.cristianmayco.hexagonal.application.ports.`in`

import com.cristianmayco.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {
    fun find(id:String): Customer
}