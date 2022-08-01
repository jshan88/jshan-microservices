package com.jshan.notification;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    private Long toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;

    @Builder
    public Notification(Long toCustomerId, String toCustomerEmail, String sender, String message, LocalDateTime sentAt) {
        this.toCustomerId = toCustomerId;
        this.toCustomerEmail = toCustomerEmail;
        this.sender = sender;
        this.message = message;
        this.sentAt = sentAt;
    }

}
