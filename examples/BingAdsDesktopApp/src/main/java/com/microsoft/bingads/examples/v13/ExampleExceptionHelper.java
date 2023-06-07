package com.microsoft.bingads.examples.v13;

import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeoutException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import javax.xml.namespace.QName;

// For more details see https://docs.microsoft.com/en-us/bingads/guides/handle-service-errors-exceptions

public class ExampleExceptionHelper {
    
    public static String getBingAdsExceptionFaultXml(Exception exception, PrintStream stream) {
        try {
            stream.println(exception.getMessage());
            // All Bing Ads exceptions have a getFaultInfo method.
            Method getFaultInfoMethod = exception.getClass().getDeclaredMethod("getFaultInfo", new Class[]{});
            Object faultDetail = getFaultInfoMethod.invoke(exception, null);
            StringWriter stringWriter = new StringWriter();
            Class faultDetailClass = faultDetail.getClass();
            JAXBContext jaxbContext = JAXBContext.newInstance(faultDetailClass); 
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            // Format the XML output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            QName qName = new QName(faultDetailClass.getPackage().getName(), faultDetailClass.getName());
            JAXBElement root = new JAXBElement(qName, faultDetailClass, faultDetail);
            jaxbMarshaller.marshal(root, stringWriter);
            String result = stringWriter.toString();
            stream.println(result);
            return result;
            
        } catch (Exception ex) {
            ex.printStackTrace(stream);
        }
        
        return exception.getMessage();
    }   
    
