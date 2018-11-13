@echo off

if exist ..\tools\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator.exe (
	del jaxb-bindings-v12.reporting.xml
	del jaxb-bindings-v12.campaignmanagement.xml
	del jaxb-bindings-v12.adinsight.xml
	del jaxb-bindings-v12.bulk.xml
	
	call generateProxy v12.customerbilling https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v12/CustomerBillingService.svc
	call generateProxy v12.customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v12/CustomerManagementService.svc
	call generateProxy v12.reporting https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v12/ReportingService.svc
	call generateProxy v12.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/CampaignManagementService.svc
	call generateProxy v12.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/BulkService.svc
	call generateProxy v12.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v12/AdInsightService.svc
	
) else (	
	echo Please build ..\tools\WsdlEnumGenerator\WsdlEnumGenerator.csproj first	
)