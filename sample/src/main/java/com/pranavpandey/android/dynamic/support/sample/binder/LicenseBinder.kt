/*
 * Copyright 2018 Pranav Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pranavpandey.android.dynamic.support.sample.binder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pranavpandey.android.dynamic.support.recyclerview.adapter.DynamicBinderAdapter
import com.pranavpandey.android.dynamic.support.recyclerview.binder.DynamicInfoBigBinder
import com.pranavpandey.android.dynamic.support.recyclerview.binder.DynamicRecyclerViewBinder
import com.pranavpandey.android.dynamic.support.sample.R

/**
 * A recycler view binder to display licenses by using [DynamicRecyclerViewBinder].
 */
class LicenseBinder(dynamicBinderAdapter: DynamicBinderAdapter)
    : DynamicInfoBigBinder(dynamicBinderAdapter) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DynamicInfoBigBinder.ViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_license_card, parent, false))
    }
}
