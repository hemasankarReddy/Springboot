package com.mkyong;

import java.util.List;
import java.util.Map;

public class LogDataResponse {
    private String status;
    private List<Map<String,String>> columnsList;
    private List<String> records;
    private int error_code;
    private String errorType;
}