    public static String handleBingAdsSDKException(Exception exception, PrintStream stream){
        try{
            // SDK Exceptions
            if (exception instanceof com.microsoft.bingads.CouldNotDownloadResultFileException) {
                stream.println(String.format("CouldNotDownloadResultFileException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.CouldNotUploadFileException) {
                stream.println(String.format("CouldNotUploadFileException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.OAuthTokenRequestException) {
                stream.println(String.format("OAuthTokenRequestException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if(exception instanceof com.microsoft.bingads.v13.bulk.BulkDownloadCouldNotBeCompletedException) {
                stream.println(String.format("BulkDownloadCouldNotBeCompletedException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.v13.bulk.BulkOperationInProgressException) {
                stream.println(String.format("BulkOperationInProgressException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.v13.bulk.BulkUploadCouldNotBeCompletedException) {
                stream.println(String.format("BulkUploadCouldNotBeCompletedException: %s\nMessage: %s\n\n", exception.getMessage()));
            }  
            else if(exception instanceof com.microsoft.bingads.v13.bulk.CouldNotGetBulkOperationStatusException) {
                stream.println(String.format("CouldNotGetBulkOperationStatusException   : %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if(exception instanceof com.microsoft.bingads.v13.bulk.CouldNotSubmitBulkDownloadException) {
                stream.println(String.format("CouldNotSubmitBulkDownloadException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.v13.bulk.CouldNotSubmitBulkDownloadException) {
                stream.println(String.format("CouldNotSubmitBulkDownloadException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.v13.bulk.EntityReadException) {
                stream.println(String.format("EntityReadException: %s\nMessage: %s\n\n", exception.getMessage()));
            }  
            else if(exception instanceof com.microsoft.bingads.v13.bulk.EntityWriteException) {
                stream.println(String.format("EntityWriteException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if(exception instanceof com.microsoft.bingads.v13.reporting.CouldNotGetReportingDownloadStatusException) {
                stream.println(String.format("CouldNotGetReportingDownloadStatusException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.v13.reporting.CouldNotSubmitReportingDownloadException) {
                stream.println(String.format("CouldNotSubmitReportingDownloadException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            else if (exception instanceof com.microsoft.bingads.v13.reporting.ReportingOperationCouldNotBeCompletedException) {
                stream.println(String.format("ReportingOperationCouldNotBeCompletedException: %s\nMessage: %s\n\n", exception.getMessage()));
            }  
            else if(exception instanceof com.microsoft.bingads.v13.reporting.ReportingOperationInProgressException) {
                stream.println(String.format("ReportingOperationInProgressException: %s\nMessage: %s\n\n", exception.getMessage()));
            } 
            
            // Ad Insight Service Execution Exceptions
            else if (exception instanceof com.microsoft.bingads.v13.adinsight.AdApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.adinsight.AdApiError error : 
                        ((com.microsoft.bingads.v13.adinsight.AdApiFaultDetail_Exception)exception).getFaultInfo().getErrors().getAdApiErrors())
                {
                    stream.println("AdApiError\n");
                    stream.println(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                }
            } 
            else if(exception instanceof com.microsoft.bingads.v13.adinsight.ApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.adinsight.BatchError error : 
                        ((com.microsoft.bingads.v13.adinsight.ApiFaultDetail_Exception)exception).getFaultInfo().getBatchErrors().getBatchErrors())
                {
                    stream.println(String.format("BatchError at Index: %d\n", error.getIndex()));
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
                for (com.microsoft.bingads.v13.adinsight.OperationError error : 
                        ((com.microsoft.bingads.v13.adinsight.ApiFaultDetail_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            } 
            
            // Bulk Service Execution Exceptions
            else if (exception instanceof com.microsoft.bingads.v13.bulk.AdApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.bulk.AdApiError error : 
                        ((com.microsoft.bingads.v13.bulk.AdApiFaultDetail_Exception)exception).getFaultInfo().getErrors().getAdApiErrors())
                {
                    stream.println("AdApiError\n");
                    stream.println(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                }
            } 
            else if(exception instanceof com.microsoft.bingads.v13.bulk.ApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.bulk.BatchError error : 
                        ((com.microsoft.bingads.v13.bulk.ApiFaultDetail_Exception)exception).getFaultInfo().getBatchErrors().getBatchErrors())
                {
                    stream.println(String.format("BatchError at Index: %d\n", error.getIndex()));
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
                for (com.microsoft.bingads.v13.bulk.OperationError error : 
                        ((com.microsoft.bingads.v13.bulk.ApiFaultDetail_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            }       
            
            // Campaign Management Service Execution Exceptions
            else if(exception instanceof com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.campaignmanagement.AdApiError error : 
                        ((com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail_Exception)exception).getFaultInfo().getErrors().getAdApiErrors())
                {
                    stream.println("AdApiError\n");
                    stream.println(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                }
            } 
            else if(exception instanceof com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.campaignmanagement.BatchError error : 
                        ((com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception)exception).getFaultInfo().getBatchErrors().getBatchErrors())
                {
                    stream.println(String.format("BatchError at Index: %d\n", error.getIndex()));
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
                for (com.microsoft.bingads.v13.campaignmanagement.OperationError error : 
                        ((com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            } 
            else if(exception instanceof com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.campaignmanagement.BatchError error : 
                        ((com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception)exception).getFaultInfo().getBatchErrors().getBatchErrors())
                {
                    stream.println(String.format("BatchError at Index: %d\n", error.getIndex()));
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
                for (com.microsoft.bingads.v13.campaignmanagement.EditorialError error : 
                        ((com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception)exception).getFaultInfo().getEditorialErrors().getEditorialErrors())
                {
                    stream.println(String.format("EditorialError at Index: %d\n\n", error.getIndex()));
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                    stream.println(String.format("Appealable: %s\nDisapproved Text: %s\nCountry: %s\n\n", 
                                    error.getAppealable(), error.getDisapprovedText(), error.getPublisherCountry()));
                }
                for (com.microsoft.bingads.v13.campaignmanagement.OperationError error : 
                        ((com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            }
            
            // Customer Billing Service Execution Exceptions
            else if(exception instanceof com.microsoft.bingads.v13.customerbilling.AdApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.customerbilling.AdApiError error : 
                        ((com.microsoft.bingads.v13.customerbilling.AdApiFaultDetail_Exception)exception).getFaultInfo().getErrors().getAdApiErrors())
                {
                    stream.println("AdApiError\n");
                    stream.println(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                }
            }
            else if(exception instanceof com.microsoft.bingads.v13.customerbilling.ApiFault_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.customerbilling.OperationError error : 
                        ((com.microsoft.bingads.v13.customerbilling.ApiFault_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            }
            else if(exception instanceof com.microsoft.bingads.v13.customerbilling.ApiBatchFault_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.customerbilling.BatchError error : 
                        ((com.microsoft.bingads.v13.customerbilling.ApiBatchFault_Exception)exception).getFaultInfo().getBatchErrors().getBatchErrors())
                {
                    stream.println("BatchError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
                for (com.microsoft.bingads.v13.customerbilling.OperationError error : 
                        ((com.microsoft.bingads.v13.customerbilling.ApiBatchFault_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }                
            }
            
            // Customer Management Service Execution Exceptions
            else if(exception instanceof com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.customermanagement.AdApiError error : 
                        ((com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail_Exception)exception).getFaultInfo().getErrors().getAdApiErrors())
                {
                    stream.println("AdApiError\n");
                    stream.println(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                }
            }
            else if(exception instanceof com.microsoft.bingads.v13.customermanagement.ApiFault_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.customermanagement.OperationError error : 
                        ((com.microsoft.bingads.v13.customermanagement.ApiFault_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            }
            
            // Reporting Service Execution Exceptions
            else if (exception instanceof com.microsoft.bingads.v13.reporting.AdApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.reporting.AdApiError error : 
                        ((com.microsoft.bingads.v13.reporting.AdApiFaultDetail_Exception)exception).getFaultInfo().getErrors().getAdApiErrors())
                {
                    stream.println("AdApiError\n");
                    stream.println(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
                }
            } 
            else if(exception instanceof com.microsoft.bingads.v13.reporting.ApiFaultDetail_Exception) {
                stream.println("The operation failed with the following faults:\n");
                for (com.microsoft.bingads.v13.reporting.BatchError error : 
                        ((com.microsoft.bingads.v13.reporting.ApiFaultDetail_Exception)exception).getFaultInfo().getBatchErrors().getBatchErrors())
                {
                    stream.println(String.format("BatchError at Index: %d\n", error.getIndex()));
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
                for (com.microsoft.bingads.v13.reporting.OperationError error : 
                        ((com.microsoft.bingads.v13.reporting.ApiFaultDetail_Exception)exception).getFaultInfo().getOperationErrors().getOperationErrors())
                {
                    stream.println("OperationError\n");
                    stream.println(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                }
            } 
            
            // Other Java Platform Exceptions
            else if (exception instanceof IOException) {
                stream.println(exception.getMessage());
            } 
            else if (exception instanceof InterruptedException) {
                stream.println(exception.getMessage());
            } 
            else if(exception instanceof RemoteException) {
                stream.println(exception.getMessage());
            } 
            else if(exception instanceof TimeoutException) {
                stream.println(exception.getMessage());
            } 
            else if(exception instanceof URISyntaxException) {
                stream.println(exception.getMessage());
            } 
            
        } 
        catch (Exception ex) {
            exception.printStackTrace(stream);
        }
        
        return exception.getMessage();
    }
}
