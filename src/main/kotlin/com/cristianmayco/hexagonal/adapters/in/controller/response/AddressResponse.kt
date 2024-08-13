package com.cristianmayco.hexagonal.adapters.`in`.controller.response

import com.cristianmayco.hexagonal.application.core.domain.Address

class AddressResponse(
    val street: String,
    val city: String,
    val state: String
) {

    constructor(address : Address): this(
        address.street,
        address.city,
        address.street
    )

}
