/*
 * Copyright 2016 Santanu Sinha <santanu.sinha@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appform.nautilus.funnel.model.graph;

import io.appform.nautilus.funnel.model.session.FlatPath;
import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GraphEdge {
    @Getter
    @Setter
    private String from;

    @Getter
    @Setter
    private String to;

    @Getter
    @Setter
    private long value;

    @Getter
    @Setter
    private List<FlatPath> paths;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphEdge graphEdge = (GraphEdge) o;

        if (from != graphEdge.from) return false;
        return to == graphEdge.to;

    }


    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + (int) (value ^ (value >>> 32));
        return result;
    }
}
