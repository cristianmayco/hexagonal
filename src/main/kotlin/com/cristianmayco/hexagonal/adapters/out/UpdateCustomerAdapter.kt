package com.cristianmayco.hexagonal.adapters.out

import com.cristianmayco.hexagonal.adapters.out.repository.CustomerRepository
import com.cristianmayco.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.cristianmayco.hexagonal.application.core.domain.Customer
import com.cristianmayco.hexagonal.application.ports.out.UpdateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class UpdateCustomerAdapter(
    private val customerRepository: CustomerRepository
) : UpdateCustomerOutputPort {
    override fun update(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }

}