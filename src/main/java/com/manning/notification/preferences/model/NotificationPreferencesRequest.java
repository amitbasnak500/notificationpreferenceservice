  package com.manning.notification.preferences.model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class NotificationPreferencesRequest
{
    private String customerId;

    @Override
    public String toString()
    {
        return "NotificationPreferencesRequest{" +
                "customerId='" + customerId + '\'' +
                '}';
    }

}
