package com.cristianmayco.hexagonal.config

import com.cristianmayco.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.cristianmayco.hexagonal.adapters.out.InsertCustomerAdapter
import com.cristianmayco.hexagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter
    ) = InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter)

}