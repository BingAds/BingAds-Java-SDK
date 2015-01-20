@echo off

if exist ..\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator.exe (
	call generateProxy adintelligence https://api.sandbox.bingads.microsoft.com/Api/Advertiser/AdIntelligence/v9/AdIntelligenceService.svc
	call generateProxy bulk https://api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v9/BulkService.svc
	call generateProxy campaignmanagement https://api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v9/CampaignManagementService.svc
	call generateProxy customerbilling https://clientcenter.api.bingads.microsoft.com/Api/Billing/v9/CustomerBillingService.svc
	call generateProxy customermanagement https://clientcenter.api.sandbox.bingads.microsoft.com/Api/CustomerManagement/v9/CustomerManagementService.svc
	call generateProxy optimizer https://api.sandbox.bingads.microsoft.com/Api/Advertiser/Optimizer/v9/OptimizerService.svc
	call generateProxy reporting https://api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v9/ReportingService.svc
) else (	
	echo Please build ..\WsdlEnumGenerator\WsdlEnumGenerator.csproj first	
)