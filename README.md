<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for managing tenants

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=TenantManagement&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-tenant-management-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-tenant-management-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-tenant-management-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierTenantManagement client = new VisierTenantManagement(configuration);
    String tenantCode = "tenantCode_example"; // A unique identifier for the newly created analytic tenant. Required if creating new tenants.
    String tenantDisplayName = "tenantDisplayName_example"; // A new display name to assign to the analytic tenant. Required if creating new tenants.
    String tenantShortName = "tenantShortName_example"; // A new short name to assign to the tenant. Required for Enterprise tenants
    String vanityUrlName = "vanityUrlName_example"; // A new vanity name to assign to the tenant. Required for Enterprise tenants
    Integer industryCode = 56; // The 6-digit NAICS code for the industry to which the analytic tenant belongs. If the code is unknown, type 000000.  For 2-digit codes, add trailing zeros at the end to reach 6 digits, such as 620000. Required if creating new tenants.
    BusinessLocationDTO primaryBusinessLocation = new BusinessLocationDTO(); // The primary location of operations or where business is performed. This field is optional.
    List<String> purchasedModules = Arrays.asList(); // A comma-separated collection of strings that represent the Visier modules assigned to the new analytic tenant. Required if creating new tenants.
    List<String> embeddableDomains = Arrays.asList(); // A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded. If domains at the administrating tenant level match the domains at the analytic tenant level, you do not need to include a domain for each analytic tenant. This is optional.
    List<CustomPropertyDTO> customProperties = Arrays.asList(); // A list of objects that represent different customizable properties for the analytic tenant. This is optional.
    List<String> ssoInstanceIssuers = Arrays.asList(); // A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant. This is optional.
    String homeAnalysisId = "homeAnalysisId_example"; // The unique ID of the analysis to display for this tenant when a user logs in. This is optional. Causes the API request to take longer because it must publish a project to production.   Retrieve the ID by opening an analysis in the production version of a tenant and copying the string after the last forward slash (/) in the URL. For example: https://jupiter.visier.com/hr/prod/appcontainer?previewId=-eZPm8xvo3SUMpD4Q5pdE-6mCj9CQ9K699XgqRGwtOxagH5x2IzDFawlWn3hYqFEfU7nP0YK9ASEzmrNfAihGg..&previewType=Production#/analytics/myanalyses/8a4c1d4f-eb61-4da0-9e5b-55bef757c30e   The `homeAnalysisID` is 8a4c1d4f-eb61-4da0-9e5b-55bef757c30e. Alternatively, retrieve the ID by copying the `contentId` found by following the `Embed a visualization` documentation.
    List<HomeAnalysisByUserGroupDTO> homeAnalysisByUserGroup = Arrays.asList(); // A list of objects representing the analysis to display to specific user groups when users log in. This is optional. Causes the API request to take longer because it must publish a project to production.
    String updateAction = "MERGE"; // Specifies the way you want to update values. Default is MERGE.  Valid values:  - `MERGE`: Combine the existing values with the new values.  - `REPLACE`: Remove existing values and let the new values take their place.
    Boolean enabled = true; // If true, the tenant is enabled. Enabled tenants have access to Visier visualizations.
    String clickThroughLink = "clickThroughLink_example"; // A custom URL to redirect users into your portal to see the relevant content. This URL is used for links that are shared by and with your users through the sharing capability or email content. This is optional. Causes the API request to take longer because it must publish a project to production.
    try {
      TenantManagementAPIUpdateResponseDTO result = client
              .tenantManagement
              .createTenant()
              .tenantCode(tenantCode)
              .tenantDisplayName(tenantDisplayName)
              .tenantShortName(tenantShortName)
              .vanityUrlName(vanityUrlName)
              .industryCode(industryCode)
              .primaryBusinessLocation(primaryBusinessLocation)
              .purchasedModules(purchasedModules)
              .embeddableDomains(embeddableDomains)
              .customProperties(customProperties)
              .ssoInstanceIssuers(ssoInstanceIssuers)
              .homeAnalysisId(homeAnalysisId)
              .homeAnalysisByUserGroup(homeAnalysisByUserGroup)
              .updateAction(updateAction)
              .enabled(enabled)
              .clickThroughLink(clickThroughLink)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getIndustryCode());
      System.out.println(result.getPrimaryBusinessLocation());
      System.out.println(result.getPurchasedModules());
      System.out.println(result.getEmbeddableDomains());
      System.out.println(result.getCustomProperties());
      System.out.println(result.getSsoInstanceIssuers());
      System.out.println(result.getHomeAnalysisId());
      System.out.println(result.getHomeAnalysisByUserGroup());
      System.out.println(result.getStatus());
      System.out.println(result.getClickThroughLink());
      System.out.println(result.getVanityUrlName());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementApi#createTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantManagementAPIUpdateResponseDTO> response = client
              .tenantManagement
              .createTenant()
              .tenantCode(tenantCode)
              .tenantDisplayName(tenantDisplayName)
              .tenantShortName(tenantShortName)
              .vanityUrlName(vanityUrlName)
              .industryCode(industryCode)
              .primaryBusinessLocation(primaryBusinessLocation)
              .purchasedModules(purchasedModules)
              .embeddableDomains(embeddableDomains)
              .customProperties(customProperties)
              .ssoInstanceIssuers(ssoInstanceIssuers)
              .homeAnalysisId(homeAnalysisId)
              .homeAnalysisByUserGroup(homeAnalysisByUserGroup)
              .updateAction(updateAction)
              .enabled(enabled)
              .clickThroughLink(clickThroughLink)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementApi#createTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TenantManagementApi* | [**createTenant**](docs/TenantManagementApi.md#createTenant) | **POST** /v2/admin/tenants | Add an analytic tenant
