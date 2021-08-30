package com.ajohnson.dlparserkotli.parsers

import com.ajohnson.dlparserkotli.models.FieldKey

/**
 * Published 08-2013.
 */
internal class VersionEightParser(data: String) : DLParser(data) {
    
    init {
        fields.remove(FieldKey.FEDERAL_VEHICLE_CODE)
        fields.remove(FieldKey.DRIVER_LICENSE_NAME)
        fields.remove(FieldKey.GIVEN_NAME)
    }
}