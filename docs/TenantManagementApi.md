# TenantManagementApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTenant**](TenantManagementApi.md#createTenant) | **POST** /v2/admin/tenants | Add an analytic tenant |
| [**listTenants**](TenantManagementApi.md#listTenants) | **GET** /v2/admin/tenants | Retrieve a list of all analytic tenants |
| [**tenantInfo**](TenantManagementApi.md#tenantInfo) | **GET** /v2/admin/tenants/{tenantId} | Retrieve an analytic tenant&#39;s details |
| [**updateTenant**](TenantManagementApi.md#updateTenant) | **PUT** /v2/admin/tenants/:tenantId | Update an analytic tenant |


<a name="createTenant"></a>
# **createTenant**
> TenantManagementAPIUpdateResponseDTO createTenant(tenantManagementAPIUpdateRequestDTO).execute();

Add an analytic tenant

Prior to processing and loading an analytic tenant&#39;s data files, you must provision, or create, that tenant. A  provisioned analytic tenant is automatically enabled. If the tenant&#39;s data is loaded after provisioning, that data  is immediately accessible by their users.   This API allows you to create an analytic tenant and identify the  applications assigned to the tenant. Visier organizes content under a set of modules.   Contact Visier Support to determine the list of modules allocated to you.   **Note:** API requests that contain **homeAnalysisId**, **homeAnalysisByUserGroup**, or **clickThroughLink** take  longer to run because they require publishing a project to production.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantManagementAPIUpdateRequestDTO** | [**TenantManagementAPIUpdateRequestDTO**](TenantManagementAPIUpdateRequestDTO.md)|  | |

### Return type

[**TenantManagementAPIUpdateResponseDTO**](TenantManagementAPIUpdateResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="listTenants"></a>
# **listTenants**
> TenantManagementAPIListResponseDTO listTenants(maskMessage).limit(limit).start(start).execute();

Retrieve a list of all analytic tenants

Use this API to retrieve the full list of analytic tenants managed by you with their current states and the content  modules assigned to them, and all other relevant details for the tenants if requested.

### Example
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
    String mask = "mask_example"; // A comma separated list of strings that specifies which fields to include in the response.
    Integer limit = 56; // The maximum number of tenants to return. Default is 400.
    Integer start = 56; // The starting index of the first tenant to return. Default is 0.
    try {
      TenantManagementAPIListResponseDTO result = client
              .tenantManagement
              .listTenants()
              .mask(mask)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementApi#listTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantManagementAPIListResponseDTO> response = client
              .tenantManagement
              .listTenants()
              .mask(mask)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementApi#listTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **maskMessage** | [**MaskMessage**](MaskMessage.md)|  | |
| **limit** | **Integer**| The maximum number of tenants to return. Default is 400. | [optional] |
| **start** | **Integer**| The starting index of the first tenant to return. Default is 0. | [optional] |

### Return type

[**TenantManagementAPIListResponseDTO**](TenantManagementAPIListResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="tenantInfo"></a>
# **tenantInfo**
> TenantManagementAPIGetResponseDTO tenantInfo(tenantId, maskMessage).execute();

Retrieve an analytic tenant&#39;s details

Use this API to retrieve the details for a specified analytic tenant. Doing so allows you to see the current state  of the tenant, the content modules assigned to it, and all other relevant details for the tenant.

### Example
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
    String tenantId = "tenantId_example"; // The ID of the tenant to retrieve.
    String mask = "mask_example"; // A comma separated list of strings that specifies which fields to include in the response.
    try {
      TenantManagementAPIGetResponseDTO result = client
              .tenantManagement
              .tenantInfo(tenantId)
              .mask(mask)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getStatus());
      System.out.println(result.getProvisionDate());
      System.out.println(result.getCurrentDataVersion());
      System.out.println(result.getDataVersionDate());
      System.out.println(result.getPurchasedModules());
      System.out.println(result.getIndustryCode());
      System.out.println(result.getPrimaryBusinessLocation());
      System.out.println(result.getCanAdministerOtherTenants());
      System.out.println(result.getEmbeddableDomains());
      System.out.println(result.getCustomProperties());
      System.out.println(result.getSsoInstanceIssuers());
      System.out.println(result.getVanityUrlName());
      System.out.println(result.getHomeAnalysisId());
      System.out.println(result.getHomeAnalysisByUserGroup());
      System.out.println(result.getClickThroughLink());
      System.out.println(result.getClickThroughLinkEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementApi#tenantInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantManagementAPIGetResponseDTO> response = client
              .tenantManagement
              .tenantInfo(tenantId)
              .mask(mask)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementApi#tenantInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| The ID of the tenant to retrieve. | |
| **maskMessage** | [**MaskMessage**](MaskMessage.md)|  | |

### Return type

[**TenantManagementAPIGetResponseDTO**](TenantManagementAPIGetResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="updateTenant"></a>
# **updateTenant**
> TenantManagementAPIUpdateResponseDTO updateTenant(tenantManagementAPIUpdateRequestDTO).execute();

Update an analytic tenant

You may need to update analytic tenants as they grow and as your organization upgrades the content available to them.  You may also encounter a scenario where an analytic tenant transitions across different industries. To make updates  to your tenants, use this API.   * To ensure that the analytic tenant receives accurate benchmarks and predictive functionality, update their industry code in the Visier system.  * To programmatically assign the Home analysis that analytic tenants see at login, use this API to set the default Home analysis for a tenant and specific user groups of that tenant.   You can use this API to update any field on an analytic tenant, except tenantCode.   **Note:** API requests that contain **homeAnalysisId**, **homeAnalysisByUserGroup**, or **clickThroughLink** take  longer to run because they require publishing a project to production.

### Example
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
              .updateTenant()
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
      System.err.println("Exception when calling TenantManagementApi#updateTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantManagementAPIUpdateResponseDTO> response = client
              .tenantManagement
              .updateTenant()
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
      System.err.println("Exception when calling TenantManagementApi#updateTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantManagementAPIUpdateRequestDTO** | [**TenantManagementAPIUpdateRequestDTO**](TenantManagementAPIUpdateRequestDTO.md)|  | |

### Return type

[**TenantManagementAPIUpdateResponseDTO**](TenantManagementAPIUpdateResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

