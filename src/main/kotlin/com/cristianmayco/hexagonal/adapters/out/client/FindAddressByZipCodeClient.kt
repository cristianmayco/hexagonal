package com.cristianmayco.hexagonal.adapters.out.client

import com.cristianmayco.hexagonal.adapters.out.client.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "findAddressByZipCode", url = "\${cristianmayco.client.address.url}")
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    fun getAddressByZipCode(zipCode: String): AddressResponse
    fun find(@PathVariable zipCode: String): AddressResponse
}