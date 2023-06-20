package kenjy.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Specialty extends BaseEntity {
    @Column(name = "description")
    private String description;
}
