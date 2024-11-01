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

package brn.mobile.brnmobile.api.apis

import brn.mobile.brnmobile.api.models.AudiometryHistoryRequest
import brn.mobile.brnmobile.api.models.BaseSingleObjectResponseDto

import brn.mobile.brnmobile.api.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder

    open class AudiometryHistoryControllerApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    ) : ApiClient(
        baseUrl,
        httpClientEngine,
        httpClientConfig,
    ) {

        /**
        * Save speech audiometry history
        * 
         * @param audiometryHistory audiometryHistory 
         * @return BaseSingleObjectResponseDto
        */
            @Suppress("UNCHECKED_CAST")
        open suspend fun saveUsingPOST(audiometryHistory: AudiometryHistoryRequest): HttpResponse<BaseSingleObjectResponseDto> {

            val localVariableAuthNames = listOf<String>()

            val localVariableBody = audiometryHistory

            val localVariableQuery = mutableMapOf<String, List<String>>()

            val localVariableHeaders = mutableMapOf<String, String>()

            val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/audiometry-history",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            )

            return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
            ).wrap()
            }

        }
