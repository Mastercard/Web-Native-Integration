/* Copyright © 2022 Mastercard. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 =============================================================================*/

package com.mastercard.webintegration.validate.data

import com.google.gson.annotations.SerializedName

data class MaskedBillingAddress (
    @SerializedName("zip")
    val zip: String? = null,

    @SerializedName("city")
    val city: String? = null,

    @SerializedName("countryCode")
    val countryCode: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("state")
    val state: String? = null,

    @SerializedName("line3")
    val line3: Any? = null,

    @SerializedName("line2")
    val line2: Any? = null,

    @SerializedName("line1")
    val line1: String? = null,

    @SerializedName("addressId")
    val addressId: String? = null
    )