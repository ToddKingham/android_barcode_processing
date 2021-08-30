package com.ajohnson.dlparserkotli.parsers

import com.ajohnson.dlparserkotli.models.FieldKey

/**
 * Published 06-2012.
 */
internal class VersionSevenParser(data: String) : DLParser(data) {

    init {
        fields.remove(FieldKey.FEDERAL_VEHICLE_CODE)
        fields.remove(FieldKey.DRIVER_LICENSE_NAME)
        fields.remove(FieldKey.GIVEN_NAME)
    }
}
