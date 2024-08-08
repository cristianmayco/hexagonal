package com.cristianmayco.hexagonal.application.ports.out

import com.cristianmayco.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeByCodeOutputPort {
    fun find(zipCode: String): Address
}