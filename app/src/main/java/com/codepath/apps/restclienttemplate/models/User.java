package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {
    public String name;
    public String stringName;
    public String profileImageURL;
    public String screenName;

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name"); //populate the fields
        user.stringName = jsonObject.getString("screen_name");
        user.profileImageURL = jsonObject.getString("profile_image_url_https");
        return user;

    }
}
