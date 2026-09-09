package br.com.ctw.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "review")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(
            name = "comment",
            unique = true,
            nullable = false
    )
    private String comment;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
