/*
 * Visier Tenant Management APIs
 * Visier APIs for managing tenants
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.BusinessLocationDTO;
import com.konfigthis.client.model.CustomPropertyDTO;
import com.konfigthis.client.model.HomeAnalysisByUserGroupDTO;
import com.konfigthis.client.model.MaskMessage;
import com.konfigthis.client.model.Status;
import com.konfigthis.client.model.TenantManagementAPIGetResponseDTO;
import com.konfigthis.client.model.TenantManagementAPIListResponseDTO;
import com.konfigthis.client.model.TenantManagementAPIUpdateRequestDTO;
import com.konfigthis.client.model.TenantManagementAPIUpdateResponseDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TenantManagementApi
 */
@Disabled
public class TenantManagementApiTest {

    private static TenantManagementApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TenantManagementApi(apiClient);
    }

    /**
     * Add an analytic tenant
     *
     * Prior to processing and loading an analytic tenant&#39;s data files, you must provision, or create, that tenant. A  provisioned analytic tenant is automatically enabled. If the tenant&#39;s data is loaded after provisioning, that data  is immediately accessible by their users.   This API allows you to create an analytic tenant and identify the  applications assigned to the tenant. Visier organizes content under a set of modules.   Contact Visier Support to determine the list of modules allocated to you.   **Note:** API requests that contain **homeAnalysisId**, **homeAnalysisByUserGroup**, or **clickThroughLink** take  longer to run because they require publishing a project to production.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTenantTest() throws ApiException {
        String tenantCode = null;
        String tenantDisplayName = null;
        String tenantShortName = null;
        String vanityUrlName = null;
        Integer industryCode = null;
        BusinessLocationDTO primaryBusinessLocation = null;
        List<String> purchasedModules = null;
        List<String> embeddableDomains = null;
        List<CustomPropertyDTO> customProperties = null;
        List<String> ssoInstanceIssuers = null;
        String homeAnalysisId = null;
        List<HomeAnalysisByUserGroupDTO> homeAnalysisByUserGroup = null;
        String updateAction = null;
        Boolean enabled = null;
        String clickThroughLink = null;
        TenantManagementAPIUpdateResponseDTO response = api.createTenant()
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
        // TODO: test validations
    }

    /**
     * Retrieve a list of all analytic tenants
     *
     * Use this API to retrieve the full list of analytic tenants managed by you with their current states and the content  modules assigned to them, and all other relevant details for the tenants if requested.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTenantsTest() throws ApiException {
        String mask = null;
        Integer limit = null;
        Integer start = null;
        TenantManagementAPIListResponseDTO response = api.listTenants()
                .mask(mask)
                .limit(limit)
                .start(start)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve an analytic tenant&#39;s details
     *
     * Use this API to retrieve the details for a specified analytic tenant. Doing so allows you to see the current state  of the tenant, the content modules assigned to it, and all other relevant details for the tenant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tenantInfoTest() throws ApiException {
        String tenantId = null;
        String mask = null;
        TenantManagementAPIGetResponseDTO response = api.tenantInfo(tenantId)
                .mask(mask)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an analytic tenant
     *
     * You may need to update analytic tenants as they grow and as your organization upgrades the content available to them.  You may also encounter a scenario where an analytic tenant transitions across different industries. To make updates  to your tenants, use this API.   * To ensure that the analytic tenant receives accurate benchmarks and predictive functionality, update their industry code in the Visier system.  * To programmatically assign the Home analysis that analytic tenants see at login, use this API to set the default Home analysis for a tenant and specific user groups of that tenant.   You can use this API to update any field on an analytic tenant, except tenantCode.   **Note:** API requests that contain **homeAnalysisId**, **homeAnalysisByUserGroup**, or **clickThroughLink** take  longer to run because they require publishing a project to production.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTenantTest() throws ApiException {
        String tenantCode = null;
        String tenantDisplayName = null;
        String tenantShortName = null;
        String vanityUrlName = null;
        Integer industryCode = null;
        BusinessLocationDTO primaryBusinessLocation = null;
        List<String> purchasedModules = null;
        List<String> embeddableDomains = null;
        List<CustomPropertyDTO> customProperties = null;
        List<String> ssoInstanceIssuers = null;
        String homeAnalysisId = null;
        List<HomeAnalysisByUserGroupDTO> homeAnalysisByUserGroup = null;
        String updateAction = null;
        Boolean enabled = null;
        String clickThroughLink = null;
        TenantManagementAPIUpdateResponseDTO response = api.updateTenant()
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
        // TODO: test validations
    }

}
