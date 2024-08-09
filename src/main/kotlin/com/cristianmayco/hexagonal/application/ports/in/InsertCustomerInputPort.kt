package com.cristianmayco.hexagonal.application.ports.`in`

import com.cristianmayco.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {
    fun insert(customer: Customer, zipCode: String)
}