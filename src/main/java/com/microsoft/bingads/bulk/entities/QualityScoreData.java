package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the quality score data returned with bulk file entities when
 * requested
 *
 */
public class QualityScoreData {

    private Integer qualityScore;
    private Integer keywordRelevance;
    private Integer landingPageRelevance;
    private Integer landingPageUserExperience;

    private static List<BulkMapping<QualityScoreData>> MAPPINGS;

    static {
        List<BulkMapping<QualityScoreData>> m = new ArrayList<BulkMapping<QualityScoreData>>();

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(StringTable.QualityScore,
                new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData d) {
                        return d.getQualityScore();
                    }
                }, new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d
                        .setQualityScore(StringExtensions.nullOrInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(
                StringTable.KeywordRelevance, new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData d) {
                        return d
                        .getKeywordRelevance();
                    }
                }, new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d
                        .setKeywordRelevance(StringExtensions.nullOrInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(
                StringTable.LandingPageRelevance, new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData d) {
                        return d
                        .getLandingPageRelevance();
                    }
                }, new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d
                        .setLandingPageRelevance(StringExtensions.nullOrInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(
                StringTable.LandingPageUserExperience,
                new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData d) {
                        return d.getLandingPageUserExperience();
                    }
                },
                new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d.setLandingPageUserExperience(StringExtensions.nullOrInteger(v));
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    public Integer getLandingPageUserExperience() {
        return landingPageUserExperience;
    }

    public void setLandingPageUserExperience(Integer landingPageUserExperience) {
        this.landingPageUserExperience = landingPageUserExperience;
    }

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Integer getKeywordRelevance() {
        return keywordRelevance;
    }

    public void setKeywordRelevance(Integer keywordRelevance) {
        this.keywordRelevance = keywordRelevance;
    }

    public Integer getLandingPageRelevance() {
        return landingPageRelevance;
    }

    public void setLandingPageRelevance(Integer landingPageRelevance) {
        this.landingPageRelevance = landingPageRelevance;
    }

    public static QualityScoreData readFromRowValuesOrNull(RowValues values) {
        QualityScoreData qualityScoreData = new QualityScoreData();

        qualityScoreData.readFromRowValues(values);

        return qualityScoreData.hasAnyValues() ? qualityScoreData : null;
    }

    private boolean hasAnyValues() {
        return qualityScore != null || keywordRelevance != null
                || landingPageRelevance != null
                || landingPageUserExperience != null;
    }

    public void readFromRowValues(RowValues values) {
        MappingHelpers.<QualityScoreData>convertToEntity(values,
                MAPPINGS, this);
    }
}
