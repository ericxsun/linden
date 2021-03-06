// Copyright 2016 Xiaomi, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.xiaomi.linden.thrift.builder.filter;

import com.xiaomi.linden.thrift.common.Coordinate;
import com.xiaomi.linden.thrift.common.LindenFilter;
import com.xiaomi.linden.thrift.common.LindenSpatialFilter;
import com.xiaomi.linden.thrift.common.SpatialParam;

public class LindenSpatialFilterBuilder extends LindenFilterBuilder {
  public static LindenFilter buildSpatialParam(SpatialParam spatialParam) {
    return new LindenFilter().setSpatialFilter(new LindenSpatialFilter(spatialParam));
  }

  public static LindenFilter buildSpatialParam(double latitude, double longitude, double range) {
    SpatialParam spatialParam = new SpatialParam()
        .setCoordinate(new Coordinate(longitude, latitude))
        .setDistanceRange(range);
    return buildSpatialParam(spatialParam);
  }

  @Override
  public LindenFilter build() {
    return null;
  }
}
