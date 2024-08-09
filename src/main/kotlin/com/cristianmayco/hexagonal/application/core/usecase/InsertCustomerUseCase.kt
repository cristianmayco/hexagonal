package com.cristianmayco.hexagonal.application.core.usecase

import com.cristianmayco.hexagonal.application.core.domain.Customer
import com.cristianmayco.hexagonal.application.ports.`in`.InsertCustomerInputPort
import com.cristianmayco.hexagonal.application.ports.out.FindAddressByZipCodeByCodeOutputPort
import com.cristianmayco.hexagonal.application.ports.out.InsertCustomerOutputPort

class InsertCustomerUseCase(
    private val findAddressByZipCodeByCodeOutputPort: FindAddressByZipCodeByCodeOutputPort,
    private val insertCustomerOutputPort: InsertCustomerOutputPort
): InsertCustomerInputPort {

    override fun insert(customer: Customer, zipCode: String){
        customer.apply {
            address = findAddressByZipCodeByCodeOutputPort.find(zipCode)
        }.let {
            insertCustomerOutputPort.insert(it)
        }
    }
}