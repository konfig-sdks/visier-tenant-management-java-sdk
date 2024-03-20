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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.BusinessLocationDTO;
import com.konfigthis.client.model.CustomPropertyDTO;
import com.konfigthis.client.model.HomeAnalysisByUserGroupDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * TenantManagementAPIGetResponseDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TenantManagementAPIGetResponseDTO {
  public static final String SERIALIZED_NAME_TENANT_CODE = "tenantCode";
  @SerializedName(SERIALIZED_NAME_TENANT_CODE)
  private String tenantCode;

  public static final String SERIALIZED_NAME_TENANT_DISPLAY_NAME = "tenantDisplayName";
  @SerializedName(SERIALIZED_NAME_TENANT_DISPLAY_NAME)
  private String tenantDisplayName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PROVISION_DATE = "provisionDate";
  @SerializedName(SERIALIZED_NAME_PROVISION_DATE)
  private String provisionDate;

  public static final String SERIALIZED_NAME_CURRENT_DATA_VERSION = "currentDataVersion";
  @SerializedName(SERIALIZED_NAME_CURRENT_DATA_VERSION)
  private String currentDataVersion;

  public static final String SERIALIZED_NAME_DATA_VERSION_DATE = "dataVersionDate";
  @SerializedName(SERIALIZED_NAME_DATA_VERSION_DATE)
  private String dataVersionDate;

  public static final String SERIALIZED_NAME_PURCHASED_MODULES = "purchasedModules";
  @SerializedName(SERIALIZED_NAME_PURCHASED_MODULES)
  private List<String> purchasedModules = null;

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industryCode";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  private Integer industryCode;

  public static final String SERIALIZED_NAME_PRIMARY_BUSINESS_LOCATION = "primaryBusinessLocation";
  @SerializedName(SERIALIZED_NAME_PRIMARY_BUSINESS_LOCATION)
  private BusinessLocationDTO primaryBusinessLocation;

  public static final String SERIALIZED_NAME_CAN_ADMINISTER_OTHER_TENANTS = "canAdministerOtherTenants";
  @SerializedName(SERIALIZED_NAME_CAN_ADMINISTER_OTHER_TENANTS)
  private Boolean canAdministerOtherTenants;

  public static final String SERIALIZED_NAME_EMBEDDABLE_DOMAINS = "embeddableDomains";
  @SerializedName(SERIALIZED_NAME_EMBEDDABLE_DOMAINS)
  private List<String> embeddableDomains = null;

  public static final String SERIALIZED_NAME_CUSTOM_PROPERTIES = "customProperties";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PROPERTIES)
  private List<CustomPropertyDTO> customProperties = null;

  public static final String SERIALIZED_NAME_SSO_INSTANCE_ISSUERS = "ssoInstanceIssuers";
  @SerializedName(SERIALIZED_NAME_SSO_INSTANCE_ISSUERS)
  private List<String> ssoInstanceIssuers = null;

  public static final String SERIALIZED_NAME_VANITY_URL_NAME = "vanityUrlName";
  @SerializedName(SERIALIZED_NAME_VANITY_URL_NAME)
  private String vanityUrlName;

  public static final String SERIALIZED_NAME_HOME_ANALYSIS_ID = "homeAnalysisId";
  @SerializedName(SERIALIZED_NAME_HOME_ANALYSIS_ID)
  private String homeAnalysisId;

  public static final String SERIALIZED_NAME_HOME_ANALYSIS_BY_USER_GROUP = "homeAnalysisByUserGroup";
  @SerializedName(SERIALIZED_NAME_HOME_ANALYSIS_BY_USER_GROUP)
  private List<HomeAnalysisByUserGroupDTO> homeAnalysisByUserGroup = null;

  public static final String SERIALIZED_NAME_CLICK_THROUGH_LINK = "clickThroughLink";
  @SerializedName(SERIALIZED_NAME_CLICK_THROUGH_LINK)
  private String clickThroughLink;

  public static final String SERIALIZED_NAME_CLICK_THROUGH_LINK_ENABLED = "clickThroughLinkEnabled";
  @SerializedName(SERIALIZED_NAME_CLICK_THROUGH_LINK_ENABLED)
  private String clickThroughLinkEnabled;

  public TenantManagementAPIGetResponseDTO() {
  }

  public TenantManagementAPIGetResponseDTO tenantCode(String tenantCode) {
    
    
    
    
    this.tenantCode = tenantCode;
    return this;
  }

   /**
   * The tenant code of the analytic tenant. For example, \&quot;WFF_j1r~i1o\&quot;
   * @return tenantCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant code of the analytic tenant. For example, \"WFF_j1r~i1o\"")

  public String getTenantCode() {
    return tenantCode;
  }


  public void setTenantCode(String tenantCode) {
    
    
    
    this.tenantCode = tenantCode;
  }


  public TenantManagementAPIGetResponseDTO tenantDisplayName(String tenantDisplayName) {
    
    
    
    
    this.tenantDisplayName = tenantDisplayName;
    return this;
  }

   /**
   * An identifiable tenant name that is displayed within Visier. For example, \&quot;Callisto\&quot;.
   * @return tenantDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifiable tenant name that is displayed within Visier. For example, \"Callisto\".")

  public String getTenantDisplayName() {
    return tenantDisplayName;
  }


  public void setTenantDisplayName(String tenantDisplayName) {
    
    
    
    this.tenantDisplayName = tenantDisplayName;
  }


  public TenantManagementAPIGetResponseDTO status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Whether the tenant is enabled or disabled.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the tenant is enabled or disabled.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public TenantManagementAPIGetResponseDTO provisionDate(String provisionDate) {
    
    
    
    
    this.provisionDate = provisionDate;
    return this;
  }

   /**
   * The date that the tenant was created.
   * @return provisionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the tenant was created.")

  public String getProvisionDate() {
    return provisionDate;
  }


  public void setProvisionDate(String provisionDate) {
    
    
    
    this.provisionDate = provisionDate;
  }


  public TenantManagementAPIGetResponseDTO currentDataVersion(String currentDataVersion) {
    
    
    
    
    this.currentDataVersion = currentDataVersion;
    return this;
  }

   /**
   * The data version ID that the tenant is using.
   * @return currentDataVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data version ID that the tenant is using.")

  public String getCurrentDataVersion() {
    return currentDataVersion;
  }


  public void setCurrentDataVersion(String currentDataVersion) {
    
    
    
    this.currentDataVersion = currentDataVersion;
  }


  public TenantManagementAPIGetResponseDTO dataVersionDate(String dataVersionDate) {
    
    
    
    
    this.dataVersionDate = dataVersionDate;
    return this;
  }

   /**
   * The date that the data version was published to production.
   * @return dataVersionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the data version was published to production.")

  public String getDataVersionDate() {
    return dataVersionDate;
  }


  public void setDataVersionDate(String dataVersionDate) {
    
    
    
    this.dataVersionDate = dataVersionDate;
  }


  public TenantManagementAPIGetResponseDTO purchasedModules(List<String> purchasedModules) {
    
    
    
    
    this.purchasedModules = purchasedModules;
    return this;
  }

  public TenantManagementAPIGetResponseDTO addPurchasedModulesItem(String purchasedModulesItem) {
    if (this.purchasedModules == null) {
      this.purchasedModules = new ArrayList<>();
    }
    this.purchasedModules.add(purchasedModulesItem);
    return this;
  }

   /**
   * The modules assigned to the analytic tenant.
   * @return purchasedModules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The modules assigned to the analytic tenant.")

  public List<String> getPurchasedModules() {
    return purchasedModules;
  }


  public void setPurchasedModules(List<String> purchasedModules) {
    
    
    
    this.purchasedModules = purchasedModules;
  }


  public TenantManagementAPIGetResponseDTO industryCode(Integer industryCode) {
    
    
    
    
    this.industryCode = industryCode;
    return this;
  }

   /**
   * The 6-digit NAICS code for the industry to which the analytic tenant belongs.
   * @return industryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 6-digit NAICS code for the industry to which the analytic tenant belongs.")

  public Integer getIndustryCode() {
    return industryCode;
  }


  public void setIndustryCode(Integer industryCode) {
    
    
    
    this.industryCode = industryCode;
  }


  public TenantManagementAPIGetResponseDTO primaryBusinessLocation(BusinessLocationDTO primaryBusinessLocation) {
    
    
    
    
    this.primaryBusinessLocation = primaryBusinessLocation;
    return this;
  }

   /**
   * The primary location of operations or where business is performed. If undefined, it is omitted from the response.
   * @return primaryBusinessLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary location of operations or where business is performed. If undefined, it is omitted from the response.")

  public BusinessLocationDTO getPrimaryBusinessLocation() {
    return primaryBusinessLocation;
  }


  public void setPrimaryBusinessLocation(BusinessLocationDTO primaryBusinessLocation) {
    
    
    
    this.primaryBusinessLocation = primaryBusinessLocation;
  }


  public TenantManagementAPIGetResponseDTO canAdministerOtherTenants(Boolean canAdministerOtherTenants) {
    
    
    
    
    this.canAdministerOtherTenants = canAdministerOtherTenants;
    return this;
  }

   /**
   * If true, the tenant is an administrating tenant.
   * @return canAdministerOtherTenants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the tenant is an administrating tenant.")

  public Boolean getCanAdministerOtherTenants() {
    return canAdministerOtherTenants;
  }


  public void setCanAdministerOtherTenants(Boolean canAdministerOtherTenants) {
    
    
    
    this.canAdministerOtherTenants = canAdministerOtherTenants;
  }


  public TenantManagementAPIGetResponseDTO embeddableDomains(List<String> embeddableDomains) {
    
    
    
    
    this.embeddableDomains = embeddableDomains;
    return this;
  }

  public TenantManagementAPIGetResponseDTO addEmbeddableDomainsItem(String embeddableDomainsItem) {
    if (this.embeddableDomains == null) {
      this.embeddableDomains = new ArrayList<>();
    }
    this.embeddableDomains.add(embeddableDomainsItem);
    return this;
  }

   /**
   * A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded.
   * @return embeddableDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of strings that represent the URLs, or domains, in which Visier can be embedded.")

  public List<String> getEmbeddableDomains() {
    return embeddableDomains;
  }


  public void setEmbeddableDomains(List<String> embeddableDomains) {
    
    
    
    this.embeddableDomains = embeddableDomains;
  }


  public TenantManagementAPIGetResponseDTO customProperties(List<CustomPropertyDTO> customProperties) {
    
    
    
    
    this.customProperties = customProperties;
    return this;
  }

  public TenantManagementAPIGetResponseDTO addCustomPropertiesItem(CustomPropertyDTO customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

   /**
   * A set of key-value pairs that represent different customizable properties for the analytic tenant.
   * @return customProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A set of key-value pairs that represent different customizable properties for the analytic tenant.")

  public List<CustomPropertyDTO> getCustomProperties() {
    return customProperties;
  }


  public void setCustomProperties(List<CustomPropertyDTO> customProperties) {
    
    
    
    this.customProperties = customProperties;
  }


  public TenantManagementAPIGetResponseDTO ssoInstanceIssuers(List<String> ssoInstanceIssuers) {
    
    
    
    
    this.ssoInstanceIssuers = ssoInstanceIssuers;
    return this;
  }

  public TenantManagementAPIGetResponseDTO addSsoInstanceIssuersItem(String ssoInstanceIssuersItem) {
    if (this.ssoInstanceIssuers == null) {
      this.ssoInstanceIssuers = new ArrayList<>();
    }
    this.ssoInstanceIssuers.add(ssoInstanceIssuersItem);
    return this;
  }

   /**
   * A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant.
   * @return ssoInstanceIssuers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A comma-separated list of strings that represent the issuers for the SSO providers that can authenticate this tenant.")

  public List<String> getSsoInstanceIssuers() {
    return ssoInstanceIssuers;
  }


  public void setSsoInstanceIssuers(List<String> ssoInstanceIssuers) {
    
    
    
    this.ssoInstanceIssuers = ssoInstanceIssuers;
  }


  public TenantManagementAPIGetResponseDTO vanityUrlName(String vanityUrlName) {
    
    
    
    
    this.vanityUrlName = vanityUrlName;
    return this;
  }

   /**
   * The name of the administrating tenant used in Visier URLs.
   * @return vanityUrlName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the administrating tenant used in Visier URLs.")

  public String getVanityUrlName() {
    return vanityUrlName;
  }


  public void setVanityUrlName(String vanityUrlName) {
    
    
    
    this.vanityUrlName = vanityUrlName;
  }


  public TenantManagementAPIGetResponseDTO homeAnalysisId(String homeAnalysisId) {
    
    
    
    
    this.homeAnalysisId = homeAnalysisId;
    return this;
  }

   /**
   * The unique ID of the analysis that&#39;s displayed for this tenant when a user logs in.
   * @return homeAnalysisId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the analysis that's displayed for this tenant when a user logs in.")

  public String getHomeAnalysisId() {
    return homeAnalysisId;
  }


  public void setHomeAnalysisId(String homeAnalysisId) {
    
    
    
    this.homeAnalysisId = homeAnalysisId;
  }


  public TenantManagementAPIGetResponseDTO homeAnalysisByUserGroup(List<HomeAnalysisByUserGroupDTO> homeAnalysisByUserGroup) {
    
    
    
    
    this.homeAnalysisByUserGroup = homeAnalysisByUserGroup;
    return this;
  }

  public TenantManagementAPIGetResponseDTO addHomeAnalysisByUserGroupItem(HomeAnalysisByUserGroupDTO homeAnalysisByUserGroupItem) {
    if (this.homeAnalysisByUserGroup == null) {
      this.homeAnalysisByUserGroup = new ArrayList<>();
    }
    this.homeAnalysisByUserGroup.add(homeAnalysisByUserGroupItem);
    return this;
  }

   /**
   * A list of objects representing the analysis displayed to specific user groups when users log in.
   * @return homeAnalysisByUserGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing the analysis displayed to specific user groups when users log in.")

  public List<HomeAnalysisByUserGroupDTO> getHomeAnalysisByUserGroup() {
    return homeAnalysisByUserGroup;
  }


  public void setHomeAnalysisByUserGroup(List<HomeAnalysisByUserGroupDTO> homeAnalysisByUserGroup) {
    
    
    
    this.homeAnalysisByUserGroup = homeAnalysisByUserGroup;
  }


  public TenantManagementAPIGetResponseDTO clickThroughLink(String clickThroughLink) {
    
    
    
    
    this.clickThroughLink = clickThroughLink;
    return this;
  }

   /**
   * The custom URL to redirect users into your portal to see the relevant content. This URL is used for links that are shared by and with your users through the sharing capability or email content.
   * @return clickThroughLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom URL to redirect users into your portal to see the relevant content. This URL is used for links that are shared by and with your users through the sharing capability or email content.")

  public String getClickThroughLink() {
    return clickThroughLink;
  }


  public void setClickThroughLink(String clickThroughLink) {
    
    
    
    this.clickThroughLink = clickThroughLink;
  }


  public TenantManagementAPIGetResponseDTO clickThroughLinkEnabled(String clickThroughLinkEnabled) {
    
    
    
    
    this.clickThroughLinkEnabled = clickThroughLinkEnabled;
    return this;
  }

   /**
   * Whether the click-through link is enabled or disabled.
   * @return clickThroughLinkEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the click-through link is enabled or disabled.")

  public String getClickThroughLinkEnabled() {
    return clickThroughLinkEnabled;
  }


  public void setClickThroughLinkEnabled(String clickThroughLinkEnabled) {
    
    
    
    this.clickThroughLinkEnabled = clickThroughLinkEnabled;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TenantManagementAPIGetResponseDTO instance itself
   */
  public TenantManagementAPIGetResponseDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantManagementAPIGetResponseDTO tenantManagementAPIGetResponseDTO = (TenantManagementAPIGetResponseDTO) o;
    return Objects.equals(this.tenantCode, tenantManagementAPIGetResponseDTO.tenantCode) &&
        Objects.equals(this.tenantDisplayName, tenantManagementAPIGetResponseDTO.tenantDisplayName) &&
        Objects.equals(this.status, tenantManagementAPIGetResponseDTO.status) &&
        Objects.equals(this.provisionDate, tenantManagementAPIGetResponseDTO.provisionDate) &&
        Objects.equals(this.currentDataVersion, tenantManagementAPIGetResponseDTO.currentDataVersion) &&
        Objects.equals(this.dataVersionDate, tenantManagementAPIGetResponseDTO.dataVersionDate) &&
        Objects.equals(this.purchasedModules, tenantManagementAPIGetResponseDTO.purchasedModules) &&
        Objects.equals(this.industryCode, tenantManagementAPIGetResponseDTO.industryCode) &&
        Objects.equals(this.primaryBusinessLocation, tenantManagementAPIGetResponseDTO.primaryBusinessLocation) &&
        Objects.equals(this.canAdministerOtherTenants, tenantManagementAPIGetResponseDTO.canAdministerOtherTenants) &&
        Objects.equals(this.embeddableDomains, tenantManagementAPIGetResponseDTO.embeddableDomains) &&
        Objects.equals(this.customProperties, tenantManagementAPIGetResponseDTO.customProperties) &&
        Objects.equals(this.ssoInstanceIssuers, tenantManagementAPIGetResponseDTO.ssoInstanceIssuers) &&
        Objects.equals(this.vanityUrlName, tenantManagementAPIGetResponseDTO.vanityUrlName) &&
        Objects.equals(this.homeAnalysisId, tenantManagementAPIGetResponseDTO.homeAnalysisId) &&
        Objects.equals(this.homeAnalysisByUserGroup, tenantManagementAPIGetResponseDTO.homeAnalysisByUserGroup) &&
        Objects.equals(this.clickThroughLink, tenantManagementAPIGetResponseDTO.clickThroughLink) &&
        Objects.equals(this.clickThroughLinkEnabled, tenantManagementAPIGetResponseDTO.clickThroughLinkEnabled)&&
        Objects.equals(this.additionalProperties, tenantManagementAPIGetResponseDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCode, tenantDisplayName, status, provisionDate, currentDataVersion, dataVersionDate, purchasedModules, industryCode, primaryBusinessLocation, canAdministerOtherTenants, embeddableDomains, customProperties, ssoInstanceIssuers, vanityUrlName, homeAnalysisId, homeAnalysisByUserGroup, clickThroughLink, clickThroughLinkEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantManagementAPIGetResponseDTO {\n");
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
    sb.append("    tenantDisplayName: ").append(toIndentedString(tenantDisplayName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    provisionDate: ").append(toIndentedString(provisionDate)).append("\n");
    sb.append("    currentDataVersion: ").append(toIndentedString(currentDataVersion)).append("\n");
    sb.append("    dataVersionDate: ").append(toIndentedString(dataVersionDate)).append("\n");
    sb.append("    purchasedModules: ").append(toIndentedString(purchasedModules)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    primaryBusinessLocation: ").append(toIndentedString(primaryBusinessLocation)).append("\n");
    sb.append("    canAdministerOtherTenants: ").append(toIndentedString(canAdministerOtherTenants)).append("\n");
    sb.append("    embeddableDomains: ").append(toIndentedString(embeddableDomains)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    ssoInstanceIssuers: ").append(toIndentedString(ssoInstanceIssuers)).append("\n");
    sb.append("    vanityUrlName: ").append(toIndentedString(vanityUrlName)).append("\n");
    sb.append("    homeAnalysisId: ").append(toIndentedString(homeAnalysisId)).append("\n");
    sb.append("    homeAnalysisByUserGroup: ").append(toIndentedString(homeAnalysisByUserGroup)).append("\n");
    sb.append("    clickThroughLink: ").append(toIndentedString(clickThroughLink)).append("\n");
    sb.append("    clickThroughLinkEnabled: ").append(toIndentedString(clickThroughLinkEnabled)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantCode");
    openapiFields.add("tenantDisplayName");
    openapiFields.add("status");
    openapiFields.add("provisionDate");
    openapiFields.add("currentDataVersion");
    openapiFields.add("dataVersionDate");
    openapiFields.add("purchasedModules");
    openapiFields.add("industryCode");
    openapiFields.add("primaryBusinessLocation");
    openapiFields.add("canAdministerOtherTenants");
    openapiFields.add("embeddableDomains");
    openapiFields.add("customProperties");
    openapiFields.add("ssoInstanceIssuers");
    openapiFields.add("vanityUrlName");
    openapiFields.add("homeAnalysisId");
    openapiFields.add("homeAnalysisByUserGroup");
    openapiFields.add("clickThroughLink");
    openapiFields.add("clickThroughLinkEnabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TenantManagementAPIGetResponseDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TenantManagementAPIGetResponseDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TenantManagementAPIGetResponseDTO is not found in the empty JSON string", TenantManagementAPIGetResponseDTO.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("tenantCode") != null && !jsonObj.get("tenantCode").isJsonNull()) && !jsonObj.get("tenantCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantCode").toString()));
      }
      if ((jsonObj.get("tenantDisplayName") != null && !jsonObj.get("tenantDisplayName").isJsonNull()) && !jsonObj.get("tenantDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantDisplayName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("provisionDate") != null && !jsonObj.get("provisionDate").isJsonNull()) && !jsonObj.get("provisionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provisionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provisionDate").toString()));
      }
      if ((jsonObj.get("currentDataVersion") != null && !jsonObj.get("currentDataVersion").isJsonNull()) && !jsonObj.get("currentDataVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentDataVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentDataVersion").toString()));
      }
      if ((jsonObj.get("dataVersionDate") != null && !jsonObj.get("dataVersionDate").isJsonNull()) && !jsonObj.get("dataVersionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataVersionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataVersionDate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("purchasedModules") != null && !jsonObj.get("purchasedModules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchasedModules` to be an array in the JSON string but got `%s`", jsonObj.get("purchasedModules").toString()));
      }
      // validate the optional field `primaryBusinessLocation`
      if (jsonObj.get("primaryBusinessLocation") != null && !jsonObj.get("primaryBusinessLocation").isJsonNull()) {
        BusinessLocationDTO.validateJsonObject(jsonObj.getAsJsonObject("primaryBusinessLocation"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("embeddableDomains") != null && !jsonObj.get("embeddableDomains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `embeddableDomains` to be an array in the JSON string but got `%s`", jsonObj.get("embeddableDomains").toString()));
      }
      if (jsonObj.get("customProperties") != null && !jsonObj.get("customProperties").isJsonNull()) {
        JsonArray jsonArraycustomProperties = jsonObj.getAsJsonArray("customProperties");
        if (jsonArraycustomProperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customProperties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customProperties` to be an array in the JSON string but got `%s`", jsonObj.get("customProperties").toString()));
          }

          // validate the optional field `customProperties` (array)
          for (int i = 0; i < jsonArraycustomProperties.size(); i++) {
            CustomPropertyDTO.validateJsonObject(jsonArraycustomProperties.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ssoInstanceIssuers") != null && !jsonObj.get("ssoInstanceIssuers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssoInstanceIssuers` to be an array in the JSON string but got `%s`", jsonObj.get("ssoInstanceIssuers").toString()));
      }
      if ((jsonObj.get("vanityUrlName") != null && !jsonObj.get("vanityUrlName").isJsonNull()) && !jsonObj.get("vanityUrlName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vanityUrlName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vanityUrlName").toString()));
      }
      if ((jsonObj.get("homeAnalysisId") != null && !jsonObj.get("homeAnalysisId").isJsonNull()) && !jsonObj.get("homeAnalysisId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homeAnalysisId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homeAnalysisId").toString()));
      }
      if (jsonObj.get("homeAnalysisByUserGroup") != null && !jsonObj.get("homeAnalysisByUserGroup").isJsonNull()) {
        JsonArray jsonArrayhomeAnalysisByUserGroup = jsonObj.getAsJsonArray("homeAnalysisByUserGroup");
        if (jsonArrayhomeAnalysisByUserGroup != null) {
          // ensure the json data is an array
          if (!jsonObj.get("homeAnalysisByUserGroup").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `homeAnalysisByUserGroup` to be an array in the JSON string but got `%s`", jsonObj.get("homeAnalysisByUserGroup").toString()));
          }

          // validate the optional field `homeAnalysisByUserGroup` (array)
          for (int i = 0; i < jsonArrayhomeAnalysisByUserGroup.size(); i++) {
            HomeAnalysisByUserGroupDTO.validateJsonObject(jsonArrayhomeAnalysisByUserGroup.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("clickThroughLink") != null && !jsonObj.get("clickThroughLink").isJsonNull()) && !jsonObj.get("clickThroughLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickThroughLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickThroughLink").toString()));
      }
      if ((jsonObj.get("clickThroughLinkEnabled") != null && !jsonObj.get("clickThroughLinkEnabled").isJsonNull()) && !jsonObj.get("clickThroughLinkEnabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clickThroughLinkEnabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clickThroughLinkEnabled").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TenantManagementAPIGetResponseDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TenantManagementAPIGetResponseDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TenantManagementAPIGetResponseDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TenantManagementAPIGetResponseDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TenantManagementAPIGetResponseDTO>() {
           @Override
           public void write(JsonWriter out, TenantManagementAPIGetResponseDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TenantManagementAPIGetResponseDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TenantManagementAPIGetResponseDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TenantManagementAPIGetResponseDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TenantManagementAPIGetResponseDTO
  * @throws IOException if the JSON string is invalid with respect to TenantManagementAPIGetResponseDTO
  */
  public static TenantManagementAPIGetResponseDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TenantManagementAPIGetResponseDTO.class);
  }

 /**
  * Convert an instance of TenantManagementAPIGetResponseDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
