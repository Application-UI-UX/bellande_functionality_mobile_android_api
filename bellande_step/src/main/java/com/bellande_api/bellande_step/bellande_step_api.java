/**
 * Copyright (C) 2024 Bellande Application UI UX Research Innovation Center, Ronaldson Bellande
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 **/

package com.bellande_api.bellande_step;

import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Bellande_Step_Api {
    @POST("endpoint_path")
    Call<BellandeResponse> getBellandeResponse(@Body RequestBody requestBody);

    class RequestBody {
        @SuppressWarnings("unused")
        @SerializedName("input_text")
        private final String inputText;

        public RequestBody(String inputText) {
            this.inputText = inputText;
        }
    }

    class BellandeResponse {
        @SerializedName("response")
        public String response;
    }
}
