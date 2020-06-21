package com.blankshrimp.enhancedqqnotification.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import com.blankshrimp.enhancedqqnotification.R;

import androidx.core.app.NotificationCompat;

public class Notification {

    private static final String SPECIAL_CH_ID = "CH_1";
    private static final String GENERAL_CH_ID = "CH_2";
    private static final String GROUP_CH_ID = "CH_3";

    public static void createNotificationChannel(Context context) {

        // Special attention channel
        CharSequence name1 = context.getString(R.string.special_attention_channel);
        String description1 = context.getString(R.string.special_attention_channel_description);
        int importance1 = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel1 = new NotificationChannel(SPECIAL_CH_ID, name1, importance1);
        channel1.setDescription(description1);

        // General notification channel
        CharSequence name2 = context.getString(R.string.general_channel);
        String description2 = context.getString(R.string.general_channel_description);
        int importance2 = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel2 = new NotificationChannel(GENERAL_CH_ID, name2, importance2);
        channel2.setDescription(description2);

        // Group chat channel
        CharSequence name3 = context.getString(R.string.group_channel);
        String description3 = context.getString(R.string.group_channel_description);
        int importance3 = NotificationManager.IMPORTANCE_HIGH;
        NotificationChannel channel3 = new NotificationChannel(GROUP_CH_ID, name3, importance3);
        channel3.setDescription(description3);


        // Register the channel with the system; you can't change the importance
        // or other notification behaviors after this
        NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannel(channel1);
        notificationManager.createNotificationChannel(channel2);
        notificationManager.createNotificationChannel(channel3);

    }

    // private static Notification buildConversation() {
    //     NotificationCompat.MessagingStyle.Message message1 =
    //             new NotificationCompat.MessagingStyle.Message(messages[0].getText(),
    //                     messages[0].getTime(),
    //                     messages[0].getSender());
    //     NotificationCompat.MessagingStyle.Message message2 =
    //             new NotificationCompat.MessagingStyle.Message(messages[1].getText(),
    //                     messages[1].getTime(),
    //                     messages[1].getSender());
    //
    //     Notification notification = new NotificationCompat.Builder(context, CHANNEL_ID)
    //             .setSmallIcon(R.drawable.new_message)
    //             .setStyle(new NotificationCompat.MessagingStyle(resources.getString(R.string.reply_name))
    //                     .addMessage(message1)
    //                     .addMessage(message2))
    //             .build();
    // }
}
