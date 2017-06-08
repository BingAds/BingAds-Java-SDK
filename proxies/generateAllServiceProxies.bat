@echo off

if exist ..\tools\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator.exe (
	#call generateProxy customerbilling https://clientcenter.api.bingads.microsoft.com/Api/Billing/v9/CustomerBillingService.svc
	#call generateProxy customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v9/CustomerManagementService.svc
	#call generateProxy reporting https://api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v9/ReportingService.svc
	
	#call generateProxy v10.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v10/CampaignManagementService.svc
	#call generateProxy v10.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v10/BulkService.svc
	#call generateProxy v10.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/V10/AdInsightService.svc
	
	call generateProxy v11.customerbilling https://clientcenter.api.bingads.microsoft.com/Api/Billing/v11/CustomerBillingService.svc
	call generateProxy v11.customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v11/CustomerManagementService.svc
	call generateProxy v11.reporting https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v11/ReportingService.svc
	call generateProxy v11.campaignmanagement https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v11/CampaignManagementService.svc
	call generateProxy v11.bulk https://bulk.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v11/BulkService.svc
	call generateProxy v11.adinsight https://adinsight.api.sandbox.bingads.microsoft.com/Api/Advertiser/AdInsight/V11/AdInsightService.svc
	
) else (	
	echo Please build ..\tools\WsdlEnumGenerator\WsdlEnumGenerator.csproj first	
)
