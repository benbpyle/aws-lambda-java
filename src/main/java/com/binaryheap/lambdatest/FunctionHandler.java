package com.binaryheap.lambdatest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.binaryheap.lambdatest.models.InputEvent;


public class FunctionHandler implements RequestHandler<InputEvent, String> {
    public String handleRequest(InputEvent input, Context context) {
        return input.toString();
    }
}
