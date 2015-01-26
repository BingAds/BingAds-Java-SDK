package com.microsoft.bingads.api.test.entities.ad_extension.product.read;

import com.microsoft.bingads.api.test.entities.DeleteAllRowPosition;
import com.microsoft.bingads.api.test.entities.ad_extension.product.BulkProductAdExtensionTest;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.ResultFileType;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.bulk.entities.BulkProductAdExtension;
import com.microsoft.bingads.bulk.entities.BulkProductConditionCollection;
import com.microsoft.bingads.bulk.entities.MultirecordEntityTestHelper;
import com.microsoft.bingads.campaignmanagement.AdExtensionStatus;
import com.microsoft.bingads.internal.bulk.BulkObjectReader;
import com.microsoft.bingads.internal.bulk.TestFactory;
import com.microsoft.bingads.internal.bulk.entities.BulkProductAdExtensionIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HasDeleteAllRowTest extends BulkProductAdExtensionTest {

    @Parameter(value = 0)
    public DeleteAllRowPosition deleteAllRowPosition;

    @Parameter(value = 1)
    public ResultFileType type;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {DeleteAllRowPosition.IN_THE_BEGINNING, ResultFileType.PARTIAL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_BEGINNING, ResultFileType.FULL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_MIDDLE, ResultFileType.PARTIAL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_MIDDLE, ResultFileType.FULL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_END, ResultFileType.PARTIAL_DOWNLOAD},
            {DeleteAllRowPosition.IN_THE_END, ResultFileType.FULL_DOWNLOAD}});
    }

    @Test
    public void returnsFullProductAdExtension() {
        BulkProductAdExtensionIdentifier identifier = new BulkProductAdExtensionIdentifier();
        identifier.setAccountId(123L);
        identifier.setAdExtensionId(456L);

        BulkProductAdExtensionIdentifier deleteAllRow = new BulkProductAdExtensionIdentifier();
        deleteAllRow.setAccountId(123L);
        deleteAllRow.setAdExtensionId(456L);
        deleteAllRow.setStatus(AdExtensionStatus.DELETED);

        BulkProductConditionCollection[] collections = createProductConditionCollectionsWithSameIdentifier(3, identifier);

        BulkObjectReader objectReader = MultirecordEntityTestHelper.setupObjectReaderToReturnEntitiesAndDeleteAllRow(collections, deleteAllRow, deleteAllRowPosition);

        BulkFileReader fileReader = TestFactory.createBulkFileReader(objectReader, type);

        List<BulkEntity> actualEntities = new ArrayList<BulkEntity>();

        for (BulkEntity entity : fileReader.getEntities()) {
            actualEntities.add(entity);
        }

        assertEquals(1, actualEntities.size());
        assertThat(actualEntities.get(0), instanceOf(BulkProductAdExtension.class));
        assertProductAdExtension(123, 456, collections, BulkProductAdExtension.class.cast(actualEntities.get(0)));
    }
}
