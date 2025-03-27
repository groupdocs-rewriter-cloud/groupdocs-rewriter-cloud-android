package com.groupdocs.rewriter.cloud.sdk.android;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

import com.groupdocs.model.*;
import org.openapitools.client.api.ParaphraseApi;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static ApiClient defaultClient;
    private static ParaphraseApi apiInstance;

    private void setUpConfig() throws Exception {
        String basePath = "https://api.groupdocs.cloud/v2.0/rewriter";
        String cliendId = "YOUR_CLIENT_ID";
        String clientSecret = "YOUR_CLIENT_SECRET";

        defaultClient = new ApiClient(basePath, cliendId, clientSecret, null);
        apiInstance = new ParaphraseApi(defaultClient);

    }

    Button mToRewriteBtn;
    TextView mTranslatedTextView;
    TextInputEditText mTextToTranslateInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        setContentView(R.layout.activity_main);

        try {
            setUpConfig();
        } catch (Exception e) {
            e.printStackTrace();
        }

        mTextToRewritelateInputText = findViewById(R.id.text_to_rewrite_text_input);
        mToRewriteBtn = findViewById(R.id.rewrite_button);
        mRewritedTextView = findViewById(R.id.rewrite_text_view);

        mToRewriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    rewriteText(mTextToRewritelateInputText.getText().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void rewriteText(String text)  throws IOException {
        ParaphraseTextRequest  request = new ParaphraseTextRequest();
        request.setLanguage("en");
        request.addTextsItem("Text to rewrite");

        try {
            StatusResponse response = apiInstance.paraphraseTextPost(request);
            String response_id = response.getId();
            if (!response.getStatus().toString().equals("BadRequest")){
                while (true){
                    ParaphraseTextResponse paraphraseTextResponse = apiInstance.paraphraseTextRequestIdGet(response_id);
                    if (paraphraseTextResponse.getStatus().toString().equals("OK")) {
                        System.out.println(paraphraseTextResponse);
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling ParaphraseApi#paraphraseTextPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }

    }

}