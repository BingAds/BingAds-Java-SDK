package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a subset of the fields available in bulk records
 * that support quality score data, for example {@link BulkKeyword}.
 *
 * <p>
 *     For more information, see Bulk File Schema at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 */
public class QualityScoreData {

    private Integer qualityScore;

    private Integer keywordRelevance;

    private Integer landingPageRelevance;

    private Integer landingPageUserExperience;

    private static final List<BulkMapping<QualityScoreData>> MAPPINGS;

    static {
        List<BulkMapping<QualityScoreData>> m = new ArrayList<BulkMapping<QualityScoreData>>();

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(StringTable.QualityScore,
                new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData t) {
                        return t.getQualityScore();
                    }
                },
                new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d.setQualityScore(StringExtensions.parseOptionalInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(StringTable.KeywordRelevance,
                new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData t) {
                        return t.getKeywordRelevance();
                    }
                },
                new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d.setKeywordRelevance(StringExtensions.parseOptionalInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(StringTable.LandingPageRelevance,
                new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData t) {
                        return t.getLandingPageRelevance();
                    }
                },
                new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d.setLandingPageRelevance(StringExtensions.parseOptionalInteger(v));
                    }
                }));

        m.add(new SimpleBulkMapping<QualityScoreData, Integer>(StringTable.LandingPageUserExperience,
                new Function<QualityScoreData, Integer>() {
                    @Override
                    public Integer apply(QualityScoreData t) {
                        return t.getLandingPageUserExperience();
                    }
                },
                new BiConsumer<String, QualityScoreData>() {
                    @Override
                    public void accept(String v, QualityScoreData d) {
                        d.setLandingPageUserExperience(StringExtensions.parseOptionalInteger(v));
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Gets the landing page user experience.
     *
     * <p>
     *     Corresponds to the 'Landing Page User Experience' field in the bulk file.
     * </p>
     */
    public Integer getLandingPageUserExperience() {
        return landingPageUserExperience;
    }

    private void setLandingPageUserExperience(Integer landingPageUserExperience) {
        this.landingPageUserExperience = landingPageUserExperience;
    }

    /**
     * Gets the quality score.
     *
     * <p>
     *     Corresponds to the 'Quality Score' field in the bulk file.
     * </p>
     */
    public Integer getQualityScore() {
        return qualityScore;
    }

    private void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    /**
     * Gets the keyword relevance.
     *
     * <p>
     *     Corresponds to the 'Keyword Relevance' field in the bulk file.
     * </p>
     */
    public Integer getKeywordRelevance() {
        return keywordRelevance;
    }

    private void setKeywordRelevance(Integer keywordRelevance) {
        this.keywordRelevance = keywordRelevance;
    }

    /**
     * Gets the landing page relevance.
     *
     * <p>
     *     Corresponds to the 'Landing Page Relevance' field in the bulk file.
     * </p>
     */
    public Integer getLandingPageRelevance() {
        return landingPageRelevance;
    }

    private void setLandingPageRelevance(Integer landingPageRelevance) {
        this.landingPageRelevance = landingPageRelevance;
    }

    static QualityScoreData readFromRowValuesOrNull(RowValues values) {
        QualityScoreData qualityScoreData = new QualityScoreData();

        qualityScoreData.readFromRowValues(values);

        return qualityScoreData.hasAnyValues() ? qualityScoreData : null;
    }

    static void writeToRowValuesIfNotNull(QualityScoreData qualityScoreData, RowValues values) {
        if (qualityScoreData != null) {
            qualityScoreData.writeToRowValues(values);
        }
    }

    private boolean hasAnyValues() {
        return qualityScore != null || keywordRelevance != null
                || landingPageRelevance != null
                || landingPageUserExperience != null;
    }

    void readFromRowValues(RowValues values) {
        MappingHelpers.<QualityScoreData>convertToEntity(values, MAPPINGS, this);
    }

    void writeToRowValues(RowValues values) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
