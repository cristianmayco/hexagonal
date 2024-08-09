package com.cristianmayco.hexagonal.adapters.out

import com.cristianmayco.hexagonal.adapters.out.repository.CustomerRepository
import com.cristianmayco.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.cristianmayco.hexagonal.application.core.domain.Customer
import com.cristianmayco.hexagonal.application.ports.out.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val customerRepository: CustomerRepository
): InsertCustomerOutputPort {
    override fun insert(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }
}