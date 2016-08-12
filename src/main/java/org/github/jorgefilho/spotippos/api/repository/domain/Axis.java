package org.github.jorgefilho.spotippos.api.repository.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Axis.TABLE_NAME)
public class Axis implements Serializable {
    private static final long serialVersionUID = -3364480867236820750L;

    protected static final String TABLE_NAME = "axis";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private Integer x;

    @Column(nullable = false)
    private Integer y;