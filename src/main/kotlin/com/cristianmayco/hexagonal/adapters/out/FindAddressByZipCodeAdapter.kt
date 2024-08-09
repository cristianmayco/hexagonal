package com.cristianmayco.hexagonal.adapters.out

import com.cristianmayco.hexagonal.adapters.out.client.response.FindAddressByZipCodeClient
import com.cristianmayco.hexagonal.application.core.domain.Address
import com.cristianmayco.hexagonal.application.ports.out.FindAddressByZipCodeByCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
) : FindAddressByZipCodeByCodeOutputPort {

    override fun find(zipCode: String): Address =
        findAddressByZipCodeClient.find(zipCode).toAddress()
}