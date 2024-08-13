package com.cristianmayco.hexagonal.application.core.usecase

import com.cristianmayco.hexagonal.application.core.domain.Customer
import com.cristianmayco.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.cristianmayco.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
) {

    fun find(id: String): Customer =
        findCustomerByIdOutputPort.find(id) ?: throw ObjectNotFoundException("Customer not found")

}