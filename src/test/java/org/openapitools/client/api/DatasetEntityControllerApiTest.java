/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DatasetRequestBody;
import org.openapitools.client.model.EntityModelDataset;
import org.openapitools.client.model.PagedModelEntityModelDataset;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatasetEntityControllerApi
 */
@Ignore
public class DatasetEntityControllerApiTest {

    private final DatasetEntityControllerApi api = new DatasetEntityControllerApi();

    
    /**
     * 
     *
     * delete-dataset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemResourceDatasetDeleteTest() throws ApiException {
        String id = null;
        api.deleteItemResourceDatasetDelete(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get-dataset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionResourceDatasetGet1Test() throws ApiException {
        Integer page = null;
        Integer size = null;
        List<String> sort = null;
        PagedModelEntityModelDataset response = api.getCollectionResourceDatasetGet1(page, size, sort);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get-dataset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemResourceDatasetGetTest() throws ApiException {
        String id = null;
        EntityModelDataset response = api.getItemResourceDatasetGet(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * patch-dataset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchItemResourceDatasetPatchTest() throws ApiException {
        String id = null;
        DatasetRequestBody datasetRequestBody = null;
        EntityModelDataset response = api.patchItemResourceDatasetPatch(id, datasetRequestBody);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create-dataset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCollectionResourceDatasetPostTest() throws ApiException {
        DatasetRequestBody datasetRequestBody = null;
        EntityModelDataset response = api.postCollectionResourceDatasetPost(datasetRequestBody);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * update-dataset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putItemResourceDatasetPutTest() throws ApiException {
        String id = null;
        DatasetRequestBody datasetRequestBody = null;
        EntityModelDataset response = api.putItemResourceDatasetPut(id, datasetRequestBody);

        // TODO: test validations
    }
    
}
