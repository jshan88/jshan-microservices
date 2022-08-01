package com.jshan.fraud;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class FraudCheckHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

    @Builder
    public FraudCheckHistory(Long customerId, Boolean isFraudster, LocalDateTime createdAt) {
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = createdAt;
    }
}
