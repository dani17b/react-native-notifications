package com.wix.reactnativenotifications.core.notification;

import android.content.Context;
import android.os.Bundle;

import com.wix.reactnativenotifications.core.AppLaunchHelper;
import com.wix.reactnativenotifications.core.AppLifecycleFacade;
import com.wix.reactnativenotifications.core.notification.IPushNotification;

public interface INotificationsApplication {
    IPushNotification getPushNotification(Context context, Bundle bundle, AppLifecycleFacade facade, AppLaunchHelper defaultAppLaunchHelper) throws IPushNotification.InvalidNotificationException;
}