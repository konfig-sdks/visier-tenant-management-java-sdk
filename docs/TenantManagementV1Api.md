# TenantManagementV1Api

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTenant**](TenantManagementV1Api.md#addTenant) | **POST** /v1/admin/tenants | Add an analytic tenant |
| [**deleteTenant**](TenantManagementV1Api.md#deleteTenant) | **DELETE** /v1/admin/tenants/:tenantId | Deprovision an analytic tenant |
| [**disableTenant**](TenantManagementV1Api.md#disableTenant) | **PUT** /v1/admin/tenants/:tenantId/disable | Disable an analytic tenant |
| [**enableTenant**](TenantManagementV1Api.md#enableTenant) | **PUT** /v1/admin/tenants/:tenantId/enable | Enable an analytic tenant |
| [**getTenant**](TenantManagementV1Api.md#getTenant) | **GET** /v1/admin/tenants/:tenantId | Retrieve an analytic tenant&#39;s details |
| [**getTenants**](TenantManagementV1Api.md#getTenants) | **GET** /v1/admin/tenants | Retrieve a list of all analytic tenants |
| [**updateTenant**](TenantManagementV1Api.md#updateTenant) | **PUT** /v1/admin/tenants/:tenantId | Update an analytic tenant |
| [**validateTenant**](TenantManagementV1Api.md#validateTenant) | **GET** /v1/op/validation/tenants/:tenantId | Validate an analytic tenant&#39;s metric values |
| [**validateTenants**](TenantManagementV1Api.md#validateTenants) | **GET** /v1/op/validation/tenants | Validate metric values for all analytic tenants |


<a name="addTenant"></a>
# **addTenant**
> TenantProvisionAPIDTO addTenant(tenantProvisionAPIDTO).execute();

Add an analytic tenant

Prior to processing and loading an analytic tenant&#39;s data files, you must provision, or create, that tenant.  A provisioned analytic tenant is automatically enabled. If the tenant&#39;s data is loaded after provisioning, that  data is immediately accessible by their users.   This API allows you to create an analytic tenant and identify the applications assigned to the tenant. Visier  organizes content under a set of modules.   Contact Visier Support to determine the list of modules allocated to you.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantCode = "tenantCode_example"; // The unique identifier of the analytic tenant.
    String tenantDisplayName = "tenantDisplayName_example"; // The display name that is assigned to the analytic tenant.
    List<String> purchasedModules = Arrays.asList(); // A comma-separated list of strings that represent the Visier modules assigned to the analytic tenant.
    Integer industryCode = 56; // The 6-digit NAICS code for the industry to which the analytic tenant belongs. If the code is unknown, type 000000.   For 2-digit codes, add trailing zeros at the end to reach 6 digits, such as 620000.
    List<String> embeddableDomains = Arrays.asList(); // A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded. If  domains at the administrating tenant level match the domains at the analytic tenant level, you do not need  to include a domain for each analytic tenant.
    List<CustomTenantPropertyDTO> customProperties = Arrays.asList(); // A set of key-value pairs that represent different customizable properties for the analytic tenant.
    List<String> ssoInstanceIssuers = Arrays.asList(); // A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant.
    try {
      TenantProvisionAPIDTO result = client
              .tenantManagementV1
              .addTenant()
              .tenantCode(tenantCode)
              .tenantDisplayName(tenantDisplayName)
              .purchasedModules(purchasedModules)
              .industryCode(industryCode)
              .embeddableDomains(embeddableDomains)
              .customProperties(customProperties)
              .ssoInstanceIssuers(ssoInstanceIssuers)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getPurchasedModules());
      System.out.println(result.getIndustryCode());
      System.out.println(result.getEmbeddableDomains());
      System.out.println(result.getCustomProperties());
      System.out.println(result.getSsoInstanceIssuers());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#addTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantProvisionAPIDTO> response = client
              .tenantManagementV1
              .addTenant()
              .tenantCode(tenantCode)
              .tenantDisplayName(tenantDisplayName)
              .purchasedModules(purchasedModules)
              .industryCode(industryCode)
              .embeddableDomains(embeddableDomains)
              .customProperties(customProperties)
              .ssoInstanceIssuers(ssoInstanceIssuers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#addTenant");
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
| **tenantProvisionAPIDTO** | [**TenantProvisionAPIDTO**](TenantProvisionAPIDTO.md)|  | |

### Return type

[**TenantProvisionAPIDTO**](TenantProvisionAPIDTO.md)

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

<a name="deleteTenant"></a>
# **deleteTenant**
> TenantStatusAPIDTO deleteTenant().tenantId(tenantId).execute();

Deprovision an analytic tenant

Warning! Deprovisioning an analytic tenant is not reversible.  Before deprovisioning, you must disable an analytic tenant. For more information, see **&#x60;/v1/admin/tenants/:tenantId/disable&#x60;**.   This API removes an analytic tenant permanently from the Visier system. If you are unsure whether an analytic tenant  may be re-enabled on any of the Visier modules at any time, you may instead want to disable the analytic tenant.   If successful, the response returns the status \&quot;Deprovisioned\&quot;. This indicates that the tenant is scheduled for  deprovisioning, which may take several days to complete.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code.
    try {
      TenantStatusAPIDTO result = client
              .tenantManagementV1
              .deleteTenant()
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getStatus());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getCanAdministerOtherTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#deleteTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantStatusAPIDTO> response = client
              .tenantManagementV1
              .deleteTenant()
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#deleteTenant");
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
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code. | [optional] |

### Return type

[**TenantStatusAPIDTO**](TenantStatusAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="disableTenant"></a>
# **disableTenant**
> TenantStatusAPIDTO disableTenant().tenantId(tenantId).execute();

Disable an analytic tenant

Use this API to disable an analytic tenant and remove access to Visier visualizations for the tenant&#39;s users.   You must disable an analytic tenant before deprovisioning, or removing, it from the system.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code.
    try {
      TenantStatusAPIDTO result = client
              .tenantManagementV1
              .disableTenant()
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getStatus());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getCanAdministerOtherTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#disableTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantStatusAPIDTO> response = client
              .tenantManagementV1
              .disableTenant()
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#disableTenant");
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
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code. | [optional] |

### Return type

[**TenantStatusAPIDTO**](TenantStatusAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="enableTenant"></a>
# **enableTenant**
> TenantStatusAPIDTO enableTenant().tenantId(tenantId).execute();

Enable an analytic tenant

An analytic tenant is enabled when you provision or create the tenant.   Use this API to enable a tenant that you have specifically disabled; for example, if you previously did not  want that tenant to have access to Visier visualizations, but now do.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code.
    try {
      TenantStatusAPIDTO result = client
              .tenantManagementV1
              .enableTenant()
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getStatus());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getCanAdministerOtherTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#enableTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantStatusAPIDTO> response = client
              .tenantManagementV1
              .enableTenant()
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#enableTenant");
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
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code. | [optional] |

### Return type

[**TenantStatusAPIDTO**](TenantStatusAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getTenant"></a>
# **getTenant**
> TenantDetailAPIDTO getTenant().tenantId(tenantId).execute();

Retrieve an analytic tenant&#39;s details

Use this API to retrieve all details for a specified analytic tenant. Doing so allows you to see the current state  of the tenant, the content modules assigned to it, and all other relevant details for the tenant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code.
    try {
      TenantDetailAPIDTO result = client
              .tenantManagementV1
              .getTenant()
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getStatus());
      System.out.println(result.getProvisionDate());
      System.out.println(result.getCurrentDataVersion());
      System.out.println(result.getDataVersionDate());
      System.out.println(result.getModules());
      System.out.println(result.getIndustryCode());
      System.out.println(result.getCanAdministerOtherTenants());
      System.out.println(result.getEmbeddableDomains());
      System.out.println(result.getCustomProperties());
      System.out.println(result.getSsoInstanceIssuers());
      System.out.println(result.getVanityUrlName());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#getTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantDetailAPIDTO> response = client
              .tenantManagementV1
              .getTenant()
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#getTenant");
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
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code. | [optional] |

### Return type

[**TenantDetailAPIDTO**](TenantDetailAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getTenants"></a>
# **getTenants**
> AllTenantsStatusAPIDTO getTenants().limit(limit).start(start).details(details).execute();

Retrieve a list of all analytic tenants

Use this API to retrieve the full list of analytic tenants managed by you with their current states and the  content modules assigned to them, and all other relevant details for the tenants if requested.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    Integer limit = 56; // The limit of analytic tenant details to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    Boolean details = true; // If true, the response returns information about the data version and modules.
    try {
      AllTenantsStatusAPIDTO result = client
              .tenantManagementV1
              .getTenants()
              .limit(limit)
              .start(start)
              .details(details)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#getTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AllTenantsStatusAPIDTO> response = client
              .tenantManagementV1
              .getTenants()
              .limit(limit)
              .start(start)
              .details(details)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#getTenants");
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
| **limit** | **Integer**| The limit of analytic tenant details to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **details** | **Boolean**| If true, the response returns information about the data version and modules. | [optional] |

### Return type

[**AllTenantsStatusAPIDTO**](AllTenantsStatusAPIDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="updateTenant"></a>
# **updateTenant**
> TenantProvisionAPIDTO updateTenant(updateTenantModel).tenantId(tenantId).execute();

Update an analytic tenant

You may need to update analytic tenants as they grow and as your organization upgrades the content available to  them. You may also encounter a scenario where an analytic tenant transitions across different industries.   To ensure that the analytic tenant receives accurate benchmarks and predictive functionality, update their  industry code in the Visier system.   You can use this API to update any field on an analytic tenant, except tenantCode.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantDisplayName = "tenantDisplayName_example"; // A display name that is assigned to the new analytic tenant.
    Integer industryCode = 56; // The 6-digit NAICS code for the industry to which the analytic tenant belongs. If the code is unknown, type 000000.   For 2-digit codes, add trailing zeros at the end to reach 6 digits, such as 620000.
    List<String> purchasedModules = Arrays.asList(); // A comma-separated collection of strings that represent the Visier modules assigned to the new analytic tenant.
    List<String> embeddableDomains = Arrays.asList(); // A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded. If  domains at the administrating tenant level match the domains at the analytic tenant level, you do not need  to include a domain for each analytic tenant.
    Map<String, String> customProperties = new HashMap(); // A set of key-value pairs that represent different customizable properties for the analytic tenant.
    List<String> ssoInstanceIssuers = Arrays.asList(); // A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant.
    String tenantId = "tenantId_example"; // The ID of the tenant to update.
    try {
      TenantProvisionAPIDTO result = client
              .tenantManagementV1
              .updateTenant()
              .tenantDisplayName(tenantDisplayName)
              .industryCode(industryCode)
              .purchasedModules(purchasedModules)
              .embeddableDomains(embeddableDomains)
              .customProperties(customProperties)
              .ssoInstanceIssuers(ssoInstanceIssuers)
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getTenantDisplayName());
      System.out.println(result.getPurchasedModules());
      System.out.println(result.getIndustryCode());
      System.out.println(result.getEmbeddableDomains());
      System.out.println(result.getCustomProperties());
      System.out.println(result.getSsoInstanceIssuers());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#updateTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantProvisionAPIDTO> response = client
              .tenantManagementV1
              .updateTenant()
              .tenantDisplayName(tenantDisplayName)
              .industryCode(industryCode)
              .purchasedModules(purchasedModules)
              .embeddableDomains(embeddableDomains)
              .customProperties(customProperties)
              .ssoInstanceIssuers(ssoInstanceIssuers)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#updateTenant");
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
| **updateTenantModel** | [**UpdateTenantModel**](UpdateTenantModel.md)|  | |
| **tenantId** | **String**| The ID of the tenant to update. | [optional] |

### Return type

[**TenantProvisionAPIDTO**](TenantProvisionAPIDTO.md)

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

<a name="validateTenant"></a>
# **validateTenant**
> TenantPreviewEntriesSummaryDTO validateTenant().tenantId(tenantId).execute();

Validate an analytic tenant&#39;s metric values

Use this API to retrieve the metric values for an individual analytic tenant. The metric values included in the  response are the tenant&#39;s configured summary metrics. Administrators can configure summary metrics in a project:  - Sign in to Visier as an administrator.  - In a project, on the navigation bar, click the Home button.  - Click Dashboard, and then click Edit Summary Metrics.  - Select the metrics that you want to validate, and then close the Summary Metrics dialog.  - Publish the project to production.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code.
    try {
      TenantPreviewEntriesSummaryDTO result = client
              .tenantManagementV1
              .validateTenant()
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getDataVersion());
      System.out.println(result.getDataVersionDate());
      System.out.println(result.getMetrics());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#validateTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantPreviewEntriesSummaryDTO> response = client
              .tenantManagementV1
              .validateTenant()
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#validateTenant");
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
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~{YYY} where {XXX} is the administrating tenant code and {YYY}  is the analytic tenant code. | [optional] |

### Return type

[**TenantPreviewEntriesSummaryDTO**](TenantPreviewEntriesSummaryDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="validateTenants"></a>
# **validateTenants**
> TenantPreviewEntriesSummaryListDTO validateTenants().limit(limit).start(start).execute();

Validate metric values for all analytic tenants

As you onboard more analytic tenants, you can validate the data visible to your users to ensure it matches the  source systems from which it was exported and that it matches what your expectations are for this data.   The metric values included in the response are the tenant&#39;s configured summary metrics. Administrators can  configure summary metrics in a project:  - Sign in to Visier as an administrator.  - In a project, on the navigation bar, click the Home button.  - Click Dashboard, and then click Edit Summary Metrics.  - Select the metrics that you want to validate, and then close the Summary Metrics dialog.  - Publish the project to production.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierTenantManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TenantManagementV1Api;
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
    Integer limit = 56; // The limit of analytic tenant details to retrieve.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      TenantPreviewEntriesSummaryListDTO result = client
              .tenantManagementV1
              .validateTenants()
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#validateTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TenantPreviewEntriesSummaryListDTO> response = client
              .tenantManagementV1
              .validateTenants()
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantManagementV1Api#validateTenants");
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
| **limit** | **Integer**| The limit of analytic tenant details to retrieve. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**TenantPreviewEntriesSummaryListDTO**](TenantPreviewEntriesSummaryListDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

