@echo off

if exist ..\tools\WsdlEnumGenerator\bin\Debug\net452\WsdlEnumGenerator.exe (
	del jaxb-bindings-v13.reporting.xml
	del jaxb-bindings-v13.campaignmanagement.xml
	del jaxb-bindings-v13.adinsight.xml
	del jaxb-bindings-v13.bulk.xml
	
	call generateProxy v13.customerbilling https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v13/CustomerBillingService.svc
	call generateProxy v13.customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v13/CustomerManagementService.svc
	call generateProxy v13.reporting https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v13/ReportingService.svc
	call generateProxy v13.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc
	call generateProxy v13.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/BulkService.svc
	call generateProxy v13.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v13/AdInsightService.svc
	
) else (	
	echo Please build ..\tools\WsdlEnumGenerator\WsdlEnumGenerator.csproj first	
)