/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch._types;

/**
 * Builders for {@link GeoLocation} variants.
 * <p>
 * Variants <code>coords</code>, <code>text</code> are not available here as
 * they don't have a dedicated class. Use {@link GeoLocation}'s builder for
 * these.
 * 
 */
public class GeoLocationBuilders {
	private GeoLocationBuilders() {
	}

	/**
	 * Creates a builder for the {@link GeoHashLocation geohash} {@code GeoLocation}
	 * variant.
	 */
	public static GeoHashLocation.Builder geohash() {
		return new GeoHashLocation.Builder();
	}

	/**
	 * Creates a builder for the {@link LatLonGeoLocation latlon}
	 * {@code GeoLocation} variant.
	 */
	public static LatLonGeoLocation.Builder latlon() {
		return new LatLonGeoLocation.Builder();
	}

}
