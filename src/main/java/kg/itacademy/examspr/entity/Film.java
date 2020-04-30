package kg.itacademy.examspr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "film")
public class Film extends EntityBase{
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "minutes", nullable = false)
    private Integer minutes;
    @Column(name = "min_age", nullable = false)
    private Integer minAge;
}
