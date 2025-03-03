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

package org.opensearch.client.opensearch.core;

import org.opensearch.client.opensearch.core.msearch.MultiSearchResult;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.NamedDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;
import java.util.function.Supplier;

// typedef: _global.msearch_template.Response

@JsonpDeserializable
public class MsearchTemplateResponse<TDocument> extends MultiSearchResult<TDocument> {
	// ---------------------------------------------------------------------------------------------

	private MsearchTemplateResponse(Builder<TDocument> builder) {
		super(builder);

	}

	public static <TDocument> MsearchTemplateResponse<TDocument> of(
			Function<Builder<TDocument>, ObjectBuilder<MsearchTemplateResponse<TDocument>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchTemplateResponse}.
	 */

	public static class Builder<TDocument> extends MultiSearchResult.AbstractBuilder<TDocument, Builder<TDocument>>
			implements
				ObjectBuilder<MsearchTemplateResponse<TDocument>> {
		@Override
		protected Builder<TDocument> self() {
			return this;
		}

		/**
		 * Builds a {@link MsearchTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchTemplateResponse<TDocument> build() {
			_checkSingleUse();

			return new MsearchTemplateResponse<TDocument>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for MsearchTemplateResponse
	 */
	public static <TDocument> JsonpDeserializer<MsearchTemplateResponse<TDocument>> createMsearchTemplateResponseDeserializer(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TDocument>>) Builder::new,
				op -> MsearchTemplateResponse.setupMsearchTemplateResponseDeserializer(op, tDocumentDeserializer));
	};

	/**
	 * Json deserializer for {@link MsearchTemplateResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<MsearchTemplateResponse<Object>> _DESERIALIZER = createMsearchTemplateResponseDeserializer(
			new NamedDeserializer<>("org.opensearch.client:Deserializer:_global.msearch_template.TDocument"));

	protected static <TDocument> void setupMsearchTemplateResponseDeserializer(
			ObjectDeserializer<MsearchTemplateResponse.Builder<TDocument>> op,
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		MultiSearchResult.setupMultiSearchResultDeserializer(op, tDocumentDeserializer);

	}

}
