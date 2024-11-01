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

package brn.mobile.brnmobile.api.models


import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.json.JsonNames


/**
 * 
 *
 * @param audiometryTaskId 
 * @param endTime 
 * @param executionSeconds 
 * @param headphones 
 * @param rightAnswers 
 * @param sinAudiometryResults 
 * @param startTime 
 * @param tasksCount 
 */


data class AudiometryHistoryRequest (

    @JsonNames( "audiometryTaskId")
    val audiometryTaskId: kotlin.Long? = null,

    @JsonNames( "endTime")
    val endTime: LocalDateTime? = null,

    @JsonNames( "executionSeconds")
    val executionSeconds: kotlin.Int? = null,

    @JsonNames( "headphones")
    val headphones: kotlin.Long? = null,

    @JsonNames( "rightAnswers")
    val rightAnswers: kotlin.Int? = null,

    @JsonNames( "sinAudiometryResults")
    val sinAudiometryResults: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    @JsonNames( "startTime")
    val startTime: LocalDateTime? = null,

    @JsonNames( "tasksCount")
    val tasksCount: kotlin.Int? = null

) {


}

