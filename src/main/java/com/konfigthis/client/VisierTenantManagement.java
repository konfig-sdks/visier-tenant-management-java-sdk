package com.konfigthis.client;

import com.konfigthis.client.api.TenantManagementApi;
import com.konfigthis.client.api.TenantManagementV1Api;

public class VisierTenantManagement {
    private ApiClient apiClient;
    public final TenantManagementApi tenantManagement;
    public final TenantManagementV1Api tenantManagementV1;

    public VisierTenantManagement() {
        this(null);
    }

    public VisierTenantManagement(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.tenantManagement = new TenantManagementApi(this.apiClient);
        this.tenantManagementV1 = new TenantManagementV1Api(this.apiClient);
    }

}
