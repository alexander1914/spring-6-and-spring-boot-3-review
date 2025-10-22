package github.alexander1914.springjpa.restfull.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/// Set up lombok in my entity like @Getter, @Setter, @NoArgsConstructor and @AllArgsConstructor

/// JPA Annotations:
/// @Entity: is an annotation that class can indicate that it is the entity,
/// and it can represent the tables in the relational database.
/// @Table: is an annotation that in JPA is used to define the database table mapping for an entity.
/// @Id: is an annotation that that annotation in JPA marks a field as the primary key of an entity.
/// @GeneratedValue: is an annotation that defines how primary key values are automatically generated.
/// @Column: is an annotation that is used to define column-specific attributes for an entity field in the database.

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
}
