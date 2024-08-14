package com.cristianmayco.hexagonal.application.ports.out

import com.cristianmayco.hexagonal.application.core.domain.Customer

interface UpdateCustomerOutputPort {
    fun update(customer: Customer)
}