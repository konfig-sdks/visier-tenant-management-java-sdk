

# TenantProvisionAPIDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The unique identifier of the analytic tenant. |  [optional] |
|**tenantDisplayName** | **String** | The display name that is assigned to the analytic tenant. |  [optional] |
|**purchasedModules** | **List&lt;String&gt;** | A comma-separated list of strings that represent the Visier modules assigned to the analytic tenant. |  [optional] |
|**industryCode** | **Integer** | The 6-digit NAICS code for the industry to which the analytic tenant belongs. If the code is unknown, type 000000.   For 2-digit codes, add trailing zeros at the end to reach 6 digits, such as 620000. |  [optional] |
|**embeddableDomains** | **List&lt;String&gt;** | A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded. If  domains at the administrating tenant level match the domains at the analytic tenant level, you do not need  to include a domain for each analytic tenant. |  [optional] |
|**customProperties** | [**List&lt;CustomTenantPropertyDTO&gt;**](CustomTenantPropertyDTO.md) | A set of key-value pairs that represent different customizable properties for the analytic tenant. |  [optional] |
|**ssoInstanceIssuers** | **List&lt;String&gt;** | A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant. |  [optional] |



