package com.nrkt.springbootdatarestexample.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(force = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product extends RepresentationModel<Product> implements Serializable {

    @Transient
    @Getter(AccessLevel.NONE)
    @JsonIgnore
    final List<Link> links;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotBlank
    String name;

    @NotNull
    Double price;

    @JsonIgnore
    @Column(columnDefinition = "boolean default true")
    Boolean status;
}
