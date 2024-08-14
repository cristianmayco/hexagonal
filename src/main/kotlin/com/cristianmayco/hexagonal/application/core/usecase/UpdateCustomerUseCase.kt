package com.cristianmayco.hexagonal.application.core.usecase

import com.cristianmayco.hexagonal.application.core.domain.Customer
import com.cristianmayco.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.cristianmayco.hexagonal.application.ports.out.FindAddressByZipCodeByCodeOutputPort
import com.cristianmayco.hexagonal.application.ports.out.UpdateCustomerOutputPort

class UpdateCustomerUseCase(
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val findAddressByZipCodeByCodeOutputPort: FindAddressByZipCodeByCodeOutputPort
    private val updateCustomerOutputPort: UpdateCustomerOutputPort
) {

    fun update(customer: Customer, zipCode: String) {
        if(customer.id == null) throw IllegalArgumentException("The id field cannot be null")
        findCustomerByIdInputPort.find(customer.id)

        customer.apply {
            address = findAddressByZipCodeByCodeOutputPort.find(zipCode)
        }.let {
            updateCustomerOutputPort.update(it)
        }
    }
}