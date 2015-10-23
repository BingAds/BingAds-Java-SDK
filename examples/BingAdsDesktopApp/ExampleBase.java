package com.microsoft.bingads.examples;

public class ExampleBase {

    protected static java.lang.String UserName = "<UserNameGoesHere>";
    protected static java.lang.String Password = "<PasswordGoesHere>";
    protected static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    protected static long CustomerId = <CustomerIdGoesHere>;
    protected static long AccountId = <AccountIdGoesHere>;
    
    public ExampleBase() {}

    // Prints the string to System.out
    protected static void outputStatusMessage(java.lang.String message){
        System.out.println(message);
    }
}