*TenantManagementApi* | [**listTenants**](docs/TenantManagementApi.md#listTenants) | **GET** /v2/admin/tenants | Retrieve a list of all analytic tenants
*TenantManagementApi* | [**tenantInfo**](docs/TenantManagementApi.md#tenantInfo) | **GET** /v2/admin/tenants/{tenantId} | Retrieve an analytic tenant&#39;s details
*TenantManagementApi* | [**updateTenant**](docs/TenantManagementApi.md#updateTenant) | **PUT** /v2/admin/tenants/:tenantId | Update an analytic tenant
*TenantManagementV1Api* | [**addTenant**](docs/TenantManagementV1Api.md#addTenant) | **POST** /v1/admin/tenants | Add an analytic tenant
*TenantManagementV1Api* | [**deleteTenant**](docs/TenantManagementV1Api.md#deleteTenant) | **DELETE** /v1/admin/tenants/:tenantId | Deprovision an analytic tenant
*TenantManagementV1Api* | [**disableTenant**](docs/TenantManagementV1Api.md#disableTenant) | **PUT** /v1/admin/tenants/:tenantId/disable | Disable an analytic tenant
*TenantManagementV1Api* | [**enableTenant**](docs/TenantManagementV1Api.md#enableTenant) | **PUT** /v1/admin/tenants/:tenantId/enable | Enable an analytic tenant
*TenantManagementV1Api* | [**getTenant**](docs/TenantManagementV1Api.md#getTenant) | **GET** /v1/admin/tenants/:tenantId | Retrieve an analytic tenant&#39;s details
*TenantManagementV1Api* | [**getTenants**](docs/TenantManagementV1Api.md#getTenants) | **GET** /v1/admin/tenants | Retrieve a list of all analytic tenants
*TenantManagementV1Api* | [**updateTenant**](docs/TenantManagementV1Api.md#updateTenant) | **PUT** /v1/admin/tenants/:tenantId | Update an analytic tenant
*TenantManagementV1Api* | [**validateTenant**](docs/TenantManagementV1Api.md#validateTenant) | **GET** /v1/op/validation/tenants/:tenantId | Validate an analytic tenant&#39;s metric values
*TenantManagementV1Api* | [**validateTenants**](docs/TenantManagementV1Api.md#validateTenants) | **GET** /v1/op/validation/tenants | Validate metric values for all analytic tenants


## Documentation for Models

 - [AllTenantsStatusAPIDTO](docs/AllTenantsStatusAPIDTO.md)
 - [BusinessLocationDTO](docs/BusinessLocationDTO.md)
 - [CustomPropertyDTO](docs/CustomPropertyDTO.md)
 - [CustomTenantPropertyDTO](docs/CustomTenantPropertyDTO.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [HomeAnalysisByUserGroupDTO](docs/HomeAnalysisByUserGroupDTO.md)
 - [MaskMessage](docs/MaskMessage.md)
 - [MetricValidationSummaryDTO](docs/MetricValidationSummaryDTO.md)
 - [ModuleSettingsDTO](docs/ModuleSettingsDTO.md)
 - [Status](docs/Status.md)
 - [TenantDetailAPIDTO](docs/TenantDetailAPIDTO.md)
 - [TenantManagementAPIGetResponseDTO](docs/TenantManagementAPIGetResponseDTO.md)
 - [TenantManagementAPIListResponseDTO](docs/TenantManagementAPIListResponseDTO.md)
 - [TenantManagementAPIUpdateRequestDTO](docs/TenantManagementAPIUpdateRequestDTO.md)
 - [TenantManagementAPIUpdateResponseDTO](docs/TenantManagementAPIUpdateResponseDTO.md)
 - [TenantModuleDTO](docs/TenantModuleDTO.md)
 - [TenantPreviewEntriesSummaryDTO](docs/TenantPreviewEntriesSummaryDTO.md)
 - [TenantPreviewEntriesSummaryListDTO](docs/TenantPreviewEntriesSummaryListDTO.md)
 - [TenantProvisionAPIDTO](docs/TenantProvisionAPIDTO.md)
 - [TenantStatusAPIDTO](docs/TenantStatusAPIDTO.md)
 - [UpdateTenantModel](docs/UpdateTenantModel.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
