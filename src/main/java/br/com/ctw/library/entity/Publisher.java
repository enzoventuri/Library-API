package br.com.ctw.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "publisher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(
            name = "name",
            unique = true,
            nullable = false
    )
    private String name;

    @OneToMany(
            mappedBy = "publisher",
            fetch = FetchType.LAZY
    )
    private Set<Book> books = new HashSet<>();
}
