package com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsoft.bingads.v13.campaignmanagement.ReachOptimizationGoal;

public interface ReachOptimizationGoalMixIn {

    @JsonValue
    String value();

    @JsonCreator
    ReachOptimizationGoal fromValue(String value);
}
