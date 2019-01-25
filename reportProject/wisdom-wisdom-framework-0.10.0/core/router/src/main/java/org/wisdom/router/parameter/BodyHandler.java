/*
 * #%L
 * Wisdom-Framework
 * %%
 * Copyright (C) 2013 - 2014 Wisdom Framework
 * %%
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
 * #L%
 */
package org.wisdom.router.parameter;

import org.wisdom.api.content.ParameterFactories;
import org.wisdom.api.http.Context;
import org.wisdom.api.router.parameters.ActionParameter;

/**
 * The handler managing @Body.
 */
public class BodyHandler implements RouteParameterHandler {

    @Override
    public Object create(ActionParameter argument, Context context,
                         ParameterFactories engine) {
        return context.body(argument.getRawType(), argument.getGenericType());
    }
}
