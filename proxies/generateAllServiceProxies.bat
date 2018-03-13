@echo off

if exist ..\tools\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator.exe (	
	del jaxb-bindings-v11.reporting.xml
	del jaxb-bindings-v11.campaignmanagement.xml
	del jaxb-bindings-v11.bulk.xml
	del jaxb-bindings-v11.adinsight.xml
	
	call generateProxy v11.customerbilling https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v11/CustomerBillingService.svc
	call generateProxy v11.customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v11/CustomerManagementService.svc
	call generateProxy v11.reporting https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v11/ReportingService.svc
	
	call generateProxy v11.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v11/CampaignManagementService.svc
	call generateProxy v11.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v11/BulkService.svc
	call generateProxy v11.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v11/AdInsightService.svc
	
) else (	
	echo Please build ..\tools\WsdlEnumGenerator\WsdlEnumGenerator.csproj first	
)