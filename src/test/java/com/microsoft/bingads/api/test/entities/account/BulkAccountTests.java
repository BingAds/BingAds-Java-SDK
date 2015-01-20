package com.microsoft.bingads.api.test.entities.account;

import junit.framework.TestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.account.read.BulkAccountReadTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAccountReadTests.class})

public class BulkAccountTests extends TestCase {
}
