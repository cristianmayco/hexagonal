package com.cristianmayco.hexagonal.application.ports.`in`

import com.cristianmayco.hexagonal.application.core.domain.Customer

interface UpdateCustomerInputPort {

    fun update(customer: Customer, zipCode: String)
}