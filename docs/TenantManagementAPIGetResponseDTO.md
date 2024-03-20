

# TenantManagementAPIGetResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The tenant code of the analytic tenant. For example, \&quot;WFF_j1r~i1o\&quot; |  [optional] |
|**tenantDisplayName** | **String** | An identifiable tenant name that is displayed within Visier. For example, \&quot;Callisto\&quot;. |  [optional] |
|**status** | **String** | Whether the tenant is enabled or disabled. |  [optional] |
|**provisionDate** | **String** | The date that the tenant was created. |  [optional] |
|**currentDataVersion** | **String** | The data version ID that the tenant is using. |  [optional] |
|**dataVersionDate** | **String** | The date that the data version was published to production. |  [optional] |
|**purchasedModules** | **List&lt;String&gt;** | The modules assigned to the analytic tenant. |  [optional] |
|**industryCode** | **Integer** | The 6-digit NAICS code for the industry to which the analytic tenant belongs. |  [optional] |
|**primaryBusinessLocation** | [**BusinessLocationDTO**](BusinessLocationDTO.md) | The primary location of operations or where business is performed. If undefined, it is omitted from the response. |  [optional] |
|**canAdministerOtherTenants** | **Boolean** | If true, the tenant is an administrating tenant. |  [optional] |
|**embeddableDomains** | **List&lt;String&gt;** | A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded. |  [optional] |
|**customProperties** | [**List&lt;CustomPropertyDTO&gt;**](CustomPropertyDTO.md) | A set of key-value pairs that represent different customizable properties for the analytic tenant. |  [optional] |
|**ssoInstanceIssuers** | **List&lt;String&gt;** | A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant. |  [optional] |
|**vanityUrlName** | **String** | The name of the administrating tenant used in Visier URLs. |  [optional] |
|**homeAnalysisId** | **String** | The unique ID of the analysis that&#39;s displayed for this tenant when a user logs in. |  [optional] |
|**homeAnalysisByUserGroup** | [**List&lt;HomeAnalysisByUserGroupDTO&gt;**](HomeAnalysisByUserGroupDTO.md) | A list of objects representing the analysis displayed to specific user groups when users log in. |  [optional] |
|**clickThroughLink** | **String** | The custom URL to redirect users into your portal to see the relevant content. This URL is used for links that are shared by and with your users through the sharing capability or email content. |  [optional] |
|**clickThroughLinkEnabled** | **String** | Whether the click-through link is enabled or disabled. |  [optional] |



