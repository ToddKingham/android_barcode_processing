package tests

import com.ajohnson.dlparserkotli.categories.ReservedKeywords
import com.ajohnson.dlparserkotli.parsers.DLParser


class MockBuilder(val versionParser: DLParser) {

    val issuerIdentificationNumber = "636000"
    val numberOfSubfiles = "01"
    val jurisdictionVersionNumber = "01"

    fun makeHeader(): String {
        val lineOne = ReservedKeywords.COMPLIANCE_INDICATOR.rawValue +
                ReservedKeywords.DATA_ELEMENT_SEPARATOR +
                ReservedKeywords.RECORD_SEPARATOR +
                ReservedKeywords.SEGMENT_SEPARATOR
        val version = versionParser.versionNumber ?: 0
        val lineTwo = ReservedKeywords.FILE_TYPE.rawValue +
                issuerIdentificationNumber +
                String.format("%2d", version) +
                jurisdictionVersionNumber +
                numberOfSubfiles
        return lineOne.plus(lineTwo)
    }
}