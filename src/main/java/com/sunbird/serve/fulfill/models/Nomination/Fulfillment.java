package com.sunbird.serve.fulfill.models.Nomination;

import com.sunbird.serve.fulfill.models.enums.FulfillmentStatus;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fulfillment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String needId;
    private String needPlanId;
    private String assignedUserId;
    private String coordUserId;

    @Enumerated(EnumType.STRING)
    private FulfillmentStatus fulfillmentStatus;


    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;
}
