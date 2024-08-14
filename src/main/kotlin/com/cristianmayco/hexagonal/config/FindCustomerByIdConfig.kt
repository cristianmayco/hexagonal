package com.cristianmayco.hexagonal.config

import com.cristianmayco.hexagonal.adapters.out.FindCustomerByIdAdapter
import com.cristianmayco.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
   fun findCustomerById(findCustomerByIdAdapter: FindCustomerByIdAdapter) = FindCustomerByIdUseCase(findCustomerByIdAdapter)

}