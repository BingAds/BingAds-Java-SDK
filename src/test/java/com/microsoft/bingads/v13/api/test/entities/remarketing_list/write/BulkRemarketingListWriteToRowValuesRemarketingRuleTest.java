package com.microsoft.bingads.v13.api.test.entities.remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.remarketing_list.BulkRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.NormalForm;
import com.microsoft.bingads.v13.campaignmanagement.RemarketingRule;

@RunWith(Parameterized.class)
public class BulkRemarketingListWriteToRowValuesRemarketingRuleTest extends BulkRemarketingListTest {

    @Parameter(value = 1)
    public RemarketingRule propertyValue;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {null, null},
            {"PageVisitors((Url Equals Test Value) and (ReferrerUrl Contains Test Value))", 
            	generatePageVisitRuleTestData("PageVisitors", 1, 2) },
            {"PageVisitors((Url Equals Test Value))", 
                	generatePageVisitRuleTestData("PageVisitors", 1, 1) },
            {"PageVisitors((Url Equals Test Value)) or "
            		+ "((Url Equals Test Value))", 
                	generatePageVisitRuleTestData("PageVisitors", 2, 1) },
            {"PageVisitors((Url Equals Test Value) and (ReferrerUrl Contains Test Value)) or "
            		+ "((Url Equals Test Value) and (ReferrerUrl Contains Test Value))", 
                	generatePageVisitRuleTestData("PageVisitors", 2, 2) },
            {"PageVisitors((Url Equals Test Value) and (ReferrerUrl Contains Test Value) and "
            		+ "(Url BeginsWith Test Value) and (ReferrerUrl EndsWith Test Value) and "
            		+ "(Url NotEquals Test Value) and (ReferrerUrl DoesNotContain Test Value) and "
            		+ "(Url DoesNotBeginWith Test Value) and (ReferrerUrl DoesNotEndWith Test Value))", 
                	generatePageVisitRuleTestData("PageVisitors", 1, 8) },
            {"PageVisitors((Url Equals Test Value) or (ReferrerUrl Contains Test Value))", 
                   	generatePageVisitRuleTestData("PageVisitors", 1, 2, NormalForm.CONJUNCTIVE) },
            {"PageVisitors((Url Equals Test Value)) and "
              		+ "((Url Equals Test Value))", 
                   	generatePageVisitRuleTestData("PageVisitors", 2, 1, NormalForm.CONJUNCTIVE) },
            {"PageVisitors((Url Equals Test Value) or (ReferrerUrl Contains Test Value)) and "
               		+ "((Url Equals Test Value) or (ReferrerUrl Contains Test Value))", 
                   	generatePageVisitRuleTestData("PageVisitors", 2, 2, NormalForm.CONJUNCTIVE) },
            {"PageVisitors((Url Equals Test Value) or (ReferrerUrl Contains Test Value) or "
               		+ "(Url BeginsWith Test Value) or (ReferrerUrl EndsWith Test Value) or "
               		+ "(Url NotEquals Test Value) or (ReferrerUrl DoesNotContain Test Value) or "
               		+ "(Url DoesNotBeginWith Test Value) or (ReferrerUrl DoesNotEndWith Test Value))", 
                   	generatePageVisitRuleTestData("PageVisitors", 1, 8, NormalForm.CONJUNCTIVE) },
            {"PageVisitorsWhoVisitedAnotherPage(((Url Equals Test Value) and (ReferrerUrl Contains Test Value))) and "
            		+ "(((Url Equals Test Value) and (ReferrerUrl Contains Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoVisitedAnotherPage", 1, 2) },
            {"PageVisitorsWhoVisitedAnotherPage(((Url Equals Test Value))) and (((Url Equals Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoVisitedAnotherPage", 1, 1) },
            {"PageVisitorsWhoVisitedAnotherPage(((Url Equals Test Value)) or "
                    + "((Url Equals Test Value))) and (((Url Equals Test Value)) or "
                    + "((Url Equals Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoVisitedAnotherPage", 2, 1) },
            {"PageVisitorsWhoVisitedAnotherPage(((Url Equals Test Value) and (ReferrerUrl Contains Test Value)) or "
            		+ "((Url Equals Test Value) and (ReferrerUrl Contains Test Value))) and "
            		+ "(((Url Equals Test Value) and (ReferrerUrl Contains Test Value)) or "
            		+ "((Url Equals Test Value) and (ReferrerUrl Contains Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoVisitedAnotherPage", 2, 2) },
            {"PageVisitorsWhoDidNotVisitAnotherPage(((Url Equals Test Value) and (ReferrerUrl Contains Test Value))) and not "
            		+ "(((Url Equals Test Value) and (ReferrerUrl Contains Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoDidNotVisitAnotherPage", 1, 2) },
            {"PageVisitorsWhoDidNotVisitAnotherPage(((Url Equals Test Value))) and not (((Url Equals Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoDidNotVisitAnotherPage", 1, 1) },
            {"PageVisitorsWhoDidNotVisitAnotherPage(((Url Equals Test Value)) or "
                    + "((Url Equals Test Value))) and not (((Url Equals Test Value)) or "
                    + "((Url Equals Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoDidNotVisitAnotherPage", 2, 1) },
            {"PageVisitorsWhoDidNotVisitAnotherPage(((Url Equals Test Value) and (ReferrerUrl Contains Test Value)) or "
            		+ "((Url Equals Test Value) and (ReferrerUrl Contains Test Value))) and not "
            		+ "(((Url Equals Test Value) and (ReferrerUrl Contains Test Value)) or "
            		+ "((Url Equals Test Value) and (ReferrerUrl Contains Test Value)))", 
                    generatePageVisitRuleTestData("PageVisitorsWhoDidNotVisitAnotherPage", 2, 2) },
            {"CustomEvents(Category DoesNotEndWith Test Category) and (Action DoesNotContain Test Action) and "
        			+ "(Label NotEquals Test Label) and (Value LessThan 23)", generateCustomRuleTestData()},
        });
    }
    
    @Test
    public void testWrite() {        
        this.<RemarketingRule>testWriteProperty("Remarketing Rule", this.datum, this.propertyValue, new BiConsumer<BulkRemarketingList, RemarketingRule>() {
            @Override
            public void accept(BulkRemarketingList c, RemarketingRule v) {
                c.getRemarketingList().setRule(v);;
            }
        });
    }
}
