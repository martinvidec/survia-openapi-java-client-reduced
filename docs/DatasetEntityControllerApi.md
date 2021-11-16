# DatasetEntityControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteItemResourceDatasetDelete**](DatasetEntityControllerApi.md#deleteItemResourceDatasetDelete) | **DELETE** /datasets/{id} | 
[**getCollectionResourceDatasetGet1**](DatasetEntityControllerApi.md#getCollectionResourceDatasetGet1) | **GET** /datasets | 
[**getItemResourceDatasetGet**](DatasetEntityControllerApi.md#getItemResourceDatasetGet) | **GET** /datasets/{id} | 
[**patchItemResourceDatasetPatch**](DatasetEntityControllerApi.md#patchItemResourceDatasetPatch) | **PATCH** /datasets/{id} | 
[**postCollectionResourceDatasetPost**](DatasetEntityControllerApi.md#postCollectionResourceDatasetPost) | **POST** /datasets | 
[**putItemResourceDatasetPut**](DatasetEntityControllerApi.md#putItemResourceDatasetPut) | **PUT** /datasets/{id} | 


<a name="deleteItemResourceDatasetDelete"></a>
# **deleteItemResourceDatasetDelete**
> deleteItemResourceDatasetDelete(id)



delete-dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DatasetEntityControllerApi apiInstance = new DatasetEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteItemResourceDatasetDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetEntityControllerApi#deleteItemResourceDatasetDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**404** | Not Found |  -  |

<a name="getCollectionResourceDatasetGet1"></a>
# **getCollectionResourceDatasetGet1**
> PagedModelEntityModelDataset getCollectionResourceDatasetGet1(page, size, sort)



get-dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DatasetEntityControllerApi apiInstance = new DatasetEntityControllerApi(defaultClient);
    Integer page = 0; // Integer | Zero-based page index (0..N)
    Integer size = 20; // Integer | The size of the page to be returned
    List<String> sort = Arrays.asList(); // List<String> | Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.
    try {
      PagedModelEntityModelDataset result = apiInstance.getCollectionResourceDatasetGet1(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetEntityControllerApi#getCollectionResourceDatasetGet1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Zero-based page index (0..N) | [optional] [default to 0]
 **size** | **Integer**| The size of the page to be returned | [optional] [default to 20]
 **sort** | [**List&lt;String&gt;**](String.md)| Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported. | [optional]

### Return type

[**PagedModelEntityModelDataset**](PagedModelEntityModelDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/x-spring-data-compact+json, text/uri-list

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getItemResourceDatasetGet"></a>
# **getItemResourceDatasetGet**
> EntityModelDataset getItemResourceDatasetGet(id)



get-dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DatasetEntityControllerApi apiInstance = new DatasetEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      EntityModelDataset result = apiInstance.getItemResourceDatasetGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetEntityControllerApi#getItemResourceDatasetGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**EntityModelDataset**](EntityModelDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |

<a name="patchItemResourceDatasetPatch"></a>
# **patchItemResourceDatasetPatch**
> EntityModelDataset patchItemResourceDatasetPatch(id, datasetRequestBody)



patch-dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DatasetEntityControllerApi apiInstance = new DatasetEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    DatasetRequestBody datasetRequestBody = new DatasetRequestBody(); // DatasetRequestBody | 
    try {
      EntityModelDataset result = apiInstance.patchItemResourceDatasetPatch(id, datasetRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetEntityControllerApi#patchItemResourceDatasetPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **datasetRequestBody** | [**DatasetRequestBody**](DatasetRequestBody.md)|  |

### Return type

[**EntityModelDataset**](EntityModelDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |

<a name="postCollectionResourceDatasetPost"></a>
# **postCollectionResourceDatasetPost**
> EntityModelDataset postCollectionResourceDatasetPost(datasetRequestBody)



create-dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DatasetEntityControllerApi apiInstance = new DatasetEntityControllerApi(defaultClient);
    DatasetRequestBody datasetRequestBody = new DatasetRequestBody(); // DatasetRequestBody | 
    try {
      EntityModelDataset result = apiInstance.postCollectionResourceDatasetPost(datasetRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetEntityControllerApi#postCollectionResourceDatasetPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetRequestBody** | [**DatasetRequestBody**](DatasetRequestBody.md)|  |

### Return type

[**EntityModelDataset**](EntityModelDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="putItemResourceDatasetPut"></a>
# **putItemResourceDatasetPut**
> EntityModelDataset putItemResourceDatasetPut(id, datasetRequestBody)



update-dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetEntityControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DatasetEntityControllerApi apiInstance = new DatasetEntityControllerApi(defaultClient);
    String id = "id_example"; // String | 
    DatasetRequestBody datasetRequestBody = new DatasetRequestBody(); // DatasetRequestBody | 
    try {
      EntityModelDataset result = apiInstance.putItemResourceDatasetPut(id, datasetRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetEntityControllerApi#putItemResourceDatasetPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **datasetRequestBody** | [**DatasetRequestBody**](DatasetRequestBody.md)|  |

### Return type

[**EntityModelDataset**](EntityModelDataset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**204** | No Content |  -  |

