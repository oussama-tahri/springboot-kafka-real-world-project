package com.tahrioussama.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recentchanger")
@Getter @Setter
public class WikimediaData {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
When working with PostgresSQL we may, periodically, need to store a string with an arbitrary length.

For this, PostgreSQL provides three character types:

CHAR(n)
VARCHAR(n)
TEXT
Unfortunately, the TEXT type is not part of the types that are managed by the SQL standard. This means that if we want to use JPA annotations in our persistence entities, we may have a problem.

This is because the JPA specification makes use of the SQL standard. Consequently, it doesn’t define a simple way to handle this type of object using, for example, a @Text annotation.

Luckily, we have a couple of possibilities for managing the TEXT data type for a PostgreSQL database:

We can use the @Lob annotation
Alternatively, we can also use the @Column annotation, combined with the columnDefinition attribute
*/
    @Column(columnDefinition = "TEXT")
    private String wikiEventData;
}
