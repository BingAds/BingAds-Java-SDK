package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an AI Prompt Audience that can be read or deleted in a bulk file.
 * Bulk upload supports deletion only; creating or updating AI Prompt Audiences is not supported.
 */
public class BulkAIPromptAudience extends SingleRecordBulkEntity {
    private Long id;
    private Long accountId;
    private String audience;
    private String scope;
    private Status status;

    private static final List<BulkMapping<BulkAIPromptAudience>> MAPPINGS;

    static {
        List<BulkMapping<BulkAIPromptAudience>> mappings = new ArrayList<BulkMapping<BulkAIPromptAudience>>();
        mappings.add(new SimpleBulkMapping<BulkAIPromptAudience, String>(StringTable.Status,
                new Function<BulkAIPromptAudience, String>() {
                    @Override
                    public String apply(BulkAIPromptAudience entity) {
                        return entity.getStatus() == null ? null : entity.getStatus().value();
                    }
                },
                new BiConsumer<String, BulkAIPromptAudience>() {
                    @Override
                    public void accept(String value, BulkAIPromptAudience entity) {
                        entity.setStatus(StringExtensions.parseOptional(value, new Function<String, Status>() {
                            @Override
                            public Status apply(String status) {
                                return StringExtensions.fromValueOptional(status, Status.class);
                            }
                        }));
                    }
                }));
        mappings.add(new SimpleBulkMapping<BulkAIPromptAudience, Long>(StringTable.Id,
                new Function<BulkAIPromptAudience, Long>() {
                    @Override
                    public Long apply(BulkAIPromptAudience entity) {
                        return entity.getId();
                    }
                },
                new BiConsumer<String, BulkAIPromptAudience>() {
                    @Override
                    public void accept(String value, BulkAIPromptAudience entity) {
                        entity.setId(StringExtensions.nullOrLong(value));
                    }
                }));
        mappings.add(new SimpleBulkMapping<BulkAIPromptAudience, Long>(StringTable.ParentId,
                new Function<BulkAIPromptAudience, Long>() {
                    @Override
                    public Long apply(BulkAIPromptAudience entity) {
                        return entity.getAccountId();
                    }
                },
                new BiConsumer<String, BulkAIPromptAudience>() {
                    @Override
                    public void accept(String value, BulkAIPromptAudience entity) {
                        entity.setAccountId(StringExtensions.nullOrLong(value));
                    }
                }));
        mappings.add(new SimpleBulkMapping<BulkAIPromptAudience, String>(StringTable.Audience,
                new Function<BulkAIPromptAudience, String>() {
                    @Override
                    public String apply(BulkAIPromptAudience entity) {
                        return entity.getAudience();
                    }
                },
                new BiConsumer<String, BulkAIPromptAudience>() {
                    @Override
                    public void accept(String value, BulkAIPromptAudience entity) {
                        entity.setAudience(value);
                    }
                }));
        mappings.add(new SimpleBulkMapping<BulkAIPromptAudience, String>(StringTable.Scope,
                new Function<BulkAIPromptAudience, String>() {
                    @Override
                    public String apply(BulkAIPromptAudience entity) {
                        return entity.getScope();
                    }
                },
                new BiConsumer<String, BulkAIPromptAudience>() {
                    @Override
                    public void accept(String value, BulkAIPromptAudience entity) {
                        entity.setScope(value);
                    }
                }));
        MAPPINGS = Collections.unmodifiableList(mappings);
    }

    /** Gets the audience identifier (the CSV Id field). */
    public Long getId() { return id; }
    /** Sets the audience identifier (the CSV Id field). */
    public void setId(Long id) { this.id = id; }
    /** Gets the account identifier (the CSV Parent Id field). */
    public Long getAccountId() { return accountId; }
    /** Sets the account identifier (the CSV Parent Id field). */
    public void setAccountId(Long accountId) { this.accountId = accountId; }
    /** Gets the audience name. */
    public String getAudience() { return audience; }
    /** Sets the audience name. */
    public void setAudience(String audience) { this.audience = audience; }
    /** Gets the audience scope. */
    public String getScope() { return scope; }
    /** Sets the audience scope. */
    public void setScope(String scope) { this.scope = scope; }
    /** Gets the status; use Deleted for bulk deletion. */
    public Status getStatus() { return status; }
    /** Sets the status; use Deleted for bulk deletion. */
    public void setStatus(Status status) { this.status = status; }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.<BulkAIPromptAudience>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
