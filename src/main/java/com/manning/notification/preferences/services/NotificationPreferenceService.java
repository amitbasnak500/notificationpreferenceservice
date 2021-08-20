package com.manning.notification.preferences.services;

import com.manning.notification.preferences.entities.NotificationPreferences;
import com.manning.notification.preferences.formatters.NotificationPreferencesFormatter;
import com.manning.notification.preferences.model.NotificationPreferencesRequest;
import com.manning.notification.preferences.model.NotificationPreferencesResponse;
import com.manning.notification.preferences.repositories.NotificationPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class NotificationPreferenceService {

    @Autowired
    NotificationPreferenceRepository notificationPreferenceRepository;

    @Autowired
    NotificationPreferencesFormatter notificationPreferencesFormatter;


    public NotificationPreferencesResponse getNotificationPreferences(@RequestBody NotificationPreferencesRequest notificationPreferenceRequest) {
        NotificationPreferences notificationPreference = notificationPreferenceRepository.findByCustomerid(notificationPreferenceRequest.getCustomerId());
        NotificationPreferencesResponse notificationPreferencesResponse = notificationPreferencesFormatter.formatNotificationResponse(notificationPreference);
        return notificationPreferencesResponse;
    }


}
