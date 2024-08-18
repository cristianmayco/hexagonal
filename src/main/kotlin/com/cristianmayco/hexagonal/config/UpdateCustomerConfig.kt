package com.cristianmayco.hexagonal.config

import com.cristianmayco.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.cristianmayco.hexagonal.adapters.out.UpdateCustomerAdapter
import com.cristianmayco.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.cristianmayco.hexagonal.application.core.usecase.UpdateCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateCustomerAdapter: UpdateCustomerAdapter
    ) = UpdateCustomerUseCase(
        findCustomerByIdUseCase,
        findAddressByZipCodeAdapter,
        updateCustomerAdapter
    )

}