@echo off

if exist ..\tools\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator.exe (
	REM del jaxb-bindings-v12.reporting.xml
	REM del jaxb-bindings-v12.campaignmanagement.xml
	REM del jaxb-bindings-v11.bulk.xml
	del jaxb-bindings-v12.adinsight.xml
	
	REM call generateProxy v11.customerbilling https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v11/CustomerBillingService.svc
	REM call generateProxy v11.customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v11/CustomerManagementService.svc
	REM call generateProxy v11.reporting https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v11/ReportingService.svc
	REM call generateProxy v11.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v11/CampaignManagementService.svc
	REM call generateProxy v11.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v11/BulkService.svc
	call generateProxy v11.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v11/AdInsightService.svc
	
	
	REM call generateProxy v12.customerbilling https://clientcenter.api.sandbox.bingads.microsoft.com/Api/Billing/v12/CustomerBillingService.svc
	REM call generateProxy v12.customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v12/CustomerManagementService.svc
	REM call generateProxy v12.reporting https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v12/ReportingService.svc
	REM call generateProxy v12.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/CampaignManagementService.svc
	REM call generateProxy v12.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v12/BulkService.svc
	call generateProxy v12.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/v12/AdInsightService.svc
	
) else (	
	echo Please build ..\tools\WsdlEnumGenerator\WsdlEnumGenerator.csproj first	
)