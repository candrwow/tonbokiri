package cn.candrwow.tonbokiri.config;

/**
 * Created by candrwow on 2018/2/4.
 */

public class HttpResponseCode {
    public static final String HTTP_CODE_SUCCESS = "200";
    public static final String HTTP_CODE_INVALID_API_LOCATION = "400";
    public static final String HTTP_CODE_INVALID_OR_MISSING_API_KEY = "403";
    public static final String HTTP_CODE_INVALID_HTTP_METHOD = "405";
    public static final String HTTP_CODE_REQUEST_FAILED = "412";
    public static final String HTTP_CODE_INTERNAL_SERVER_ERROR = "500";
    public static final String HTTP_CODE_RATE_LIMIT_HIT = "503";
}
