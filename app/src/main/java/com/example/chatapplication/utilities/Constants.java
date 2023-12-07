package com.example.chatapplication.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS = "users";
    public static final String KEY_Name = "name";
    public static final String KEY_EMAIL= "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PREFERENCE_NAME = "chatAppPreference";
    public static final String KEY_IS_SIGNED_IN = "isSignedIn";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_FCM_TOKEN ="fcmToken";
    public static final String KEY_USER = "user";
    public static final String KEY_COLLECTION_CHAT = "chat";
    public static final String KEY_SENDER_ID= "senderId";
    public static final String KEY_RECEIVER_ID = "receiverId";
    public static final String KEY_MESSAGE= "message";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String KEY_COLLECTION_CONVERSATIONS= "conversations ";
    public static final String KEY_SENDER_NAME= "senderName";
    public static final String KEY_RECEIVER_NAME= "receiverName";
    public static final String KEY_SENDER_IMAGE= "senderImage";
    public static final String KEY_RECEIVER_IMAGE= "receiverImage";
    public static final String KEY_LAST_MESSAGE= "lastMessage";
    public static final String KEY_AVAILABILITY= "availability";
    public static final String REMOTE_MSG_AUTHORIZATION= "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE= "Content-Type";
    public static final String REMOTE_MSG_DATA= "data";
    public static final String REMOTE_MSG_REGISTRATION_IDS= "registration_ids";

    public static HashMap<String,String> remoteMsgHeaders = null;


    public static HashMap<String,String> getremoteMsgHeaders(){
        if (remoteMsgHeaders == null){
            remoteMsgHeaders = new HashMap<>();
            remoteMsgHeaders.put(
                    REMOTE_MSG_AUTHORIZATION,
                    "key=AAAAgxM3JKI:APA91bHq7263dxIKP8MPVHZ-j6j7nmbbg0KtzgQqy1ieG2jiOeqid9qVZwA96ayjqDVW-PVE8qcVGI7dkOZIwY27yQpYQdT1tB6D9NmpM9wmRPegCyvi2cJKdIab8WhF5ONPg6lHPC-Z"
            );
            remoteMsgHeaders.put(
                    REMOTE_MSG_CONTENT_TYPE,
                    "application/json"
            );
        }
        return remoteMsgHeaders;
    }




}
