

# TenantManagementAPIUpdateResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The unique identifier of the newly created analytic tenant. |  [optional] |
|**tenantDisplayName** | **String** | A comma-separated collection of strings that represent the Visier modules assigned to the new analytic tenant. |  [optional] |
|**industryCode** | **Integer** | The 6-digit NAICS code for the industry to which the analytic tenant belongs. |  [optional] |
|**primaryBusinessLocation** | [**BusinessLocationDTO**](BusinessLocationDTO.md) | The primary location of operations or where business is performed. If undefined, it is omitted from the response. |  [optional] |
|**purchasedModules** | **List&lt;String&gt;** | A comma-separated collection of strings that represent the Visier modules assigned to the new analytic tenant. |  [optional] |
|**embeddableDomains** | **List&lt;String&gt;** | A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded. If domains at the administrating tenant level match the domains at the analytic tenant level, you do not need to include a domain for each analytic tenant. |  [optional] |
|**customProperties** | [**List&lt;CustomPropertyDTO&gt;**](CustomPropertyDTO.md) | A list of objects that represent different customizable properties for the analytic tenant. |  [optional] |
|**ssoInstanceIssuers** | **List&lt;String&gt;** | A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant. |  [optional] |
|**homeAnalysisId** | **String** | The unique ID of the analysis to display for this tenant when a user logs in. This is optional.   Retrieve the ID by opening an analysis in the production version of a tenant and copying the string after the last forward slash (/) in the URL. For example: https://jupiter.visier.com/hr/prod/appcontainer?previewId&#x3D;-eZPm8xvo3SUMpD4Q5pdE-6mCj9CQ9K699XgqRGwtOxagH5x2IzDFawlWn3hYqFEfU7nP0YK9ASEzmrNfAihGg..&amp;previewType&#x3D;Production#/analytics/myanalyses/8a4c1d4f-eb61-4da0-9e5b-55bef757c30e.  The &#x60;homeAnalysisID&#x60; is 8a4c1d4f-eb61-4da0-9e5b-55bef757c30e.   Alternatively, retrieve the ID by copying the &#x60;contentId&#x60; found by following the &#x60;Embed a visualization&#x60; documentation. |  [optional] |
|**homeAnalysisByUserGroup** | [**List&lt;HomeAnalysisByUserGroupDTO&gt;**](HomeAnalysisByUserGroupDTO.md) | A list of objects representing the analysis to display to specific user groups when users log in. |  [optional] |
|**status** | **String** | Whether the tenant is enabled or disabled. Enabled tenants have access to Visier visualizations. |  [optional] |
|**clickThroughLink** | **String** | A custom URL to redirect users into your portal to see the relevant content. This URL is used for links that are shared by and with your users through the sharing capability or email content. |  [optional] |
|**vanityUrlName** | **String** | The name of the administrating tenant used in Visier URLs. |  [optional] |



