/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)
@file:OptIn(ExperimentalSerializationApi::class)

package brn.mobile.brnmobile.api.models


import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.JsonNames


/**
 * 
 *
 * @param active 
 * @param description 
 * @param id 
 * @param name 
 * @param type 
 * @param userAccount 
 */


data class HeadphonesDto (

    @JsonNames( "active")
    val active: kotlin.Boolean? = null,

    @JsonNames( "description")
    val description: kotlin.String? = null,

    @JsonNames( "id")
    val id: kotlin.Long? = null,

    @JsonNames( "name")
    val name: kotlin.String? = null,

    @JsonNames( "type")
    val type: HeadphonesDto.Type? = null,

    @JsonNames( "userAccount")
    val userAccount: kotlin.Long? = null

) {

    /**
     * 
     *
     * Values: NOT_DEFINED,ON_EAR_BLUETOOTH,OVER_EAR_BLUETOOTH,IN_EAR_BLUETOOTH,ON_EAR_NO_BLUETOOTH,OVER_EAR_NO_BLUETOOTH,IN_EAR_NO_BLUETOOTH
     */
   
    enum class Type(val value: kotlin.String) {
        @JsonNames( "NOT_DEFINED") NOT_DEFINED("NOT_DEFINED"),
        @JsonNames( "ON_EAR_BLUETOOTH") ON_EAR_BLUETOOTH("ON_EAR_BLUETOOTH"),
        @JsonNames( "OVER_EAR_BLUETOOTH") OVER_EAR_BLUETOOTH("OVER_EAR_BLUETOOTH"),
        @JsonNames( "IN_EAR_BLUETOOTH") IN_EAR_BLUETOOTH("IN_EAR_BLUETOOTH"),
        @JsonNames( "ON_EAR_NO_BLUETOOTH") ON_EAR_NO_BLUETOOTH("ON_EAR_NO_BLUETOOTH"),
        @JsonNames( "OVER_EAR_NO_BLUETOOTH") OVER_EAR_NO_BLUETOOTH("OVER_EAR_NO_BLUETOOTH"),
        @JsonNames( "IN_EAR_NO_BLUETOOTH") IN_EAR_NO_BLUETOOTH("IN_EAR_NO_BLUETOOTH");
    }

}
