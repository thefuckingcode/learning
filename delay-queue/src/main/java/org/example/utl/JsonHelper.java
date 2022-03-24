package org.example.utl;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String marshal(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (Exception e) {
            throw new RuntimeException("failed to marshal");
        }
    }

    public static <T> T unMarshal(String value, Class<T> tClass) {
        try {
            return objectMapper.readValue(value, tClass);
        } catch (Exception e) {
            throw new RuntimeException("failed to unmarshal");
        }
    }
}
