/*
 * GroupDocs.Rewriter API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 25.3.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import com.groupdocs.ApiException;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FileApi
 */
@Disabled
public class FileApiTest {

    private final FileApi api = new FileApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fileUploadPostTest() throws ApiException {
        String format = null;
        File _file = null;
        String response = api.fileUploadPost(format, _file);
        // TODO: test validations
    }

}
