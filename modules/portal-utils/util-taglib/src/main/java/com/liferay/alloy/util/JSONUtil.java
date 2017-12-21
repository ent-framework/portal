package com.liferay.alloy.util;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



















public class JSONUtil
{
  public static JSONArray getJSONArray(JSONObject json, String key)
  {
    try
    {
      if (json.has(key)) {
        return json.getJSONArray(key);
      }
    }
    catch (JSONException e) {
      e.printStackTrace();
    }
    
    return null;
  }
  
  public static JSONObject getJSONObject(JSONObject json, String key) {
    try {
      if (json.has(key)) {
        return json.getJSONObject(key);
      }
    }
    catch (JSONException e) {
      e.printStackTrace();
    }
    
    return null;
  }
  
  public static List<String> getList(JSONObject json, String key) {
    List<String> out = new ArrayList();
    try
    {
      JSONArray jsonArray = getJSONArray(json, key);
      
      if (jsonArray != null) {
        for (int i = 0; i < jsonArray.length(); i++) {
          Object value = jsonArray.get(i);
          
          if (value != null) {
            out.add((String)value);
          }
        }
      }
    }
    catch (JSONException e) {
      e.printStackTrace();
    }
    
    return out;
  }
  
  public static String getString(JSONObject json, String key) {
    try {
      if (json.has(key)) {
        return json.getString(key);
      }
    }
    catch (JSONException e) {
      e.printStackTrace();
    }
    
    return null;
  }
}
