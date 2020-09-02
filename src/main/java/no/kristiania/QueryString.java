package no.kristiania;

import java.util.HashMap;
import java.util.Map;

public class QueryString {

    private final Map<String, String> parameters = new HashMap<>();

    public QueryString(String queryString) {
        for (String parameter : queryString.split("&")) {
            int equalPos = parameter.indexOf('=');
            String parameterName = parameter.substring(0, equalPos);
            String parameterValue = parameter.substring(equalPos + 1);
            parameters.put(parameterName, parameterValue);
        }
    }

    public String getParameter(String parameterName) {
        return parameters.get(parameterName);
    }
}
